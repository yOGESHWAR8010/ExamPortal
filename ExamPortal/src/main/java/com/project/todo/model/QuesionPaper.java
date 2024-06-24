package com.project.todo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuesionPaper {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int quesionId;
	private String question;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Answermcq> mcq;


	
}
