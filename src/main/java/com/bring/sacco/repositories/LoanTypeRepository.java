package com.bring.sacco.repositories;

import com.bring.sacco.entities.LoanType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanTypeRepository extends JpaRepository<LoanType, Long> {
    List<LoanType> findAllById (long id);
    List<LoanType>findAllByName(String name);
    List<LoanType>findAllByMaximumAmount(int maximumAmount);
//    List<LoanType>findAllByMinimumAmount(int minimumAmount);
//    List<LoanType>findAllByMaximumRepaymentPeriod(int maximumRepaymentPeriod);
//    List<LoanType>findAllByIdAndName(long id, String name);
//    List<LoanType>findAllByIdAndMaximumRepaymentPeriod(long id, int maximumRepaymentPeriod );
//    List<LoanType>findAllByNameAndMaximumRepaymentPeriod(String name, int maximumRepaymentPeriod );
//    List<LoanType>findAllByNameAndMaximumAmount(String name, int maximumAmount );
//    List<LoanType>findAllByNameAndMinimumAmount(String name, int minimumAmount );

}