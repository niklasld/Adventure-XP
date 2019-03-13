package com.activities.adventurexp.Models;

public class Activities {
    int activityId;
    String activityName;
    String activityDescription;

    public Activities(int activityId, String activityName, String activityDescription) {
        this.activityId = activityId;
        this.activityName = activityName;
        this.activityDescription = activityDescription;
    }

    public Activities(String activityName, String activityDescription) {
        this.activityName = activityName;
        this.activityDescription = activityDescription;
    }

    public Activities() {
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityDescription() {
        return activityDescription;
    }

    public void setActivityDescription(String activityDescription) {
        this.activityDescription = activityDescription;
    }

    @Override
    public String toString() {
        return "Activities{" +
                "activityId=" + activityId +
                ", acitivityName='" + activityName + '\'' +
                ", activityDescription='" + activityDescription + '\'' +
                '}';
    }
}
