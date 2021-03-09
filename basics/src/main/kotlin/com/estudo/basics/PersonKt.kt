package com.estudo.basics.classes

class PersonKt(var name: String, var lastName: String){

}

/**
 * DataClass possui Equals/HashCode/ToString ja implementados
 * classe protegida (nullsafe)
 */
data class PersonData(var name: String, var lastName: String) {
    var age: Int = 0;
    var gender: String = "Unknown";

    //Constutor Secundario
    constructor(name: String, lastName: String, age: Int, gender: String) : this(name, lastName) {
        this.age = age;
        this.gender = gender;
    }
}

/**
 * DataClass possui Equals/HashCode/ToString ja implementados
 * classe com apenas um constutor podendo ter o parametro age nulo
 */
data class PersonDataOnly1Constructor(var name: String, var lastName: String, var age: Int? = null, var gender: String = "Male");



