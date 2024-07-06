package br.com.alura.cleber.forum.repository;

import br.com.alura.cleber.forum.models.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
