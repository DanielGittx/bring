package com.bring.sacco.services;

import com.bring.sacco.entities.Member;
import com.bring.sacco.repositories.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    public List<Member> getAll(){
        return memberRepository.findAll();
    }


}
