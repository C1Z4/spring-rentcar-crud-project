package com.c1z4.rentcar.member.controller;

import com.c1z4.rentcar.member.model.dto.LevelDTO;
import com.c1z4.rentcar.member.model.dto.MemberDTO;
import com.c1z4.rentcar.member.model.dto.SearchCriteria;
import com.c1z4.rentcar.member.model.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // 회원 홈 페이지
    @GetMapping("")
    public String memberHome() {
        return "member/home";
    }

    // 전체 회원 조회
    @GetMapping("/all-member-list")
    public String getAllMemberList(Model model) {

        List<MemberDTO> memberList = memberService.getAllMemberList();

        model.addAttribute("memberList", memberList);

        return "member/all-member-list";
    }

    // 특정 회원 조회(검색) 페이지
    @GetMapping("/search")
    public void searchPage() {
    }

    // 특정 회원 조회(검색)
    @PostMapping("/search")
    public String searchMember(Model model, SearchCriteria searchCriteria) {

        List<MemberDTO> memberList = memberService.searchMemberWithLevel(searchCriteria);

        model.addAttribute("memberList", memberList);

        return "member/search";
    }

    // 회원 등록 페이지
    @GetMapping("/register")
    public void registerPage(Model model) {
        List<MemberDTO> memberList = memberService.getAllMemberList();

        model.addAttribute("memberList", memberList);
    }

    // 회원 등록
    @PostMapping("/register")
    public String registerMember(MemberDTO newMember) {

        memberService.registerMember(newMember);

        return "redirect:/member/register";
    }

    // 회원 정보 수정 페이지
    @GetMapping("/modify")
    public void modifyPage(Model model) {
        List<MemberDTO> memberList = memberService.getAllMemberList();

        model.addAttribute("memberList", memberList);
    }

    // 회원 정보 수정
    @PostMapping("/modify")

    public String modifyMember(MemberDTO modifiedMember) {
        memberService.modifyMember(modifiedMember);

        return "redirect:/member/modify";
    }

    // 등급 조회
    @GetMapping(value = "/level", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<LevelDTO> findCategoryList() {
        return memberService.getAllLevel();
    }

}
