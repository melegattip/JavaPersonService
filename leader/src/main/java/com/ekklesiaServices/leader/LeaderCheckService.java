package com.ekklesiaServices.leader;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
@AllArgsConstructor
public class LeaderCheckService {

    private final LeaderCheckHistoryRepository leaderCheckHistoryRepository;

    public boolean isLeaderPerson(int personId){
        leaderCheckHistoryRepository.save(
                LeaderCheckHistory.builder()
                        .personId(personId)
                        .isLeader(false)
                        .createdAt(LocalDateTime.now())
                        .build()

        );
        return false;
    }
}
