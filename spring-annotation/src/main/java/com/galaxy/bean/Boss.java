package com.galaxy.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/25 8:16
 */
@Component
@Data
public class Boss {
    private Car car;

    public Boss() {
        System.out.println("boss的无参构造");
    }

    public Car getCar() {
        return car;
    }

    @Autowired
    public void setCar( Car car) {
        this.car = car;
    }
}
