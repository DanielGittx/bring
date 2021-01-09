package com.bring.sacco.repositories;

import com.bring.sacco.entities.ShareCapital;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShareCapitalRepository extends JpaRepository<ShareCapital, Long> {
    List<ShareCapital> findAllById(long id);
//    List<ShareCapital>findAllByMember(Member member);
//    List<ShareCapital>findAllByAccountIdNo(long accountIdNo);
//    List<ShareCapital>findAllByAmountReceived(int amountReceived);
//    List<ShareCapital>findAllByIdAndAmountReceived(long id, int amountReceived);
}