package com.ekklesiaService.person;

public record PersonRegistrationRequest(
        String firstName,
        String lastName,
        String email,
        Long phone) {
}
