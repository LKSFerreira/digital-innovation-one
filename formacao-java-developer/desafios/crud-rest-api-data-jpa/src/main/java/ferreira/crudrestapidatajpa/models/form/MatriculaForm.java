package ferreira.crudrestapidatajpa.models.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class MatriculaForm {

  @NotBlank(message = "O campo alunoId não pode ser vazio")
  @Positive(message = "O campo alunoId deve ser um número positivo")
  private Long alunoId;

}
