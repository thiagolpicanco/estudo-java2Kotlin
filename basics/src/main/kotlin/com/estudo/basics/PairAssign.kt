package com.estudo.basics




fun main(){

    print("Testando Cargo com If")
    println("Testando Tier1")

    definirIfElse(1);


    print("Testando cargo com when Lambda")

    println("Testando Tier1")
    definirCargoWhen(1)

    println("Testando Tier1")
    definirCargoWhen(2)

    println("Testando Tier1")
    definirCargoWhen(3)


}




fun definirIfElse(tier : Int){

    val (descricao : String, salario : Double) =
            if(tier == 1)
                Pair("Junior", 3000.00)
            else if(tier == 2)
                Pair("Pleno", 7000.00)
            else
                Pair("Senior", 11000.00);

    println("Descricao: $descricao")
    println("Salario: $salario")
}

/**
 * Aqui criamos uma função que cria o Pair utilizando o When e deixando a inferencia de tipo automatica
 */
fun definirCargoWhen(tier : Int){

    val (descricao, salario) = when (tier) {
        1 -> Pair("Junior", 3000.00)
        2 -> Pair("Pleno", 7000.00)
        else -> Pair("Senior", 11000.00)};


    println("Descricao: $descricao")
    println("Salario: $salario")
}








