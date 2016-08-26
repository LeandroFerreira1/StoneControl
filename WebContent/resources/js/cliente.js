

// Registra o evento blur do campo "cep", ou seja, quando o usuário sair do
// campo "cep" faremos a consulta dos dados

$("#cep").blur(function(){
// Para fazer a consulta, removemos tudo o que não é número do valor informado
// pelo usuário
var cep = this.value.replace(/[^0-9]/, "");
// Validação do CEP; caso o CEP não possua 8 números, então cancela a consulta
if(cep.length!=8){
return false;

}
// Utilizamos o webservice "viacep.com.br" para buscar as informações do CEP
// fornecido pelo usuário.

// A url consiste no endereço do webservice ("http://viacep.com.br/ws/"), mais o
// cep que o usuário

// informou e também o tipo de retorno que desejamos, podendo ser "xml",
// "piped", "querty" ou o que

// iremos utilizar, que é "json"

var url = "http://viacep.com.br/ws/"+cep+"/json/";

// Aqui fazemos uma requisição ajax ao webservice, tratando o retorno com
// try/catch para que caso ocorra algum

// erro (o cep pode não existir, por exemplo) o usuário não seja afetado, assim
// ele pode continuar preenchendo os campos

$.getJSON(url, function(dadosRetorno){

try{
// Insere os dados em cada campo

$("#endereco").val(dadosRetorno.logradouro);

$("#bairro").val(dadosRetorno.bairro);

$("#cidade").val(dadosRetorno.localidade);

$("#uf").val(dadosRetorno.uf);

}catch(ex){}

});
});
