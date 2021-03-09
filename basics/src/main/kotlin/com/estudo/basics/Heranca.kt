package com.estudo.basics

open class Dog(val nome: String){
    open fun latir(){
        println("Latido do $nome Au Au")
    }
}

class Labrador(nome : String) : Dog(nome);

/**
 * Sobreescrevendo a funcao latir
 * Importante: só é possivel sobreescrever funcoes OPEN
 */
class Pincher(nome : String) : Dog(nome){
    override fun latir(){
        println("Latido do $nome -> Au au Au Au Au Au au")
    }
}

    fun main(){

        println("Labrador ira latir como padrao de qualquer Dog")
        Labrador("Aamarelo").latir()

        println("Pincher ira latir o triplo")
        Pincher("Diabo").latir();
    }








