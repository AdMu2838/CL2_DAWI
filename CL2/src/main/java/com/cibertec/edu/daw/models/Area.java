package com.cibertec.edu.daw.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "AREA")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Area implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_AREA")
    int codigo;

    @Column(name = "AREA_NOMBRE")
    String nombreArea;

    @Column(name = "AREA_JEFE")
    String jefeArea;

    @OneToMany(mappedBy = "area")
    List<Personal> personalList;
}