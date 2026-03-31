package com.mycompany.springrestmysql.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Data
public class CreateUser {

    @Schema(example = "User Test")
    @NotBlank
    private String name;

    @Schema(example = "user@test.com")
    @Email
    @NotBlank
    private String email;
}
