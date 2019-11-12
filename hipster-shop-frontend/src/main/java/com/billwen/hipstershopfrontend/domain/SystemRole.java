package com.billwen.hipstershopfrontend.domain;

import lombok.Data;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class SystemRole implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(nullable = false)
    private String roleCode;

    @NotEmpty
    @Nationalized
    @Column(nullable = false)
    private String roleName;

    // Users assigned with the role
    @ManyToMany(mappedBy = "roles")
    private Set<Customer> customers = new HashSet<>();
}
