package com.galaxy.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/23 23:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
    @Value("hance")
    private String name;
    @Value("18")
    private int age;
}
