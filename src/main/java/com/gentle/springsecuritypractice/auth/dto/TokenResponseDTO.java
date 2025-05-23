package com.gentle.springsecuritypractice.auth.dto;

import com.gentle.springsecuritypractice.security.jwt.JwtToken;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TokenResponseDTO {
    private JwtToken token;
}
