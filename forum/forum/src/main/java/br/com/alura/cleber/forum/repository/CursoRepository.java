package br.com.alura.cleber.forum.repository;

import br.com.alura.cleber.forum.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository  extends JpaRepository<Curso, Long> {

    Curso findByNome(String nome);

}
