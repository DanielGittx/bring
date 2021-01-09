package com.bring.sacco.services;

import com.bring.sacco.entities.LoanRepayment;
import com.bring.sacco.repositories.LoanRepaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanRepaymentService {
    private final LoanRepaymentRepository loanRepaymentRepository;

    public LoanRepaymentService (LoanRepaymentRepository loanRepaymentRepository){
        this.loanRepaymentRepository = loanRepaymentRepository;

    }

    public LoanRepayment createLoanRepayment(LoanRepayment loanRepayment){
        return loanRepaymentRepository.save(loanRepayment);
    }

    public LoanRepayment updateLoanRepayment(LoanRepayment loanRepayment){


        return loanRepaymentRepository.save(loanRepayment);


    }

    public List<LoanRepayment> getAll() {
        return loanRepaymentRepository.findAll();
    }

    public void deleteById(long id) {
        loanRepaymentRepository.deleteById(id);
    }
}
