package com.menaxhim.repository;

import com.menaxhim.entities.Departament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DepartamentRepository extends JpaRepository<Departament, String> {

}
