package com.project.foodorder.response;

import lombok.*;
import org.springframework.stereotype.Component;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class UniversalResponse  {
    private String status;
    private String message;
    private Object data;
}