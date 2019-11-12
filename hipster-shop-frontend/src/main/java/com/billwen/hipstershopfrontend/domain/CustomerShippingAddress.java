package com.billwen.hipstershopfrontend.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class CustomerShippingAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String addressName;

    @NotBlank
    private String contactPerson;

    @NotBlank
    private String country;

    private String state;

    @NotBlank
    private String city;

    @NotBlank
    private String address;

}
