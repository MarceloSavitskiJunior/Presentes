package br.com.presentes.Presentes.presente.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
public class Presente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "O nome do presente é obrigatório")
    @Column(name = "nome")
    private String nome;

    @NotBlank(message = "A descrição do presente é obrigatória")
    @Column(name = "descricao")
    private String descricao;

}