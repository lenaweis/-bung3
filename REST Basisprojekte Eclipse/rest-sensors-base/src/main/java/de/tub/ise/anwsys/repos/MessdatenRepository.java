package de.tub.ise.anwsys.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tub.ise.anwsys.models.Messdaten;

public interface MessdatenRepository extends JpaRepository<Messdaten, Long>{

}
