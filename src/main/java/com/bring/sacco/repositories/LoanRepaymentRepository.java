package com.bring.sacco.repositories;

import com.bring.sacco.entities.LoanRepayment;
import com.bring.sacco.entities.LoanType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanRepaymentRepository extends JpaRepository<LoanRepayment, Long> {
    List<LoanRepayment> findAllById(long id);
    List<LoanRepayment>findAllByLoanType(LoanType loanType);
    List<LoanRepayment>findAllByMemberId(long memberId);
//    List<LoanRepayment>findAllByLoanApplication(LoanApplication loanApplication);
//    List<LoanRepayment>findAllByRepaymentDate(java.sql.Timestamp repaymentDate);
//    List<LoanRepayment>findAllByLoanAmount(int loanAmount);
//    List<LoanRepayment>findAllByAmountPayed(int AmountPayed);
//    List<LoanRepayment>findAllByLoanBalance(int loanBalance);


}