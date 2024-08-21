package com.eduardodornel.TodoSymplify.dtos;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TodoRecordDto(@NotBlank String name, String status , String priority) {

}
