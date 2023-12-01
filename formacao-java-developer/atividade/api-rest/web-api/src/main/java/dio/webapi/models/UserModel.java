package dio.webapi.models;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {

    @Id // Identifica o campo como chave primária
    @GeneratedValue(generator = "UUID") // Gera o valor do campo automaticamente
    private UUID UUID;

    @Column(length = 50) // Define o tamanho máximo do campo
    private String name;

    @Column(unique = true, length = 50) // Define o campo como único e com tamanho máximo de 50 caracteres
    private String username;

    @Column(length = 100)
    private String password;

    @Column(unique = true, length = 100)
    private String email;

    @CreationTimestamp
    private LocalDateTime createdAt;

    public UserModel(String name, String username, String password, String email) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
    }

}
