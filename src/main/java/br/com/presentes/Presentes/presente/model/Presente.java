package br.com.presentes.Presentes.presente.model;

import br.com.presentes.Presentes.usuario.model.Usuario;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PRESENTE")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Presente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRESENTE")
    private Long id;

    @NotBlank(message = "O nome do presente é obrigatório")
    @Column(name = "NOME")
    private String nome;

    @NotBlank(message = "A descrição do presente é obrigatória")
    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "COMPRADO")
    private Boolean comprado;

    @JsonIdentityInfo(
            generator = ObjectIdGenerators.PropertyGenerator.class,
            property = "id")
    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private Usuario usuario;

}
