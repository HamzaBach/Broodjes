package com.example.Broodjes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/Openingsuur")
public class OpeningsuurController {
    private final OpeningsuurService openingsuurService;

    @Autowired
    public OpeningsuurController(OpeningsuurService openingsuurService){
        this.openingsuurService = openingsuurService;
    }

    @GetMapping
    public List<Openingsuur> getOpeningsuren(){
        return openingsuurService.getOpeningsUren();
    }


}
