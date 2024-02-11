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
public class ObjParams {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonProperty("objId")
	private String objId;

	@JsonProperty("paramTime")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime paramTime;

	@JsonProperty("params")
	@OneToOne(mappedBy = "objParams")
	private Params params;
	@ManyToOne
	@JoinColumn(name = "response_id")
	private Response response;
}