package de.itech.progress.dockerspringmysql.entities;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@Builder
public class User implements Serializable {
    @Id
    private String userId;
    private String username;
    private String password;
}
