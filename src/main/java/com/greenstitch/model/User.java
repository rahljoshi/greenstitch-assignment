package com.greenstitch.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String username;
    private String password;

}
