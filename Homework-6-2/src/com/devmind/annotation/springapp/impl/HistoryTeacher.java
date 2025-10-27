package com.devmind.annotation.springapp.impl;

import com.devmind.annotation.springapp.abs.ITeacher;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HistoryTeacher implements ITeacher {
    private final WisdomWordsService wisdomWordsService;
    private static final String HISTORY_TEACHER_PREFIX = "History teacher says: ";

    public HistoryTeacher(WisdomWordsService wisdomWordsService) {
        this.wisdomWordsService = wisdomWordsService;
    }

    @Override
    public String getHomeWork() {
        return HISTORY_TEACHER_PREFIX + "This is your history homework";
    }

    @Override
    public String getWisdom() {
        return HISTORY_TEACHER_PREFIX + wisdomWordsService.getMessage();
    }
}
