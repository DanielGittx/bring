package com.bring.sacco.services;


import com.bring.sacco.entities.LoanType;
import com.bring.sacco.repositories.LoanTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanTypeService {

    private final LoanTypeRepository loanTypeRepository;
    public LoanTypeService(LoanTypeRepository loanTypeRepository){

        this.loanTypeRepository = loanTypeRepository;
    }

    public LoanType createLoanType(LoanType loanType) {

        return loanTypeRepository.save(loanType);
    }

    public LoanType updateLoanType(LoanType dto) {
        LoanType loanType = loanTypeRepository.findById(dto.getLoanTypeId()).get();
        loanType.setName(dto.getName());
        loanType.setMaximumAmount(dto.getMaximumAmount());
        loanType.setMinimumAmount(dto.getMinimumAmount());
        loanType.setMaximumRepaymentPeriod(dto.getMaximumRepaymentPeriod());

        return loanTypeRepository.save(loanType);

    }

    public List<LoanType> getAll(){
        return loanTypeRepository.findAll();
    }

    public void deleteById(long id){ loanTypeRepository.deleteById(id);}
}
