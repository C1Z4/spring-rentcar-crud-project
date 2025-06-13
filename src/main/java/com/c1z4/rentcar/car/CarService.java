package com.c1z4.rentcar.car;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarMapper carMapper;

    public CarService(CarMapper carMapper) {
        this.carMapper = carMapper;
    }

    // 차량 전체 조회
    public List<CarDTO> findAllCar() {
        return carMapper.findAllCar();
    }

    //차량 상세 조회
    public CarDTO findCarByCode(int carCode) {
        return carMapper.findCarByCode(carCode);
    }


    // 차량 등록
    public void registCar(CarDTO car) {
        carMapper.registCar(car);
    }

    // 차량 수정
    public void modifyCar(CarDTO car) {
        carMapper.modifyCar(car);
    }

    // 차량 삭제
    public void deleteCar(int carCode) {
        carMapper.deleteCar(carCode);
    }

}
