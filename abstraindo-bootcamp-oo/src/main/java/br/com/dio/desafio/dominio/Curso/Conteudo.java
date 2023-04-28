package br.com.dio.desafio.dominio.Curso;

public abstract class Conteudo {
    protected static final Double XP_PADRAO = 10d;
    protected String titulo;
    protected String descricao;
    public abstract Double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
