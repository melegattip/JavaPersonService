package com.ekklesiaServices.leader;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LeaderCheckHistory {
    @Id
    @GeneratedValue
    private int id;
    private int personId;
    private Boolean isLeader;
    private LocalDateTime createdAt;
}
