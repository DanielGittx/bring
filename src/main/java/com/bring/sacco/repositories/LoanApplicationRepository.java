package com.bring.sacco.repositories;

import com.bring.sacco.entities.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {
    List<LoanApplication> findAllById(long id);
    List<LoanApplication>findAllByLoanType(long loanType);
    List<LoanApplication>findAllByAccount(long account);
    List<LoanApplication>findAllByLoanStatus(long loanStatus);
    List<LoanApplication>findAllByApplicationDate(java.sql.Timestamp applicationDate);
    List<LoanApplication>findAllByApplicationAmount(int applicationAmount);
    List<LoanApplication>findAllByApprovedAmount(int approvedAmount);
    List<LoanApplication>findAllByApprovalDate(java.sql.Timestamp approvalDate);
    List<LoanApplication>findAllByMinimumAmountPayed(int minimumAmountPayed);
    List<LoanApplication>findAllByRepaymentPeriod(String repaymentPeriod);
    List<LoanApplication>findAllByBalance(int balance);
}