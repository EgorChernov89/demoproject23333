package com.example.demoproject23333.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ObjParamsDto {

    @JsonProperty("objId")
    private String objId;

    @JsonProperty("paramTime")
    private String paramTime;

    @JsonProperty("params")
    private ParamsDto params;

}
