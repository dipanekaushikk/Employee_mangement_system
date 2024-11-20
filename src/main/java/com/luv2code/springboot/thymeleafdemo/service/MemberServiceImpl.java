package com.luv2code.springboot.thymeleafdemo.service;

import com.luv2code.springboot.thymeleafdemo.dao.MembersRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
     private MembersRepository membersRepository;
     public MemberServiceImpl(MembersRepository theMembersRepository){
         membersRepository=theMembersRepository;
     }
    @Override
    public Integer findEmployeeIdByUsername(String username) {
        return membersRepository.findEmployeeIdByUsernameNative(username);
    }
}
