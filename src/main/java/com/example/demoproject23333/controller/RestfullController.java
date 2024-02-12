package com.example.demoproject23333.controller;


import com.example.demoproject23333.model.Response;
import com.example.demoproject23333.dto.ResponseDto;
import com.example.demoproject23333.services.Impl.ObjParamsServiceImpl;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/v2")
@RequiredArgsConstructor
public class RestfullController {

    private final ObjParamsServiceImpl objParamsService;



    @PostMapping("/putRawParams")
    public Response getRawParams(@RequestBody ResponseDto responseDto){
        return objParamsService.saveResponseFromJson(responseDto);

    }

}
