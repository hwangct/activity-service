package com.pointtracker.activityservice.service;

import com.pointtracker.activityservice.entity.Activity;
import com.pointtracker.activityservice.repository.ActivityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Slf4j
public class ActivityService {
    @Autowired
    private ActivityRepository activityRepository;

    public Activity saveActivity(Activity activity) {
        log.info("Inside saveActivity method of ActivityRepository");
        return activityRepository.save(activity);
    }

    public Activity findActivityById(Long activityId) {
        log.info("Inside findActivityById method of ActivityRepository");
        return activityRepository.findByActivityId(activityId);
    }

    public List<Activity> findAllActivities() {
        log.info("Inside findAllActivities method of ActivityRepository");
        return activityRepository.findAll();
    }

    public List<Activity> findActivitiesByUserId(String userId) {
        log.info("Inside findActivitiesByUserId method of ActivityRepository");
        return activityRepository.findByUserId(userId);
    }

    public Activity updateActivity(Activity activity, Long activityId) {
        log.info("Inside updateActivity method of ActivityRepository");
        Activity updatedActivity
                = activityRepository.findById(activityId)
                .get();

        if (Objects.nonNull(activity.getClass())
                && !"".equalsIgnoreCase(
                activity.getActivityName())) {
            updatedActivity.setActivityName(
                    activity.getActivityName());
        }

        if (Objects.nonNull(activity.getActivityDate())) {
            updatedActivity.setActivityDate(
                    activity.getActivityDate());
        }

        if (Objects.nonNull(activity.getActivityType())
                && !"".equalsIgnoreCase(
                activity.getActivityType())) {
            updatedActivity.setActivityType(
                    activity.getActivityType());
        }

        if (Objects.nonNull(activity.getActivityPoints()) && (activity.getActivityPoints() > 0)) {
            updatedActivity.setActivityPoints(
                    activity.getActivityPoints());
        }

        return activityRepository.save(activity);
    }

    public void deleteActivityById(Long activityId) {
        log.info("Inside deleteActivityById method of ActivityRepository");
        activityRepository.deleteById(activityId);
    }

    ;
}

