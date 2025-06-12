package com.c1z4.rentcar.member.model.service;

import com.c1z4.rentcar.member.model.dao.MemberMapper;
import com.c1z4.rentcar.member.model.dto.MemberDTO;
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
}
