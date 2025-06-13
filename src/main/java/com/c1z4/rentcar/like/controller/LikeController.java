package com.c1z4.rentcar.like.controller;

import com.c1z4.rentcar.like.model.service.LikeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/like")
public class LikeController {

    private final LikeService likeService;

    public LikeController(LikeService likeService) {
        this.likeService = likeService;
    }

    @GetMapping("/menu")
    public String likePage() {
        return "like/menu";
    }

    @GetMapping("/member")
    public String memberPage() {
        return "like/member";
    }

    @GetMapping("/member/list")
    public String list(@RequestParam int memberCode, Model model) {

        model.addAttribute("cars", likeService.getCarsWithLike(memberCode));
        model.addAttribute("memberCode", memberCode);

        return "like/member";
    }

    @PostMapping("/toggle")
    @ResponseBody
    public Map<String, Object> toggleLike(@RequestParam int memberCode,
                                          @RequestParam int carCode,
                                          @RequestParam boolean liked) {

        likeService.toggleLike(memberCode, carCode, liked);

        String message = liked ? "좋아요를 취소했습니다" : "좋아요를 눌렀습니다";
        Map<String, Object> response = new HashMap<>();

        response.put("result", "success");
        response.put("message", message);

        return response;
    }
}
