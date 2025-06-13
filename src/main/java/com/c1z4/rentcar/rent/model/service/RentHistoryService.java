package com.c1z4.rentcar.rent.model.service;

import com.c1z4.rentcar.rent.model.dao.RentHistoryDAO;
import com.c1z4.rentcar.rent.model.dto.RentHistoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentHistoryService {

    @Autowired
    private RentHistoryDAO rentHistoryDAO;

    public List<RentHistoryDTO> getRentHistoryByMember(String memberName) {
        return rentHistoryDAO.findRentHistoryByMember(memberName);
    }
    public List<RentHistoryDTO> getRentHistoryByCar(int carCode) {
        return rentHistoryDAO.findRentHistoryByCar(carCode);
    }
}
