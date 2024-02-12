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
	@Column(name = "cCDevTimeTime")
	private LocalDateTime cCDevTimeTime;

	@JsonProperty("CC.DevTime")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "cCDevTime")
	private LocalDateTime cCDevTime;

	@JsonProperty("CC.Latitude_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "cCLatitudeTime")
	private LocalDateTime cCLatitudeTime;

	@JsonProperty("CC.Latitude")
	@Column(name = "cCLatitude")
	private String cCLatitude;

	@JsonProperty("CC.Longitude_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "cCLongitudeTime")
	private LocalDateTime cCLongitudeTime;

	@JsonProperty("CC.Longitude")
	@Column(name = "cCLongitude")
	private String cCLongitude;

	@JsonProperty("CC.Course_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "cCCourseTime")
	private LocalDateTime cCCourseTime;

	@JsonProperty("CC.Course")
	@Column(name = "cCCourse")
	private String cCCourse;

	@JsonProperty("CC.Speed_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "cCSpeedTime")
	private LocalDateTime speedTime;

	@JsonProperty("CC.Speed")
	@Column(name = "cCSpeed")
	private String cCSpeed;

	@JsonProperty("CC.Status_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "cCStatusTime")
	private LocalDateTime cCStatusTime;

	@JsonProperty("CC.Status")
	@Column(name = "cCStatus")
	private String cCStatus;

	@JsonProperty("CC.BU_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "cCBUTime")
	private LocalDateTime cCBUTime;

	@JsonProperty("CC.BU")
	@Column(name = "ccBu")
	private String ccBu;

	@JsonProperty("CC.OUT_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "cCOUTTime")
	private LocalDateTime cCOUTTime;

	@JsonProperty("CC.OUT")
	@Column(name = "ccOut")
	private String ccOut;

	@JsonProperty("CC.T_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "cCTTime")
	private LocalDateTime cCTTime;

	@JsonProperty("CC.T")
	@Column(name = "ccT")
	private String ccT;

	@JsonProperty("CC.BZ_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "cCBZTime")
	private LocalDateTime cCBZTime;

	@JsonProperty("CC.BZ")
	@Column(name = "ccBz")
	private String ccBz;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "obj_params_id")
	private ObjParams objParams;
}