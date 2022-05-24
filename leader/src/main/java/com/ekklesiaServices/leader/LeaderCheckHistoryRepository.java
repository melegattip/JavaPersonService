package com.ekklesiaServices.leader;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaderCheckHistoryRepository
        extends JpaRepository<LeaderCheckHistory, Integer> {
}
