package com.example.demoproject23333.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ObjParamsDto {

    @JsonProperty("objId")
    private String objName;

    @JsonProperty("paramTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private LocalDateTime paramTime;

    @JsonProperty("params")
    private ParamsDto params;

}
