package com.example.demo;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAboutRespDto {
    private String str;
    private int code = ResCode.SUCCESS.value();
    private String message;
}
