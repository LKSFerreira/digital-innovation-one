package ferreira.crudrestapidatajpa.models;

import java.time.LocalDateTime;
import java.util.UUID;

public class AvaliacaoFisicaModel {
  private UUID id;
  private AlunoModel aluno;
  private LocalDateTime dataDaAvaliacao = LocalDateTime.now();
  private Double peso;
  private Double altura;
}
