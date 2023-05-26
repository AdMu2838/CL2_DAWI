package com.cibertec.edu.daw.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.edu.daw.models.Personal;


public interface PersonalService {
	List<Personal> getAllPersonal();

    List<Personal> findByAreaCodigo(int codigoArea);
}
