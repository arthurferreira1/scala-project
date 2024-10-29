package com.arthurferreira.projeto.scala.lang.CaseClass

object ConhecendoCaseClass extends App {
  case class Funcionario(var nome: String, idade: Int, telefoneComercial: String = "+55 11 3322-0000")

  val carl = new Funcionario("Carl Edwin", 38)
  println("idade do " + carl.nome + " " + carl.idade + "anos e o telefone " + carl.telefoneComercial)

  carl.nome = "novo nome"


}
