package com.arthurferreira.projeto.scala.lang.traits

trait DaoTrait[T] {
  def salvar(t: T): T
  def excluir(id: Int): Boolean
}

