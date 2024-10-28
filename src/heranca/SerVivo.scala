package com.arthurferreira.projeto.scala.lang.heranca

abstract class SerVivo {
  val nome: String = "Ser vivo"
  val especie: String
  val quantidadeNoMundo: Double

  def alimentacao(): Unit
  def locomocao(): Unit
  def trabalho(): Unit
  def extinto(): Boolean = false

}
