package com.mchaves.apiadmnews.web.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsuarioCreateDto {

    @NotBlank
    @Email(message = "formato do e-mail está invalido", regexp = "^[a-z0-9.+-]+@[a-z0-9.-]+\\.[a-z]{2,}$")
    private String username;
    @NotBlank
    @Size(min = 6, max = 6)
    private String password;
}
