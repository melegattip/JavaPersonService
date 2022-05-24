package com.ekklesiaServices.leader;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/leader-check")
@AllArgsConstructor
public class LeaderController {

    private final LeaderCheckService leaderCheckService;

    @GetMapping(path = "{personId}")
    public LeaderCheckRepsone isLeader(@PathVariable("personId") int personId){
        Boolean isLeaderPerson = leaderCheckService.isLeaderPerson(personId);
        return new LeaderCheckRepsone(isLeaderPerson);

    }
}
