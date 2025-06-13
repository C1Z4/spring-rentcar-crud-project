package com.c1z4.rentcar.car;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("")
    public String carMain() {
        return "car/main";
    }

    /* 차량 전체 조회 */
    @GetMapping("/list")
    public String findCarList(Model model) {
        List<CarDTO> carList = carService.findAllCar();
        model.addAttribute("carList", carList);
        return "car/list";
    }

    /* 차량 상세 조회 */
    @GetMapping("/select/{carCode}")
    public String selectCar(@PathVariable int carCode, Model model) {
        CarDTO car = carService.findCarByCode(carCode);
        model.addAttribute("car", car);
        model.addAttribute("likeCount", 0);
        return "car/select";
    }


    /* 차량 등록 */
    @GetMapping("/register")
    public String registPage() {
        return "car/regist";
    }

    @PostMapping("/register")
    public String registCar(CarDTO car, RedirectAttributes rttr) {
        carService.registCar(car);
        rttr.addFlashAttribute("message", "차량이 성공적으로 등록되었습니다!");
        return "redirect:/car/list";
    }


    /* 차량 수정 */
    @GetMapping("/modify/{carCode}")
    public String modifyPage(@PathVariable int carCode, Model model) {
        CarDTO car = carService.findCarByCode(carCode);
        model.addAttribute("car", car);
        return "car/modify";
    }

    @PostMapping("/modify")
    public String modifyCar(CarDTO car, RedirectAttributes rttr) {
        carService.modifyCar(car);
        rttr.addFlashAttribute("message", "차량 정보가 성공적으로 수정되었습니다!");
        return "redirect:/car/select/" + car.getCarCode();
    }


    /* 차량 삭제 */
    @GetMapping("/delete-confirm/{carCode}") // 삭제 확인 페이지를 위한 GET 요청
    public String deleteConfirmPage(@PathVariable int carCode, Model model) {
        CarDTO car = carService.findCarByCode(carCode);
        model.addAttribute("car", car); // car 객체를 모델에 추가
        return "car/delete";
    }

    @PostMapping("/delete/{carCode}")
    public String deleteCar(@PathVariable int carCode, RedirectAttributes rttr) {
        carService.deleteCar(carCode);
        rttr.addFlashAttribute("message", "차량이 성공적으로 삭제되었습니다!");
        return "redirect:/car/list";
    }
}
