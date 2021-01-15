package com.tiquete.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.tiquete.persistence.entity.Tiquete;

public interface TiqueteCrudRepository extends CrudRepository<Tiquete, Integer> {

}
