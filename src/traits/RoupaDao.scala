package com.arthurferreira.projeto.scala.lang.traits

import com.arthurferreira.projeto.scala.lang.OopClass.Roupa

class RoupaDao extends DaoTrait [Roupa] {

  override def salvar(t: Roupa): Roupa = t
  override def excluir(id: Int): Boolean = true
  
}
