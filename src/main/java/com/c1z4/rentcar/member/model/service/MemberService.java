package com.c1z4.rentcar.member.model.service;

import com.c1z4.rentcar.member.model.dao.MemberMapper;
import com.c1z4.rentcar.member.model.dto.LevelDTO;
import com.c1z4.rentcar.member.model.dto.MemberDTO;
import com.c1z4.rentcar.member.model.dto.SearchCriteria;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private final MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public List<MemberDTO> getAllMemberList() {
        return memberMapper.getAllMemberWithLevel();
    }

    public List<MemberDTO> searchMemberWithLevel(SearchCriteria searchCriteria) {
        return memberMapper.searchMemberWithLevel(searchCriteria);
    }

    public void registerMember(MemberDTO newMember) {
        memberMapper.registerMember(newMember);
    }

    public void modifyMember(MemberDTO modifiedMember) {
        memberMapper.modifyMember(modifiedMember);
    }

    public List<LevelDTO> getAllLevel() {
        return memberMapper.getAllLevel();
    }

    public void deleteMember(int memberCode) {
        memberMapper.deleteMember(memberCode);
    }
}
