package com.example.demoproject23333.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Params {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonProperty("CC.DevTime_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime cCDevTimeTime;

	@JsonProperty("CC.DevTime")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime cCDevTime;

	@JsonProperty("CC.Latitude_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime cCLatitudeTime;

	@JsonProperty("CC.Latitude")
	private String cCLatitude;

	@JsonProperty("CC.Longitude_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime cCLongitudeTime;

	@JsonProperty("CC.Longitude")
	private String cCLongitude;

	@JsonProperty("CC.Course_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime cCCourseTime;

	@JsonProperty("CC.Course")
	private String cCCourse;

	@JsonProperty("CC.Speed_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime cCSpeedTime;

	@JsonProperty("CC.Speed")
	private String cCSpeed;

	@JsonProperty("CC.Status_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime cCStatusTime;

	@JsonProperty("CC.Status")
	private String cCStatus;

	@JsonProperty("CC.BU_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime cCBUTime;

	@JsonProperty("CC.BU")
	private String ccBu;

	@JsonProperty("CC.OUT_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime cCOUTTime;

	@JsonProperty("CC.OUT")
	private String ccOut;

	@JsonProperty("CC.T_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime cCTTime;

	@JsonProperty("CC.T")
	private String ccT;

	@JsonProperty("CC.BZ_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime cCBZTime;

	@JsonProperty("CC.BZ")
	private String ccBz;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "obj_params_id")
	private ObjParams objParams;
}