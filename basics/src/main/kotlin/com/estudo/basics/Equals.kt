package com.estudo.basics

import com.estudo.basics.classes.PersonData
import com.estudo.basics.classes.PersonKt

class Equals {


    fun main(){
        classeComumEquals()
        classeDataEquals()
    }


    fun classeComumEquals(){

        /** Testando Criacao de dois Objetos da mesma classe e printando o dado e fazendo comparacoes **/

        val person = PersonKt("Thiago", "Picanço")
        val person2 = PersonKt("Thiago", "Picanço")

        //Printara o nome
        println(person.name)
        // Thiago

        //Comparação / Equals
        /**
         * Em Kotlin == é o mesmo que Equals
         */
        println(person.equals(person2));
        println(person == person2);
        // $FALSE em Ambos pois a classe comum não possui equals implementado

    }

    fun classeDataEquals(){
        /** Utilizando DataClass **/

        println("Data Class possui por padrao Equals/HashCode/ToString implementados");

        val personD = PersonData("Thiago", "Picanço", 31, "Male")
        val personD2 = PersonData("Thiago", "Picanço", 31, "Male")


        println("Printara o nome")
        println(personD.name)
        // Thiago

        println("Comparação / Equals")
        println(personD.equals(personD2));
        // $True
        println(personD == personD2);
        // $True

        println(/**
         * Comparação Memoria, aqui não utiliza o Equals, seria como o == em JAVA
         */"")
        println(personD === personD2);
        // $False

    }
}