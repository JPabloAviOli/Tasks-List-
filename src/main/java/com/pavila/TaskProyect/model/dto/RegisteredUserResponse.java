package com.pavila.TaskProyect.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisteredUserResponse {

    private Long id;
    private String username;
    private String name;
    private String role;
    private String jwt;

}
