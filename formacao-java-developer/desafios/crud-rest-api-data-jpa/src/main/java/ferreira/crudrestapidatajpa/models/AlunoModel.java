package ferreira.crudrestapidatajpa.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AlunoModel {

  private UUID id;
  private String nome;
  private String cpf;
  private String bairro;
  private LocalDate dataNascimento;
  private List<AvaliacaoFisicaModel> avaliacoesFisicas = new ArrayList<>();
}
