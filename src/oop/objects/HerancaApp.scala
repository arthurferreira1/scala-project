package com.arthurferreira.projeto.scala.lang.oop.objects

import com.arthurferreira.projeto.scala.lang.heranca.{Humano, Leao}

object HerancaApp extends App {
  val humano = new Humano
  println(humano.nome)
  humano.trabalho()

  val leao = new Leao
  leao.trabalho()
  leao.alimentacao()

}
