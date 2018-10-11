package com.pinarApi.pinarApi.Repository;

import com.pinarApi.pinarApi.entidades.Area;
import com.pinarApi.pinarApi.entidades.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("personalRepository")
public interface PersonalRepository extends JpaRepository<Personal, Serializable> {

    List<Personal> findByArea(Area area);
}
