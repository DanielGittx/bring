package com.bring.sacco.controllers;


import com.bring.sacco.entities.LoanStatus;
import com.bring.sacco.services.LoanStatusService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("loanStatus")
public class LoanStatusController {

    private final LoanStatusService loanStatusService;

    public LoanStatusController(LoanStatusService loanStatusService) {

        this.loanStatusService = loanStatusService;
    }

    @PostMapping("/create")
    public LoanStatus createLoanStatus(@RequestBody LoanStatus loanStatus) {
        return loanStatusService.createLoanStatus(loanStatus);
    }


    @PutMapping("/update")
    public LoanStatus updateLoanStatus(@RequestBody LoanStatus dto) {
        return loanStatusService.updateLoanStatus(dto);
    }

    @GetMapping("/all")
    public List<LoanStatus> getAll() {
        return loanStatusService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id) {
        loanStatusService.deleteById(id);
    }

}
