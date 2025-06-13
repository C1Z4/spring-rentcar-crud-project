package com.c1z4.rentcar.member.model.dao;

import com.c1z4.rentcar.member.model.dto.LevelDTO;
import com.c1z4.rentcar.member.model.dto.MemberDTO;
import com.c1z4.rentcar.member.model.dto.SearchCriteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    List<MemberDTO> getAllMemberWithLevel();

    List<MemberDTO> searchMemberWithLevel(SearchCriteria searchCriteria);

    void registerMember(MemberDTO newMember);

    void modifyMember(MemberDTO modifiedMember);

    List<LevelDTO> getAllLevel();

    void deleteMember(int memberCode);
}
