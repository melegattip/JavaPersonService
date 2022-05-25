package com.ekklesiaServices.person;

public record PersonRegistrationRequest(
        String firstName,
        String lastName,
        String email,
        Long phone) {
}
