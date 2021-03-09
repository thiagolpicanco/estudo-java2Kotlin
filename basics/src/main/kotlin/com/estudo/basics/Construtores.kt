package com.estudo.basics

import com.estudo.basics.classes.PersonData
import com.estudo.basics.classes.PersonDataOnly1Constructor

class Construtores {


    fun main(){
        construtoresPrimariosESecundarios();
        utilizandoConstrutorUnico()
        utlizandoConstrutorComParametrosNaoOrdenados()
    }

    fun construtoresPrimariosESecundarios(){

        println("Forma parecida com o Java sem Utilizar o new (Utilizando o construtor Primario que fica declarado logo apos o nome da classe")
        val personNameLast = PersonData("Thiago", "Picanço");
        println(personNameLast);

        println("Aqui criamos um objeto com mais dados utilziando o construtor secundario")
        val completePerson = PersonData("Thiago", "Picanço", 31, "male");
        println(completePerson)
        println("Idade")
        println(completePerson.age);


    }

    fun utilizandoConstrutorUnico(){
        /**
         * Utilizaremos apenas um constutor (Primario) com varias formas de instanciar
         */

        println("Instanciando sem os atributos idade(null) e genero(male)")
        val personWithoutAge = PersonDataOnly1Constructor("Thiago", "Picanço");
        println(personWithoutAge)

        print("Printando idade que por padrao no construtor é um atributo nulo")
        println(personWithoutAge.age);
        print("Printando genero que por padrao no construtor é Male")
        println(personWithoutAge.gender);

        /** Aqui teriamos um erro de compilação pois no Java por exemplo teriamos um nullpointerException visto que
         * a idade esta nula **/
        //println(personWithoutAge.age.equals(personWithoutAge.name));
    }


    fun utlizandoConstrutorComParametrosNaoOrdenados(){
        //Aqui utilizamos parametros nominais como python

        println("Criando objeto com construtor com parametros invertidos utilizando o nome do atributo")
        val personNonOrdered = PersonData(lastName = "Picanço", name = "Thiago");
        println(personNonOrdered)
    }
}