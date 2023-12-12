package ferreira.crudrestapidatajpa.models.form;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  private UUID alunoId;

  private double peso;

  private double altura;
  
}
