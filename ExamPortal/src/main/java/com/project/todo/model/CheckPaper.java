package com.project.todo.model;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CheckPaper {

	private int id;
	private int studentId;
	private int subject;
	private Map<String, String> questionAnsewr;

}
