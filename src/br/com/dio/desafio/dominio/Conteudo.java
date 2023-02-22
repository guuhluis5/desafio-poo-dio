package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    //Variável que nunca irá mudar, por isso o "final"
    protected static final double XP_PADRAO = 10d;

    public String titulo;
    public String descricao;

    //Método para calcular o xp caso o aluno faça algo, algum curso por exemplo
    public abstract double calcularXp();

    //Get e Set para modificar os títulos e as descrições caso for preciso

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
