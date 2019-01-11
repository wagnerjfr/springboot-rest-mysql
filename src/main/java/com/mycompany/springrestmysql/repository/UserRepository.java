package com.mycompany.springrestmysql.repository;

import com.mycompany.springrestmysql.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
