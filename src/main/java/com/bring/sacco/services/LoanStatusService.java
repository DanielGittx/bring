package com.bring.sacco.services;


import com.bring.sacco.entities.LoanStatus;
import com.bring.sacco.repositories.LoanStatusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanStatusService {
    private final LoanStatusRepository loanStatusRepository;
    public LoanStatusService(LoanStatusRepository loanStatusRepository) {
        this.loanStatusRepository = loanStatusRepository;

    }


    public LoanStatus createLoanStatus(LoanStatus loanStatus) {

        return loanStatusRepository.save(loanStatus);
    }

    public LoanStatus updateLoanStatus(LoanStatus loanStatus) {

        return loanStatusRepository.save(loanStatus);
    }

    public List<LoanStatus> getAll() {
        return loanStatusRepository.findAll();
    }

    public void deleteById(long id) {
        loanStatusRepository.deleteById(id);
    }


}

