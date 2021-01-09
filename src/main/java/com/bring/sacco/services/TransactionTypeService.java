package com.bring.sacco.services;

import com.bring.sacco.entities.TransactionType;
import com.bring.sacco.repositories.TransactionTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionTypeService {

    private final TransactionTypeRepository transactionTypeRepository;

    public TransactionTypeService(TransactionTypeRepository transactionTypeRepository){

        this.transactionTypeRepository = transactionTypeRepository;
    }

    public TransactionType createTransactionType(TransactionType transactionType){
        return transactionTypeRepository.save(transactionType);
    }

    public TransactionType updateTransactionType(TransactionType dto){
        TransactionType transactionType = transactionTypeRepository.findById(dto.getTransactionId()).get();
        transactionType.setName(dto.getName());

        return transactionTypeRepository.save(transactionType);

    }

    public List<TransactionType> getAll() {
        return transactionTypeRepository.findAll();
    }

    public void deleteById(long id) {
        transactionTypeRepository.deleteById(id);
    }
}

