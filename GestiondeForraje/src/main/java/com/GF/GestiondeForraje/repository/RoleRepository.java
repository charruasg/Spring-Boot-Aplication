package com.GF.GestiondeForraje.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.GF.GestiondeForraje.entity.Role;
@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

}
