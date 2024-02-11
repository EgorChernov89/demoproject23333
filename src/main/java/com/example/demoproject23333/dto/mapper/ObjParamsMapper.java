package com.example.demoproject23333.dto.mapper;

import com.example.demoproject23333.model.ObjParams;
import com.example.demoproject23333.dto.ObjParamsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ObjParamsMapper {

    ObjParamsDto objParamsToObjParamsDTO(ObjParams objParams);

    ObjParams mapToObjParams(ObjParamsDto objParamsDto);
    }

