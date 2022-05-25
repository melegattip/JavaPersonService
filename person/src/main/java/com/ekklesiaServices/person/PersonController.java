package com.ekklesiaServices.person;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/persons")
@AllArgsConstructor
public class PersonController{
    private final PersonService personService;
    @PostMapping
    public void registerPerson(@RequestBody PersonRegistrationRequest personRegistrationRequest){
        log.info("New person registration {}" , personRegistrationRequest);
        personService.registerPerson(personRegistrationRequest);
    }
}
