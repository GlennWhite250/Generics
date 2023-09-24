package Vet

import Contest.Pet

class Vet<T: Pet> {
    fun treat(t: T){
        println("Treat Pet ${t.name}.")
    }
}