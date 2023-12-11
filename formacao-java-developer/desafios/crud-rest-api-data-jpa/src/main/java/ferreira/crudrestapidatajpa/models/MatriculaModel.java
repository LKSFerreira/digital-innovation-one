package ferreira.crudrestapidatajpa.models;

import java.time.LocalDateTime;
import java.util.UUID;

public class MatriculaModel {
  private UUID id;
  private AlunoModel aluno;
  private LocalDateTime dataDaMatricul = LocalDateTime.now();
}
