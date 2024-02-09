package de.itech.progress.dockerspringmysql.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
public class User implements Serializable {
    @Id
    private String userId;
    private String username;
    private String password;
}
