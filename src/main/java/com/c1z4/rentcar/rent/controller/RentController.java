package com.c1z4.rentcar.rent.controller;

import com.c1z4.rentcar.rent.model.dao.RentMapper;
import com.c1z4.rentcar.rent.model.dto.CarDTO;
import com.c1z4.rentcar.rent.model.dto.MemberDTO;
import com.c1z4.rentcar.rent.model.dto.RentHistoryDTO;
import com.c1z4.rentcar.rent.model.dto.RentHistorySimpleDTO;
import com.c1z4.rentcar.rent.model.service.RentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/rent")
public class RentController {

    private final RentService rentService;

    public RentController(RentService rentService) {
        this.rentService = rentService;
    }

    // 대여 이력 조회
    @GetMapping("/history")
    public String findRentHistory (Model model) {

        List<RentHistoryDTO> rentHistoryList = rentService.findRentHistory();

        model.addAttribute("rentHistoryList", rentHistoryList);

        return "rent/history";
    }

    // 회원 목록 및 차량 조회
    @GetMapping("/rent")
    public String findMemberAndCarList(Model model) {

        List<MemberDTO> memberList = rentService.findMemberList();
        List<CarDTO> carList = rentService.findCarList();

        model.addAttribute("memberList", memberList);
        model.addAttribute("carList", carList);

        return "rent/rent";
    }

    // 대여하기
    @PostMapping("/rent")
    public String rentCar(@ModelAttribute RentHistorySimpleDTO rentHistorySimple,
                          RedirectAttributes rttr) {
        rentService.rentCar(rentHistorySimple);
        rttr.addFlashAttribute("successMessage", "차량 대여 성공!");
        rttr.addFlashAttribute("failMessage", "차량 대여 실패\n대여가 가능한 차량 번호를 입력해주세요.");

        return "redirect:/rent/history";
    }

    // 반납하기
    @PostMapping("/return")
    public String returnCar(@RequestParam int memberCode,
                            @RequestParam int carCode,
                            RedirectAttributes rttr) {
        rentService.returnCar(memberCode, carCode);
        rttr.addFlashAttribute("successMessage", "반납 완료!");
        return "redirect:/rent/history";
    }
}
