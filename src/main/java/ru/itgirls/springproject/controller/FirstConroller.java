package ru.itgirls.springproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

@RestController
public class FirstConroller {
           @GetMapping("/weekday")
               public String weekday (@RequestParam(value = "name", defaultValue = "MONDAY") String weekday){
               LocalDate date = LocalDate.now();
               DayOfWeek dayOfWeek = date.getDayOfWeek();
               Locale locale = new Locale("ru", "RU");
                   return String.format("Сегодня %s!", dayOfWeek.getDisplayName(TextStyle.FULL,locale));
           }
    }
