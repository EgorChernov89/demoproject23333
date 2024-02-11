package com.example.demoproject23333.dto.mapper;

import com.example.demoproject23333.model.Params;
import com.example.demoproject23333.dto.ParamsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ParamsMapper {
    ParamsDto paramsToParamsDTO(Params params);

    Params mapToParams(ParamsDto paramsDto);
}
