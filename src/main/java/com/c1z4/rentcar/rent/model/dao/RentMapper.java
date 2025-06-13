package com.c1z4.rentcar.rent.model.dao;

import com.c1z4.rentcar.rent.model.dto.CarDTO;
import com.c1z4.rentcar.rent.model.dto.MemberDTO;
import com.c1z4.rentcar.rent.model.dto.RentHistoryDTO;
import com.c1z4.rentcar.rent.model.dto.RentHistorySimpleDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RentMapper {
    List<RentHistoryDTO> findRentHistory();

    List<MemberDTO> findMemberList();

    List<CarDTO> findCarList();

    void rentCar(RentHistorySimpleDTO rentHistory);

    void returnCar(int memberCode, int carCode);

    List<RentHistoryDTO> searchDelayStatus(boolean delayStatus);
}
