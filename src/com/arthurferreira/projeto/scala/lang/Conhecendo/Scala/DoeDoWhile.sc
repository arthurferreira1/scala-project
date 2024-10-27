var numero = 0

while(numero <= 10) {
  println(numero)
  numero = numero + 1
}

val roupas = List("camiseta", "calca", "shorts", "bermuda")
var contador: Int = 0

while (contador < roupas.size) {
  println("Roupa: " + roupas(contador))
  contador = contador + 1
}

var connected = false

def toConnect() = {
  println("Tentando conectar ao banco de dados")
  connected = true
  println("Conexão efetuada com sucesso!")
}


do{
  toConnect()
} while(!connected)