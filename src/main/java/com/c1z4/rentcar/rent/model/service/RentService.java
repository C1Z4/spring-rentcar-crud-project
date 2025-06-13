package com.c1z4.rentcar.rent.model.service;

import com.c1z4.rentcar.rent.model.dao.RentMapper;
import com.c1z4.rentcar.rent.model.dto.CarDTO;
import com.c1z4.rentcar.rent.model.dto.MemberDTO;
import com.c1z4.rentcar.rent.model.dto.RentHistoryDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentService {

    private final RentMapper rentMapper;

    public RentService(RentMapper rentMapper) {
        this.rentMapper = rentMapper;
    }

    public List<RentHistoryDTO> findRentHistory() {
        return rentMapper.findRentHistory();
    }

    public List<MemberDTO> findMemberList() {
        return rentMapper.findMemberList();
    }

    public List<CarDTO> findCarList() {
        return rentMapper.findCarList();
    }

    public void rentCar(RentHistoryDTO rentHistory) {
        rentMapper.rentCar(rentHistory);
    }

    public void returnCar(int memberCode, int carCode) {
        rentMapper.returnCar(memberCode, carCode);
    }
}
