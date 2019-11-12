package com.billwen.hipstershopfrontend.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String accountName;

    @Enumerated(value= EnumType.STRING)
    private Source accountSource = Source.LOCAL_USER;

    @NotBlank
    private String customerName;

    @NotBlank
    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(updatable = false, nullable = false)
    private Date createdOn;

    private boolean actived = false;

    @NotEmpty
    private String avatarFilePath;

    public static enum Source {
        LOCAL_USER,
        GOOGLE_USER,
        FACEBOOK_USER,
        TWITTER_USER
    }
}
