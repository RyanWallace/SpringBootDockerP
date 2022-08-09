package org.springframework.springboot.sample.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
@Setter
@Table(name = "CUSTOMER")
public class Customer extends BaseEntity {

    @Column(name = "FIRST_NAME")
    @NotEmpty
    private String firstName;

    @Column(name = "LAST_NAME")
    @NotEmpty
    private String lastName;

    @Column(name = "ADDRESS")
    @NotEmpty
    private String address;

    @Column(name = "CITY")
    @NotEmpty
    private String city;

    @Column(name = "TELEPHONE")
    @NotEmpty
    @Digits(fraction = 0, integer = 10)
    private String telephone;

    @Column(name = "EMAIL")
    @NotEmpty
    private String email;
}
