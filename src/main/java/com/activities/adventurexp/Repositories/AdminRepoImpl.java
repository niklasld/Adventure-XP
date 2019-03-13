package com.activities.adventurexp.Repositories;

import com.activities.adventurexp.Models.Activities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.logging.Logger;

@Repository
public class AdminRepoImpl implements AdminRepo{
    public AdminRepoImpl() {
    }

    @Autowired
    JdbcTemplate template;


    Logger log = Logger.getLogger(AdminRepoImpl.class.getName());

    @Override
    public Activities addActivities(Activities activities) {


        String sql = "INSERT INTO AdventureXP.Activities VALUE(default, ?, ?)";
        String activityName = activities.getActivityName();
        String activityDescription = activities.getActivityDescription();


        log.info("AddActivity called");
        this.template.update(sql, activityName, activityDescription);

        return activities;
    }

}
