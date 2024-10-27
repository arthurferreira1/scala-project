def tipoDeComunicacao(tipo: String): Unit = {
  if (tipo == "email") {
    println("Enviar E-mail ao cliente")
  } else if (tipo == "celular") {
    println("Ligar para o cliente")
  } else {
    println("Erro! Esse é outro tipo de comunicacao")
  }
}
tipoDeComunicacao("celular")
tipoDeComunicacao("email")
tipoDeComunicacao("Whatsapp")

//if ternary

val autorizacao = 18
val idade = 18

val resultado = if(idade < autorizacao) "Não autorizado" else "Sim! Está autorizado"

println(resultado)