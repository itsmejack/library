package com.library;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<ModelUser, String> {
}
