package com.bring.sacco.controllers;

import com.bring.sacco.entities.ShareCapital;
import com.bring.sacco.services.ShareCapitalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("shareCapital")
public class ShareCapitalController {

    private final ShareCapitalService shareCapitalService;

    public ShareCapitalController(ShareCapitalService shareCapitalService) {
        this.shareCapitalService = shareCapitalService;
    }

    @PostMapping("/create")
    public ShareCapital createShareCapital(@RequestBody ShareCapital shareCapital){
        return shareCapitalService.createShareCapital(shareCapital);

    }

    @PutMapping("/update")
    public ShareCapital updateShareCapital(@RequestBody ShareCapital dto){
        return shareCapitalService.updateShareCapital(dto);

    }

    @GetMapping("/all")
    public List<ShareCapital> getAll(){
        return shareCapitalService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id) {
        shareCapitalService.deleteById(id);
    }


}
