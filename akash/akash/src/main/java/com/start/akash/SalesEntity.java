package com.start.akash;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Entity
//constructor
@AllArgsConstructor
//default constructor
@NoArgsConstructor
//to print the data in the terminal by taking all values.
@ToString


public class SalesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String city;
    private String status;
}
