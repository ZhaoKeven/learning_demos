package com.example.quartz.model;

import lombok.Data;

@Data
public class TriggerEntity<T> {
    private String className;
    private T data;
}
