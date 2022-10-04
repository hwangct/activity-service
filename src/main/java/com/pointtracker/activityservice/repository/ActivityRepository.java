package com.pointtracker.activityservice.repository;

import com.pointtracker.activityservice.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {
    Activity findByActivityId(Long activityId);
    List<Activity> findByUserId(String userId);
}
