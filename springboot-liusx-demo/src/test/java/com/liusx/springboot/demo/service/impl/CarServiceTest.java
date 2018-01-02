package com.liusx.springboot.demo.service.impl;

import com.liusx.springboot.demo.dataobject.Car;
import com.liusx.springboot.demo.service.ICarService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarServiceTest {

    @Autowired
    ICarService carService;

    @Test
    public void save() {

        Car car = new Car();
        car.setId(1);
        car.setCphm("浙F12818");
        car.setHpzl("小型汽车");
        carService.save(car);
    }
}