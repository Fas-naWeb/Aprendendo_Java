package AprendendoMais_sobre_java;
/*
    Autor:Fabiano Alves Santos
    Email:fasnaweb2020@gmail.com
    Data:17/03/2021s
*/
public class TiposDeDadosJava {
    public static void main(String[] args) {
        //INTEIROS

        //byte b = null; Nunca pode ser nulo

        byte b;    //8 bits
        byte b1 = 127;
        byte b2 = -128;

        char c;    //16 bits
        char c1 = 'A';
        char c2 = 15;

        short s;   //16 bits
        short s1 = 32767;
        short s2 = -3278;

        int i;     //32 bits
        int i1 = 2147483647;
        int i2 = -2147483648;

        long l;     //64 bits
        long l1 = 9223372036854775807L;
        long l2 = -9223372036845775808L;

        //FLUTUANTES

        float f = 65f;   //32 bits
        float f1 = 65.0f;
        float f2 = -0.5f;

        double d; //64 bits
        double d1 = 1024.99;
        double d2 = 10.2156;

        // WRAPPER
        // São objetos que representam os primitivos
        // Auto boxing e um boxing

        Byte B;    //8 bits
        Byte B1 = 127;
        Byte B2 = -128;

        Character C;    //16 bits
        Character C1 = 'A';
        Character C2 = 15;


        Short S;   //16 bits
        Short S1 = 32767;
        Short S2 = -3278;

        Integer I;     //32 bits
        Integer I1 = 2147483647;
        Integer I2 = -2147483648;

        Long L;     //64 bits
        Long L1 = 9223372036854775807L;
        Long L2 = -9223372036845775808L;

        //FLUTUANTES

        Float F = 65f;   //32 bits
        Float F1 = 65.0f;
        Float F2 = -0.5f;

        Double D; //64 bits
        Double D1 = 1024.99;
        Double D2 = 10.2156;

        Boolean O;
        Boolean O1 = true;
        Boolean O2 = false;

        //TIPOS NÃO PRIMITIVOS
        String texto = "fasweb"; // É uma sequencia de caracteres
        Void vi; // Tipo válido mais num é nada
        Object obj = new Object();
        // Number num = Integer.valueOf(1);
        //num.toString();

        // MODIFICADORES DE ACESSO
                /*
                   PUBLIC
                   Public pode ser acessado de qualquer lugar por qualquer entidade que possa visualizar a classe a
                   que ela pertence.

                   PRIVATE
                   Os métodos e atributos da classe definidos como privado não podem ser acessados ou usados por nenhuma
                   outra classe.Esses atributos e métodos também não podem ser visualizados pelas classes herdadas.

                   PROTECTED
                   Torna o membro acessivel ás classes do mesmo pacote  ou através de herança seus membros herdados
                   não são acessiveis  a outra classe fora do pacote onde foram declarados.

                   DEFAULT
                   A classe e/ou seus  membros são acessiveis somente por classes do mesmo pacote, na sua declaração
                   não é definido nenhum tipo de modificador ,sendo este identificado pelo compilador.

                   ABSTRACT -> Significa que é uma idéia de uma classe,ela em si não pode se transforma num objeto.
                   Ela não pode ser instanciada.

                   Esse modificador não é aplicado nas variáveis,apenas em classes e métodos.Uma classe abstrata não
                   pode ser instanciada.Se ouver alguma declaração de um método abstrata,a classe deve ser também mar-
                   cada como abstrata.

                   STATIC
                   É usado para criação de variável que podera ser acessada por todas as instancias de objetos desta
                   classe como uma variável comum,ou seja, a variável criada será a mesma em todas  as insrtâncias e
                   quando seu conteúdo é modificado numa das instâncias, a modificação acorre em todas  as demais. É
                   nas declarações de métodos ajudam no acesso direto á classe,portanto não é necessário instanciar um
                   objeto para acessar o método.

                   FINAL
                   Quando é aplicado na classe,não permite estender,nos métodos impede que  o mesmo seja sobrescrito
                   (overriding)na subclasse, e nos valores de variáveis não pode ser alterado depois que ja tenha sido
                   atribuído um valor.

                   INTERFACES
                   MÉTODOS ABSTRATOS
                   Devem ser implementados por todos;
                   Novos métodos quebram as implementações;

                   MÉTODOS DEFAULT
                   São herdados a todos que implementam;
                   Novos métodos não quebram as implementações

                   HERANÇA MÚLTIPLA

                 */
    }
}
