package br.com.presentes.Presentes.usuario.model;

import br.com.presentes.Presentes.presente.model.Presente;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "USUARIO")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private Long id;

    @NotBlank(message = "O nome do usuário é obrigatório")
    @Column(name = "NOME")
    private String nome;

    @NotNull(message = "A senha do usuário é obrigatória, por favor, utilize uma senha diferente das suas senhas de outros apps")
    @Column(name = "SENHA_ALTERNATIVA")
    private String senhaAlternativa;

    @JsonIdentityInfo(
            generator = ObjectIdGenerators.PropertyGenerator.class,
            property = "id")
    @OneToMany(mappedBy = "usuario")
    private List<Presente> presentes;
}
