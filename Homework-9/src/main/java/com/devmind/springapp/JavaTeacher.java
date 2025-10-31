package com.devmind.springapp;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class JavaTeacher implements ITeacher {
    private final WisdomWordsService wisdomWordsService;
    private final HomeworkService homeworkService;
    private int age;
    private String workPlace;

    @Override
    public String getHomeWork() {
        return homeworkService.getHomeWork();
    }

    @Override
    public String getWisdom() {
        return wisdomWordsService.getMessage();
    }
}