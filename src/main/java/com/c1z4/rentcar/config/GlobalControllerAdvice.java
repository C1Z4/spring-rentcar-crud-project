package com.c1z4.rentcar.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import jakarta.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalControllerAdvice {

    private static final Map<String, PageInfo> PAGE_INFO_MAP = new HashMap<>();

    static {
        PAGE_INFO_MAP.put("/member", new PageInfo("회원 관리", "회원 관리"));
        PAGE_INFO_MAP.put("/car", new PageInfo("차량 관리", "차량 관리"));
        PAGE_INFO_MAP.put("/rent", new PageInfo("대여 이력 관리", "대여 이력 관리"));
        PAGE_INFO_MAP.put("/like", new PageInfo("회원별 좋아요", "회원별 좋아요"));
    }

    @ModelAttribute("pageTitle")
    public String addPageTitle(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        PageInfo pageInfo = PAGE_INFO_MAP.get(requestURI);
        return pageInfo != null ? pageInfo.getTitle() : "차량 대여 시스템";
    }

    @ModelAttribute("breadcrumb")
    public String addBreadcrumb(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        PageInfo pageInfo = PAGE_INFO_MAP.get(requestURI);
        return pageInfo != null ? pageInfo.getBreadcrumb() : null;
    }

    private static class PageInfo {
        private final String title;
        private final String breadcrumb;

        public PageInfo(String title, String breadcrumb) {
            this.title = title;
            this.breadcrumb = breadcrumb;
        }

        public String getTitle() {
            return title;
        }

        public String getBreadcrumb() {
            return breadcrumb;
        }
    }
}