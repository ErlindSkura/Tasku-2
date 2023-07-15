package com.menaxhim.repository;

import com.menaxhim.entities.Punonjes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PunonjesRepository extends JpaRepository<Punonjes, String> {

}
