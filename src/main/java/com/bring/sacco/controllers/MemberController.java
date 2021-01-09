package com.bring.sacco.controllers;

import com.bring.sacco.entities.Member;
import com.bring.sacco.repositories.MemberRepository;
import com.bring.sacco.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("member")
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/create")
    public Member createMember(@RequestBody Member member) {
        return memberService.createMember(member);
    }

    @GetMapping("/all")
    public List<Member> getAll() {
        return memberService.getAll();
    }

    @GetMapping("find/{id}")
    public Optional<Member> getMemberById(@PathVariable ("id") long memberId) {
        return memberRepository.findById(memberId);
    }
}
