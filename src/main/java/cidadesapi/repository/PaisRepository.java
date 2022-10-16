package cidadesapi.repository;

import cidadesapi.model.Pais;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface PaisRepository extends JpaRepository<Pais,Integer> {
//    Page<Pais> findAll(java.awt.print.Pageable );
}
