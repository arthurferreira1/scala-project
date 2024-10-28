package com.arthurferreira.projeto.scala.lang.oop.objects

import com.arthurferreira.projeto.scala.lang.OopClass.Colaborador

object ColaboradorObject {

  def main(args: Array[String]): Unit = {

    val colaborador = new Colaborador
    colaborador.descricao()
    println(colaborador.mensagem("Debora"))
  }
}
