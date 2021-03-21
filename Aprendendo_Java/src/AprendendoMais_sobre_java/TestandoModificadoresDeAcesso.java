package AprendendoMais_sobre_java;

public class TestandoModificadoresDeAcesso {

    public static void main(String[] args) {
      Usuario modificandoUsuario = new Usuario();
      System.out.println(modificandoUsuario.getNomeCompleto());
      System.out.println(modificandoUsuario.getTelefone());
      System.out.println(modificandoUsuario.idade);
      System.out.println(modificandoUsuario.senha);


    }
}
