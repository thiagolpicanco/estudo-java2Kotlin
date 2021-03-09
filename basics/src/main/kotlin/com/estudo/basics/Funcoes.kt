package com.estudo.basics


fun main(){
    println("Chamando funcao Comum com o argumento Thiago")
    funcPrint("Thiago")
    println("Chamando funcao que possui default Argument com o argumento1 Thiago o qual possui um argumentoPadrao")
    funcDefaultArg("Thiago")
    println("Chamando funcao que possui default Argument com o argumento1 Thiago e o sobreescrevendo segundo argumento")
    funcDefaultArg("Thiago", "Lopes")



    println("Chamando funcao que possui default Argument com o argumento1 Thiago " +
            "e o sobreescrevendo segundo argumento, porem invertendo os atributos usando o nome")
    funcDefaultArg(padrao = "Lopes", argumento1 = "Thiago")


    println("Chamando funcao que aceita parametro nulo")
    funcAcceptNull(null)


    println("Chamando funcao que aceita parametro nulo e o compara, No Java estouraria NullPointerException")
    funcAcceptNullEquals(null)


    /**
     * Aqui tentamos chamar uma funcao com um argumento nulo
     * Um erro de compilação acontece visto que a funcao nao permite null
     */
    // funcPrint(null);

}

/**
 * Funcao Comum printando um argumento simples
 */
fun funcPrint(arg1 : String) {
    println("Argumento: $arg1")
}

/**
 * Funcao com Argumento Default
 * Caso não seja enviado um segundo argumento usa-se o padrao
 * do Contrario usa o que recebeu
 */
fun funcDefaultArg(argumento1 : String, padrao : String = "ArgumentoPadrao") {
    println("Argumento1: $argumento1, ArgumentoPadrao: $padrao")
}

/**
 * Funcao com Argumento permitindo ser nulo
 */
fun funcAcceptNull(argumento1 : String?) {
    println("Argumento1: $argumento1")
}

/**
 * Funcao com Argumento permitindo ser nulo e que compara com outra
 */
fun funcAcceptNullEquals(argumento1 : String?) {
    println("teste" == argumento1);
}






