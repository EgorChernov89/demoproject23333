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
@Table (name = "params")
public class Params {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonProperty("CC.DevTime_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "cCDevTimeTime")
	private LocalDateTime devTimeTime;

	@JsonProperty("CC.DevTime")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "cCDevTime")
	private LocalDateTime devTime;

	@JsonProperty("CC.Latitude_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "cCLatitudeTime")
	private LocalDateTime latitudeTime;

	@JsonProperty("CC.Latitude")
	@Column(name = "cCLatitude")
	private String latitude;

	@JsonProperty("CC.Longitude_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "cCLongitudeTime")
	private LocalDateTime longitudeTime;

	@JsonProperty("CC.Longitude")
	@Column(name = "cCLongitude")
	private String longitude;

	@JsonProperty("CC.Course_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "cCCourseTime")
	private LocalDateTime courseTime;

	@JsonProperty("CC.Course")
	@Column(name = "cCCourse")
	private String course;

	@JsonProperty("CC.Speed_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "cCSpeedTime")
	private LocalDateTime speedTime;

	@JsonProperty("CC.Speed")
	@Column(name = "cCSpeed")
	private String speed;

	@JsonProperty("CC.Status_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "cCStatusTime")
	private LocalDateTime statusTime;

	@JsonProperty("CC.Status")
	@Column(name = "cCStatus")
	private String status;

	@JsonProperty("CC.BU_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "cCBUTime")
	private LocalDateTime bUTime;

	@JsonProperty("CC.BU")
	@Column(name = "ccBu")
	private String bu;

	@JsonProperty("CC.OUT_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "cCOUTTime")
	private LocalDateTime oUTTime;

	@JsonProperty("CC.OUT")
	@Column(name = "ccOut")
	private String out;

	@JsonProperty("CC.T_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "cCTTime")
	private LocalDateTime tempTime;

	@JsonProperty("CC.T")
	@Column(name = "ccT")
	private String temp;

	@JsonProperty("CC.BZ_Time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Column(name = "cCBZTime")
	private LocalDateTime bZTime;

	@JsonProperty("CC.BZ")
	@Column(name = "ccBz")
	private String bz;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "obj_params_id")
	private ObjParams objParams;
}