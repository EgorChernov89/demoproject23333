package com.example.demoproject23333.controller;


import com.example.demoproject23333.dto.utils.MapperResponse;
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
    private final MapperResponse mapperResponse;



    @PostMapping("/putRawParams")
    public Response getRawParams(@RequestBody ResponseDto responseDto){
        return objParamsService.saveResponseFromJson(mapperResponse.convertToEntity(responseDto));

       // return objParamsService.saveResponseFromJson(response);

    }

}
