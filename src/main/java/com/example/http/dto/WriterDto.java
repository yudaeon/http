package com.example.http.dto;

import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Data
public class WriterDto {
    private String name;
    private Integer age;
    private String address;

}
