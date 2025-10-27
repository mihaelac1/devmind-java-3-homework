package com.devmind.annotation.springapp.impl;

import com.devmind.annotation.springapp.abs.ITeacher;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class JavaTeacher implements ITeacher {

    private static final String JAVA_TEACHER_PREFIX = "Java teacher says: ";
    private final WisdomWordsService wisdomWordsService;
    private final HomeworkService homeworkService;
    @Value( "${java.teacher.age}")
    private int age;
    @Value( "${great.place.to.work}")
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