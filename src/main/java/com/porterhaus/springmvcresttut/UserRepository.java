package com.porterhaus.springmvcresttut;

import org.springframework.data.repository.CrudRepository;

import com.porterhaus.springmvcresttut.io.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
