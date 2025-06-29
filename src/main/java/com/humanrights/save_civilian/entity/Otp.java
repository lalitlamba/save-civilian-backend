package com.humanrights.save_civilian.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "otp")
public class Otp {

    @Id
    private String phoneNumber;

    private String otpCode;
    private Instant expiresAt;

}
