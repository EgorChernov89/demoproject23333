package com.example.demoproject23333.controller;


import com.example.demoproject23333.model.Response;
import com.example.demoproject23333.dto.ResponseDto;
import com.example.demoproject23333.services.Impl.ObjParamsServiceImpl;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/v2")
@RequiredArgsConstructor
@SecurityRequirement(name = "Bearer Authentication")
public class RestfullController {

    private final ObjParamsServiceImpl objParamsService;



    @PostMapping("/putRawParams")
    public Response getRawParams(@RequestBody Response response){
        return objParamsService.saveResponseFromJson(response);

    }

}
