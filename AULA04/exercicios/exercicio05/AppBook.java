package exercicios.exercicio05;

public class AppBook {
    public static void main(String[] args) {
        Ebook livro = new Ebook("Como programar em Java", "Ana Marques", 20);

    System.out.println("pagina atual " + livro.exibirPagina());
    livro.irParaPagina(-1);
    System.out.println("pagina atual " + livro.exibirPagina());
    livro.irParaPagina(3);
    System.out.println("pagina atual " + livro.exibirPagina());
    livro.irParaPagina(30);
    System.out.println("pagina atual " + livro.exibirPagina());

    livro.avancarPagina();
    livro.avancarPagina();
    livro.avancarPagina();
    livro.avancarPagina();
    System.out.println("pagina atual " + livro.exibirPagina());

    livro.exibirCapa();
    System.out.println("pagina atual " + livro.exibirPagina());
            
    }
    
}
