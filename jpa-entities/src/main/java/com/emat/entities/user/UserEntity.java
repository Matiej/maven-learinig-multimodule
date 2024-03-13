package com.emat.entities.user;

import com.emat.entities.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class UserEntity extends BaseEntity {

    private String firstname;
    private String lastname;
    private String email;
    private int age;
}
