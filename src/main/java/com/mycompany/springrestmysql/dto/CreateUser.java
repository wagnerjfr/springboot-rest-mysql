package com.mycompany.springrestmysql.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class CreateUser {

    @ApiModelProperty(example = "User Test")
    @NotBlank
    private String name;

    @ApiModelProperty(example = "user@test.com", position = 2)
    @Email
    @NotBlank
    private String email;
}
