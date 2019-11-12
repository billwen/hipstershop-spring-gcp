package com.billwen.hipstershopfrontend.domain;

import lombok.Data;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.Parent;

import javax.persistence.*;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@Embeddable
public class CustomerShippingAddress implements Serializable {
    @Parent
    private Customer customer;

    @NotBlank
    @Nationalized
    @Column(nullable = false)
    private String addressName;

    @NotBlank
    @Nationalized
    @Column(nullable = false)
    private String contactPerson;

    @NotBlank
    @Nationalized
    @Column(nullable = false)
    private String country;

    @Nationalized
    private String state;

    @NotBlank
    @Nationalized
    @Column(nullable = false)
    private String city;

    @NotBlank
    @Nationalized
    @Column(nullable = false)
    private String address;

    private String mobileNumber;

}
