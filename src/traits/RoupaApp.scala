package com.arthurferreira.projeto.scala.lang.traits

import com.arthurferreira.projeto.scala.lang.OopClass.Roupa

object RoupaApp extends App{

  val dao = new RoupaDao

  val vestido = dao.salvar(new Roupa("Vestido", 46, "Levis") )

  println(vestido.nome)
  println(vestido.marca)
  println(vestido.tamanho)

  println(dao.excluir(26))

}
