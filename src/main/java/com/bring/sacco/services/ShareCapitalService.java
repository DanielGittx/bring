package com.bring.sacco.services;


import com.bring.sacco.entities.Account;
import com.bring.sacco.entities.Member;
import com.bring.sacco.entities.ShareCapital;
import com.bring.sacco.exception_handlers.ResourceNotFoundException;
import com.bring.sacco.repositories.AccountRepository;
import com.bring.sacco.repositories.MemberRepository;
import com.bring.sacco.repositories.ShareCapitalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShareCapitalService {

    private final ShareCapitalRepository shareCapitalRepository;
    private final MemberRepository memberRepository;
    private final AccountRepository accountRepository;

    public ShareCapitalService(ShareCapitalRepository shareCapitalRepository, MemberRepository memberRepository, AccountRepository accountRepository) {
        this.shareCapitalRepository = shareCapitalRepository;
        this.memberRepository = memberRepository;
        this.accountRepository = accountRepository;
    }

    public ShareCapital createShareCapital(ShareCapital shareCapital){
        Optional<Member> member = memberRepository.findById(shareCapital.getMemberId());
        if (member.isPresent()){
            Optional<Account> account = accountRepository.findById(shareCapital.getAccountId());
            if (!account.isPresent()){
                throw new ResourceNotFoundException("Account Id not found");
            }
            return shareCapitalRepository.save(shareCapital);
        }
        else {
            throw new ResourceNotFoundException("Member not found");
        }

    }

    public ShareCapital updateShareCapital(ShareCapital dto){
        Optional<ShareCapital> shareCapital = shareCapitalRepository.findById(dto.getShareCapitalId());
        if (!shareCapital.isPresent()){
            throw new ResourceNotFoundException("Share capital Id does not exist");
        }

        return shareCapitalRepository.save(shareCapital.get());
    }

    public List<ShareCapital> getAll() {
        return shareCapitalRepository.findAll();
    }

    public void deleteById(long id) {
        shareCapitalRepository.deleteById(id);
    }
}

