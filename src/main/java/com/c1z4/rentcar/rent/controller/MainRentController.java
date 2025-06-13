package com.c1z4.rentcar.rent.controller;

import com.c1z4.rentcar.rent.model.dto.RentHistoryDTO;
import com.c1z4.rentcar.rent.model.service.RentHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/rent")
public class MainRentController {

    @Autowired
    private RentHistoryService rentHistoryService;


    @GetMapping("/history/home")
    public void home() {
    }

    @GetMapping("/history/byMember")
    public String byMember() {
        return "rent/history/byMember";
    }

    @GetMapping("/history/result")
    public String getMemberHistory(@RequestParam String memberName, Model model) {
        List<RentHistoryDTO> historyList = rentHistoryService.getRentHistoryByMember(memberName);
        model.addAttribute("historyList", historyList);

        System.out.println(historyList);
        return "rent/history/result";
    }

    @GetMapping("/history/byCar")
    public String byCar() {
        return "rent/history/byCar";
    }

    @GetMapping("/history/carResult")
    public String getCarHistory(@RequestParam int carCode, Model model) {
        List<RentHistoryDTO> historyList = rentHistoryService.getRentHistoryByCar(carCode);
        model.addAttribute("historyList",historyList);
        return "rent/history/carResult";
    }

}
