package ferreira.crudrestapidatajpa.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ferreira.crudrestapidatajpa.models.AlunoModel;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoModel, UUID> {

}
