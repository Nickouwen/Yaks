package com.restrezos.restrezos.user;

public record User(
    Integer id,
    String username,
    String password,
    String role,
    String firstName,
    String lastName,
    String email,
    String phone
) {}
