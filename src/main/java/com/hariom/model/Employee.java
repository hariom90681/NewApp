package com.hariom.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Employee
{
    @Id
    @GeneratedValue
    private Integer empId;

    @NonNull
    private String empName;
    @NonNull
    private Double empSal;
}
