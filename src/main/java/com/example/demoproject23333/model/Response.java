package com.example.demoproject23333.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Response {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column(name = "objParams")
	@OneToMany(mappedBy = "response", cascade = CascadeType.ALL)
	private List<ObjParams> objParams;
}