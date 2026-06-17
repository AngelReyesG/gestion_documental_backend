package com.tgm.repository;

import com.tgm.model.Oficio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OficioRepository extends JpaRepository<Oficio, Integer> {

    List<Oficio> findByFolioContainingIgnoreCaseOrAsuntoContainingIgnoreCase(String folio, String asunto);
}
