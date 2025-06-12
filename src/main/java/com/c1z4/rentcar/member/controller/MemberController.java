package com.c1z4.rentcar.member.controller;

import com.c1z4.rentcar.member.model.dto.MemberDTO;
import com.c1z4.rentcar.member.model.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // 멤버 홈
    @GetMapping("")
    public String memberHome() {
        return "member/home";
    }

    // 전체 멤버 조회
    @GetMapping("/all-member-list")
    public String getAllMemberList(Model model) {

        List<MemberDTO> memberList = memberService.getAllMemberList();

        model.addAttribute("memberList", memberList);

        return "member/all-member-list";
    }

}
