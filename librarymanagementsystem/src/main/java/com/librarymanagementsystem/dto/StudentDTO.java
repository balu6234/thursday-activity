package com.librarymanagementsystem.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.librarymanagementsystem.Entity.Book;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDTO {
	@NotBlank(message="empty not allowed")
	@NotNull(message="null value not allowed")
	@Size(min=3,max=15,message="name must be in range 3-15 characters")
	private String studentName;
	@NotNull(message="address may not be empty")
	private String studentAddress;
	Book book;
}
