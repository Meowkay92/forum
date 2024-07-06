package br.com.alura.cleber.forum.controller;

import br.com.alura.cleber.forum.models.Curso;
import br.com.alura.cleber.forum.models.Topico;
import br.com.alura.cleber.forum.repository.CursoRepository;
import br.com.alura.cleber.forum.repository.TopicoRepository;
import org.antlr.v4.runtime.misc.NotNull;

public class Form {
    @NotNull
    private String  titulo;
    @NotNull
    private String mensagem;
    @NotNull
    private String nomeCurso;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getMensagem() {
        return mensagem;
    }
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public Topico converter(CursoRepository cursoRepository) {
        Curso curso = cursoRepository.findByNome(nomeCurso);
        return new Topico(titulo, mensagem, curso);
    }
    public Topico atualizar(Long id, TopicoRepository topicoRepository) {
        Topico topico = topicoRepository.getOne(id);
        topico.setTitulo(this.titulo);
        topico.setMensagem(this.mensagem);

        return topico;
    }
}
