package com.bring.sacco.services;


import com.bring.sacco.entities.LoanApplication;
import com.bring.sacco.exception_handlers.ResourceNotFoundException;
import com.bring.sacco.repositories.LoanApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanApplicationService {

    private final LoanApplicationRepository loanApplicationRepository;

    public LoanApplicationService(LoanApplicationRepository loanApplicationRepository){
        this.loanApplicationRepository = loanApplicationRepository;
    }

    public LoanApplication createLoanApplication(LoanApplication loanApplication){
        return loanApplicationRepository.save(loanApplication);
    }


    public LoanApplication updateLoanApplication(LoanApplication loanApplication){
        Optional<LoanApplication> _loanApplication = loanApplicationRepository.findById(loanApplication.getLoanApplicationId());
        if (!_loanApplication.isPresent()){
            throw new ResourceNotFoundException("Loan Application Id does not exist");
        }
        return loanApplicationRepository.save(loanApplication);


    }

    public List<LoanApplication> getAll() {
        return loanApplicationRepository.findAll();
    }

    public void deleteById(long id) {
        loanApplicationRepository.deleteById(id);
    }


}
