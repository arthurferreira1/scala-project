package com.arthurferreira.projeto.scala.lang.heranca

class Leao extends SerVivo{
  override val nome: String = "Leao"
  override val especie: String = "Felino"
  override val quantidadeNoMundo: Double = 3213213213.45
  override def alimentacao(): Unit = println("Carne")
  override def locomocao(): Unit = println("Anda com as quatro patas")
  override def trabalho(): Unit = println("Cacar")
}
