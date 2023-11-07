package com.android.personal_portfolio.Adapters;

public class Projects{
    String projectTitle, projectSub_title, projectDescription, viewersCount, totalViewers;
    int viewersIcon, projectImage;

    public Projects(String projectTitle, String projectSub_title, String projectDescription, int projectImage, String viewersCount, String totalViewers, int viewersIcon) {
        this.projectTitle = projectTitle;
        this.viewersCount = viewersCount;
        this.projectSub_title = projectSub_title;
        this.projectDescription = projectDescription;
        this.totalViewers = totalViewers;
        this.viewersIcon = viewersIcon;
        this.projectImage = projectImage;

    }

}
