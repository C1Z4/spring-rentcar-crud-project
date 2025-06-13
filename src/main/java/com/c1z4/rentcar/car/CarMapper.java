package com.c1z4.rentcar.car;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarMapper {

    // 차량 전체 조회
    List<CarDTO> findAllCar();

    // 차량 상세 조회
    CarDTO findCarByCode(int carCode);

    // 차량 등록
    void registCar(CarDTO car);

    // 차량 수정
    void modifyCar(CarDTO car);

    // 차량 삭제
    void deleteCar(int carCode);
}
