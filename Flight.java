package com.nt.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "flight")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {


@Id
@Generated(strategy = GenerationType.IDENTITY)
private Long flightId;


private String flightName;
private String source;
private String destination;
private Double price;
}


}

