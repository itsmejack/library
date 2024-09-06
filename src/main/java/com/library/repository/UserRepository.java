package com.library.repository;

import com.library.model.ModelUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<ModelUser, String> {

    ModelUser findByUsername(String username);
}
