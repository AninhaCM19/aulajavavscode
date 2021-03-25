package exercicios.exercicio05;

public class Ebook {
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    public Ebook (String titulo, String autor, int totalPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 0;        
        
    }

    public int exibirPagina(){
        return paginaAtual;
    }

    public void avancarPagina(){
        if(paginaAtual < totalPaginas){
            paginaAtual++;
        }
    }

    public void retrocederPagina (){
        if(paginaAtual > 0) {
            paginaAtual--;
        }
    }
    public void irParaPagina(int novaPagina) {
        if(novaPagina > -1 && novaPagina <= totalPaginas){
            paginaAtual = novaPagina;
        }
    }
    public void exibirCapa(){
        paginaAtual = 0;
        System.out.println(titulo + ", autor: " + autor + ", total de páginas: " + totalPaginas);
    }

    
}
