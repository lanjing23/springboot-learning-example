package com.liusx.springboot.demo.service.impl;

import com.liusx.springboot.demo.dataobject.Car;
import com.liusx.springboot.demo.repository.ICarRepository;
import com.liusx.springboot.demo.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService implements ICarService {

    @Autowired
    ICarRepository carRepository;

    @Override
    public Car save(Car car) {
        return carRepository.save(car);
    }
}
