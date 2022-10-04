package com.pointtracker.activityservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long activityId;
    private String userId;
    private String activityName;
    private int activityPoints;
    private String activityType;

    @Temporal(TemporalType.DATE)
    private Date activityDate = new Date(System.currentTimeMillis());
}

