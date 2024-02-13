package com.example.demoproject23333.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table (name = "response")
public class Response {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column(name = "objParams")
	@OneToMany(mappedBy = "response", cascade = CascadeType.ALL)
	private List<ObjParams> objParams;
}