package com.devmind.annotation.springapp.impl;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class HomeworkService {
    private String homeWork = "This is your java homework";
}
