package de.itech.progress.dockerspringmysql.dao;

import de.itech.progress.dockerspringmysql.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, String> {
}
