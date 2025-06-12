package com.c1z4.rentcar.member.model.dao;

import com.c1z4.rentcar.member.model.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    List<MemberDTO> getAllMemberWithLevel();
}
