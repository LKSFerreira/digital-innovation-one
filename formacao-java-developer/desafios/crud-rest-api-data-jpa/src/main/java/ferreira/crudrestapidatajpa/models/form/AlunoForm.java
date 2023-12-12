package ferreira.crudrestapidatajpa.models.form;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  private String nome;

  private String cpf;

  private String bairro;

  @JsonFormat(pattern = "dd-MM-yyyy") // Jackson para formatar a data
  private LocalDate dataNascimento;
}
