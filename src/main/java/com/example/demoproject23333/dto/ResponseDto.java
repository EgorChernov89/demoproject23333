package com.example.demoproject23333.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;
@Data
@Schema(description = "преобразование полученных данных о статусе усройства")
public class ResponseDto {
    private List<ObjParamsDto> objParams;
}
