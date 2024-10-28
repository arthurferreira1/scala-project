package com.arthurferreira.projeto.scala.lang.heranca

class Humano extends SerVivo {

  override val nome: String = "Mulher"
  override val especie: String = "Humano"
  override val quantidadeNoMundo: Double =  423213213.65d
  override def alimentacao(): Unit = println("Carnes, Vegetais e Doces")
  override def locomocao(): Unit = println("De carro, a pes")
  override def trabalho(): Unit = println("Programadoras, professoras, etc..")
}
