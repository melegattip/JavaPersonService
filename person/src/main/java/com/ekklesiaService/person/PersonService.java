package com.ekklesiaService.person;

import org.springframework.stereotype.Service;

@Service
public record PersonService(PersonRepository personRepository) {
    public void registerPerson(PersonRegistrationRequest request) {
        Person person = Person.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .phone(request.phone())
                .build();
        //todo: check if the email is valid
        //todo: check if the email is not taken
         personRepository.save(person);
    }
}
