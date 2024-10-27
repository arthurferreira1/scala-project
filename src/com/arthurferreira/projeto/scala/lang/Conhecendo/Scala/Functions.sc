def aFunction(): String = "Criando uma function em Scala."

println(aFunction())


def soma(n1: Double, n2: Double) = n1 + n2
val result = soma(5,9)
print("Resultado da soma " + result)

println("Outra chamada a soma: " + soma(7,20))


def criaNomeCompleto(nome:String,
                     nomeDoMeio:String,
                     sobrenome:String): String = {
  var nomecompleto = nome.concat(nomeDoMeio)
  nomecompleto = nomecompleto.concat(sobrenome)
  nomecompleto
}

val NomeCompleto = criaNomeCompleto("Arthur ", "Avelino ", "Ferreira")

println(NomeCompleto)


def functionRecebeAny(v: Any) = println("O valor recebido foi: " + v)

functionRecebeAny("Carl")
functionRecebeAny(458282.78d)
functionRecebeAny(false)
val aByte: Byte = 34
functionRecebeAny(aByte)


type Texto = String //Alias

def aviso(mensagem: Texto): Texto = "Atenção " + mensagem

println(aviso("Scala não precisa ter ponto e virgula no final da linha"))






























