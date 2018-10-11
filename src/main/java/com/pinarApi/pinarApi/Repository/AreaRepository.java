package com.pinarApi.pinarApi.Repository;

import com.pinarApi.pinarApi.entidades.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("areaRepository")
public interface AreaRepository extends JpaRepository<Area, Serializable> {

    Area findByNombreArea(String nombre);
}
