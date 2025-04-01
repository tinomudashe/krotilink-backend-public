package com.url.shortener.security.jwt;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class JwtAuthenticationResponse {


    private String token;

}
