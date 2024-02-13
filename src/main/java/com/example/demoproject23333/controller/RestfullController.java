package com.example.demoproject23333.controller;


import com.example.demoproject23333.dto.utils.MapperResponse;
import com.example.demoproject23333.model.ObjParams;
import com.example.demoproject23333.model.Params;
import com.example.demoproject23333.model.Response;
import com.example.demoproject23333.dto.ResponseDto;
import com.example.demoproject23333.services.Impl.ObjParamsServiceImpl;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/v2")
@RequiredArgsConstructor
@SecurityRequirement(name = "Bearer Authentication")
public class RestfullController {

    private final ObjParamsServiceImpl objParamsService;
    private final MapperResponse mapperResponse;



    @PostMapping("/putRawParams")
    public Response getRawParams(@RequestBody ResponseDto responseDto) {
        return objParamsService.saveResponseFromJson(mapperResponse.convertToEntity(responseDto));
    }

    @GetMapping("/convert")
    public ResponseEntity<String> convertStatus(@RequestParam String objName) {
        String statusText = objParamsService.convertStatus(objName);
        return ResponseEntity.ok(statusText);
    }

}
