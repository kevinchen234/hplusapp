/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.hplus.convertors;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;

import com.test.hplus.beans.Gender;

/**
 *
 * @author kevinchen
 */
public class StringToEnumConverter implements Converter<String, Gender> {

    @Override
    public Gender convert(@NonNull String s) {
        return switch (s) {
            case "Male" -> Gender.MALE;
            case "Female" -> Gender.FEMALE;
            default -> Gender.OTHER;
        };
    }

}
