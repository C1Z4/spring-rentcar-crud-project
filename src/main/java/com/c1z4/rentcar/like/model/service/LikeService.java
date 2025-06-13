package com.c1z4.rentcar.like.model.service;

import com.c1z4.rentcar.like.model.dao.LikeMapper;
import com.c1z4.rentcar.like.model.dto.CarLikeDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class LikeService {

    private final LikeMapper likeMapper;

    public LikeService(LikeMapper likeMapper) {
        this.likeMapper = likeMapper;
    }

    public List<CarLikeDTO> getCarsWithLike(int memberCode) {

        return likeMapper.selectCarsWithLike(memberCode);
    }

    @Transactional
    public void toggleLike(int memberCode, int carCode, boolean liked) {

        if (liked) {
            likeMapper.deleteLike(Map.of("memberCode", memberCode, "carCode", carCode));
        } else {
            likeMapper.insertLike(Map.of("memberCode", memberCode, "carCode", carCode));
        }
    }
}
