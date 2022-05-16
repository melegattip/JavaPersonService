package com.ekklesiaService.person;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/persons")
public record PersonController(PersonService personService) {

    @PostMapping
    public void registerPerson(@RequestBody PersonRegistrationRequest personRegistrationRequest){
        log.info("New person registration {}" , personRegistrationRequest);
        personService.registerPerson(personRegistrationRequest);
    }
}
