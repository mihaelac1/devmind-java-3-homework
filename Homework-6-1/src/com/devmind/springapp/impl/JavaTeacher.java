package com.devmind.springapp.impl;

import com.devmind.springapp.abs.ITeacher;
import lombok.Data;

@Data
public class JavaTeacher implements ITeacher {

    private static final String JAVA_TEACHER_PREFIX = "Java teacher says: ";
    private final WisdomWordsService wisdomWordsService;
    private final HomeworkService homeworkService;
    private int age;
    private String workPlace;

    public JavaTeacher(WisdomWordsService wisdomService, HomeworkService homeworkService) {
        this.wisdomWordsService = wisdomService;
        this.homeworkService = homeworkService;
    }

    @Override
    public String getHomeWork() {
        return JAVA_TEACHER_PREFIX + homeworkService.getHomeWork();
    }

    @Override
    public String getWisdom() {
        return JAVA_TEACHER_PREFIX + wisdomWordsService.getMessage();
    }
}