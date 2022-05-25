package com.ekklesiaServices.leader;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/leader-check")
@AllArgsConstructor
@Slf4j
public class LeaderController {

    private final LeaderCheckService leaderCheckService;

    @GetMapping(path = "{personId}")
    public LeaderCheckResponse isLeader(@PathVariable("personId") int personId){
        Boolean isLeaderPerson = leaderCheckService.isLeaderPerson(personId);
        log.info("Leader check requested for person {}", personId);
        return new LeaderCheckResponse(isLeaderPerson);

    }
}
