package com.devmind.annotation.springapp.impl;

import com.devmind.annotation.springapp.abs.ITeacher;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class MathTeacher implements ITeacher {
    private final WisdomWordsService wisdomService;
    private static final String MATH_TEACHER_PREFIX = "Math teacher says: ";

    public MathTeacher(WisdomWordsService wisdomService) {
        this.wisdomService = wisdomService;
    }

    @Override
    public String getHomeWork() {
        return MATH_TEACHER_PREFIX + "Solved 100 problems";
    }

    @Override
    public String getWisdom() {
        if (wisdomService == null) {
            return "No wisdom service injected";
        }
        return MATH_TEACHER_PREFIX + wisdomService.getMessage();
    }
}
