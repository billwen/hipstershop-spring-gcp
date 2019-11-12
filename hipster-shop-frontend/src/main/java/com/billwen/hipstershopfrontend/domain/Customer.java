package com.billwen.hipstershopfrontend.domain;

import lombok.Data;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.*;

@Data
@Entity
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, length = 128)
    private String accountName;

    @Enumerated(value= EnumType.STRING)
    @Column(nullable = false, length= 32)
    private Source accountSource = Source.LOCAL_USER;

    @NotBlank
    @Nationalized
    @Column(nullable = false, length=128)
    private String customerName;

    @NotBlank
    @Column(nullable = false)
    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(updatable = false, nullable = false)
    private Date createdOn;

    @Type(type = "yes_no")
    private boolean actived = false;

    @NotEmpty
    private String avatarFilePath;

    // Ship Address
    @ElementCollection
    @CollectionTable(name = "CustomerShippingAddress")
    private Set<CustomerShippingAddress> shippingAddresses = new HashSet<CustomerShippingAddress>();

    // System privilleges
    @ManyToMany(cascade = CascadeType.PERSIST)
    private Set<SystemRole> roles = new HashSet<SystemRole>();

    public static enum Source {
        LOCAL_USER,
        GOOGLE_USER,
        FACEBOOK_USER,
        TWITTER_USER
    }
}
