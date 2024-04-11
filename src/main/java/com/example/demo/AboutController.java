package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AboutController {
    @GetMapping("/api/about")
    public GetAboutRespDto hello() {
        GetAboutRespDto getAboutRespDto = new GetAboutRespDto();
        getAboutRespDto.setStr("CHEOLJUN");
        return getAboutRespDto;
    }
    

    
}