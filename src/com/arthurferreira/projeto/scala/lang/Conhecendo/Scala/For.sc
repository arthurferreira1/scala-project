for(numero <- 0 to 10) println("O Valor do numero: " + numero)

for(numero <- 0 to 10 by 2) {
  println("Imprimindo o numero par: " + numero)
}

val frutas = List("Banana", "Laranja", "Amora", "Abacaxi", "Uva")

for(fruta <- frutas) {
  println("Fruta: " + fruta)
}

for(fruta <- frutas) {
  println("Fruta: " + fruta)
}

val frutasComecandoComA = for {
  fruta <- frutas
  if(fruta.startsWith("A"))
} yield fruta.toUpperCase()

println(frutasComecandoComA)