package br.com.presentes.Presentes.presente.repository;

import br.com.presentes.Presentes.presente.model.Presente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresenteRepository extends JpaRepository<Presente, Long> {
    // Métodos CRUD padrões são herdados da JpaRepository
}
