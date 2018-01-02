package com.liusx.springboot.demo.repository;

import com.liusx.springboot.demo.dataobject.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarRepository extends JpaRepository<Car, Integer> {
}
