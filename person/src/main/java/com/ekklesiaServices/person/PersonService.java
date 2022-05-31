package com.ekklesiaServices.person;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class PersonService{
    private final PersonRepository personRepository;
    private final RestTemplate restTemplate;
    public void registerPerson(PersonRegistrationRequest request) {
        Person person = Person.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .phone(request.phone())
                .build();
        personRepository.saveAndFlush(person);
        LeaderCheckResponse leaderCheckRepsone = restTemplate.getForObject(
                "http://LEADER/api/v1/leader-check/{personId}",
                LeaderCheckResponse.class,
                person.getId()
        );
    }
}
