package com.c1z4.rentcar.like.model.dao;

import com.c1z4.rentcar.like.model.dto.CarLikeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface LikeMapper {

    List<CarLikeDTO> selectCarsWithLike(int memberCode);

    void insertLike(Map<String, Integer> memberCode);

    void deleteLike(Map<String, Integer> memberCode);
}
