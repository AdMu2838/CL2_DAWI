package com.cibertec.edu.daw.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.edu.daw.models.Personal;

@Repository
public interface PersonalRepository extends JpaRepository<Personal, Long> {

	public List<Personal> findByAreaCodigo(int codigoArea);

	
}