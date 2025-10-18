package com.devmind.springapp.impl;

import com.devmind.springapp.abs.ITeacher;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MathTeacher implements ITeacher {
    private WisdomWordsService wisdomService;
    private static final String MATH_TEACHER_PREFIX = "Math teacher says: ";

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
