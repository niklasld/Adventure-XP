package com.activities.adventurexp.Repositories;

import com.activities.adventurexp.Models.Activities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.logging.Logger;
import java.util.*;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Repository
public class CustomerRepoImpl implements CustomerRepo{
    public CustomerRepoImpl() {
    }

    @Autowired
    JdbcTemplate template;

    @Override
    public List<Activities> getActivities() {
        String sql = "SELECT * FROM Activities";
        return this.template.query(sql, new ResultSetExtractor<List<Activities>>() {

            @Override
            public List<Activities> extractData(ResultSet rs) throws SQLException, DataAccessException {
                int activityId;
                String activityName, activityDescription;
                ArrayList<Activities> activitiesArrayList = new ArrayList<>();

                while (rs.next()) {
                    activityId = rs.getInt("activityId");
                    activityName = rs.getString("activityName");
                    activityDescription = rs.getString("activityDescription");

                    activitiesArrayList.add(new Activities(activityId, activityName, activityDescription));
                }
                return activitiesArrayList;
            }
        });
    }
}