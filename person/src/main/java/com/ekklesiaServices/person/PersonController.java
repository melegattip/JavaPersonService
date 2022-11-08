package com.ekklesiaServices.person;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping
    public void getPerson(@RequestBody int id){
        log.info("New person search {}" , id);
        personService.getPerson(id);
    }
}
