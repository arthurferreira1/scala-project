package com.arthurferreira.projeto.scala.lang.oop.objects

import com.arthurferreira.projeto.scala.lang.OopClass.Roupa

object RoupaObject extends App {

  val roupa = new Roupa("Calcaaa", 48, "Carls")
  println(roupa.nome)

  roupa.nome = "Calca"
  println(roupa.nome)
  println(roupa.marca)
  println(roupa.tamanho)
}
