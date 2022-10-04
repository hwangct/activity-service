package com.pointtracker.activityservice.controller;

import com.pointtracker.activityservice.entity.Activity;
import com.pointtracker.activityservice.service.ActivityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/activities")
@Slf4j
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @PostMapping
    public Activity saveActivity(@RequestBody Activity activity) {
        log.info("Inside saveActivity method of ActivityController");
        return activityService.saveActivity(activity);
    }

    @GetMapping
    public List<Activity> findAllActivities() {
        log.info("Inside getAllActivities method of ActivityController");
        return activityService.findAllActivities();
    }

    @GetMapping("/userid/{userid}")
    public List<Activity> findActivitiesByUserId(@PathVariable("userid") String userId) {
        log.info("Inside findActivitiesByUserId method of ActivityController");
        return activityService.findActivitiesByUserId(userId);
    }

    @GetMapping("/{id}")
    public Activity findActivityById(@PathVariable("id") Long activityId) {
        log.info("Inside findActivityById method of ActivityController");
        return activityService.findActivityById(activityId);
    }

    @PutMapping("/{id}")
    public Activity updateActivity(@RequestBody Activity activity, @PathVariable("id") Long activityId) {
        log.info("Inside updateActivityById method of ActivityController");
        return activityService.updateActivity(activity, activityId);
    }

    @DeleteMapping("/{id}")
    public void deleteActivityById(@PathVariable("id") Long activityId) {
        log.info("Inside deleteActivityById method of ActivityController");
        activityService.deleteActivityById(activityId);
    }
}
