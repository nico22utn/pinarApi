package com.pinarApi.pinarApi.Repository;

import com.pinarApi.pinarApi.entidades.Paciente;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Serializable> {

  public Paciente findByDni(String dni);
}
