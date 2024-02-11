package com.example.demoproject23333.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ParamsDto {

    @JsonProperty("CC.DevTime_Time")
    private String cCDevTimeTime;

    @JsonProperty("CC.DevTime")
    private String cCDevTime;

    @JsonProperty("CC.Latitude_Time")
    private String cCLatitudeTime;

    @JsonProperty("CC.Latitude")
    private String cCLatitude;

    @JsonProperty("CC.Longitude_Time")
    private String cCLongitudeTime;

    @JsonProperty("CC.Longitude")
    private String cCLongitude;

    @JsonProperty("CC.Course_Time")
    private String cCCourseTime;

    @JsonProperty("CC.Course")
    private String cCCourse;

    @JsonProperty("CC.Speed_Time")
    private String cCSpeedTime;

    @JsonProperty("CC.Speed")
    private String cCSpeed;

    @JsonProperty("CC.Status_Time")
    private String cCStatusTime;

    @JsonProperty("CC.Status")
    private String cCStatus;

    @JsonProperty("CC.BU_Time")
    private String cCBUTime;

    @JsonProperty("CC.BU")
    private String ccBu;

    @JsonProperty("CC.OUT_Time")
    private String cCOUTTime;

    @JsonProperty("CC.OUT")
    private String ccOut;

    @JsonProperty("CC.T_Time")
    private String cCTTime;

    @JsonProperty("CC.T")
    private String ccT;

    @JsonProperty("CC.BZ_Time")
    private String cCBZTime;

    @JsonProperty("CC.BZ")
    private String ccBz;


}

