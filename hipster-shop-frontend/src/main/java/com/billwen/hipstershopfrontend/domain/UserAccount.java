package com.billwen.hipstershopfrontend.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @NotBlank
    String accountName;

    @Enumerated(value=EnumType.STRING)
    Source accountSource;

    @NotBlank

    @NotBlank
    String name;

    public static enum Source {
        LOCAL_USER,
        GOOGLE_USER,
        FACEBOOK_USER,
        TWITTER_USER
    }
}
