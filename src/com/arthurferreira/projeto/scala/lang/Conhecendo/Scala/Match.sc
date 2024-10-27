def executaComunicacao(tipoComunicacao: String) = tipoComunicacao match {
  case "email" => "Enviar email ao cliente"
  case "celular" => "Ligar para o cliente via celular"
  case _ => "Erro! O tipo de comunicação não é válido"
}

println(executaComunicacao("celular"))

/*
* match para Any
*/

def descubrirTipo(tipo: Any): Unit = tipo match {
  case s: String => println("O tipo informado foi string")
  case f: Float => println("O tipo informado foi Float")
  case i: Int => println("O tipo informado foi Int")
  case _ => println("Tipo não reconhecido")
}

descubrirTipo('A')



//Boolean com Match

def menorDeIdade(validacao: Boolean): Unit = validacao match {
  case true => println("Menor de idade")
  case false => println("Parabens, maior de idade!")
  case _ => println("Idade invalida")
}

var maiorIdade: Int = 18
val idade: Int = 18

menorDeIdade(idade < maiorIdade)


def selecionaNomeDoMes(mes: Any): Unit = mes match {
  case 1 | "Jan" => println("Janeiro")
  case 2 | "Fev" => println("Fevereiro")
  case 3 | "Mar" => println("Março")
  case _ => "Mês desconhecido"
}

selecionaNomeDoMes(3)



































