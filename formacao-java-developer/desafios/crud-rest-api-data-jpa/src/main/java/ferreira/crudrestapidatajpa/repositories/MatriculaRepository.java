package ferreira.crudrestapidatajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ferreira.crudrestapidatajpa.models.MatriculaModel;

public interface MatriculaRepository extends JpaRepository<MatriculaModel, Long> {

}
