package com.example.demoproject23333.services;

import com.example.demoproject23333.dto.ResponseDto;
import com.example.demoproject23333.model.Params;
import com.example.demoproject23333.model.Response;

public interface ObjParamsService {
     Response saveResponseFromJson(ResponseDto responseDto);
    String convertStatus(Params params);
}
