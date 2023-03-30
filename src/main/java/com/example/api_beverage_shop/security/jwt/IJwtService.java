package com.example.api_beverage_shop.security.jwt;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;
import java.util.function.Function;

public interface IJwtService {
    public String extractUsername(String token);

    public Date extractExpiration(String token);

    public String extractRoles(String token);

    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver);

    public Claims extractAllClaims(String token);

    public Boolean isTokenExpired(String token);

    public String generateToken(Authentication auth);

//    public String createToken(Map<String, Object> claims, String subject, Boolean refresh_token);
    public String generateRefreshToken(Authentication auth);
    public Boolean validateToken(String token, UserDetails userDetails);
}