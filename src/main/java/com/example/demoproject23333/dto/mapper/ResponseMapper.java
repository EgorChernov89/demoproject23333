package com.example.demoproject23333.dto.mapper;

import com.example.demoproject23333.model.Response;
import com.example.demoproject23333.dto.ResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResponseMapper {
    ResponseDto ResponseToResponseDTO(Response response);

    Response mapToResponse(ResponseDto responseDto);
}
