package com.c1z4.rentcar.rent.model.dao;

import com.c1z4.rentcar.rent.model.dto.RentHistoryDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RentHistoryDAO {
    List<RentHistoryDTO> findRentHistoryByMember(String memberName);

    List<RentHistoryDTO> findRentHistoryByCar(int carCode);
}

