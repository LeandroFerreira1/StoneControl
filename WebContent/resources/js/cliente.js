

// Registra o evento blur do campo "cep", ou seja, quando o usu�rio sair do
// campo "cep" faremos a consulta dos dados

$("#cep").blur(function(){
// Para fazer a consulta, removemos tudo o que n�o � n�mero do valor informado
// pelo usu�rio
var cep = this.value.replace(/[^0-9]/, "");
// Valida��o do CEP; caso o CEP n�o possua 8 n�meros, ent�o cancela a consulta
if(cep.length!=8){
return false;

}
// Utilizamos o webservice "viacep.com.br" para buscar as informa��es do CEP
// fornecido pelo usu�rio.

// A url consiste no endere�o do webservice ("http://viacep.com.br/ws/"), mais o
// cep que o usu�rio

// informou e tamb�m o tipo de retorno que desejamos, podendo ser "xml",
// "piped", "querty" ou o que

// iremos utilizar, que � "json"

var url = "http://viacep.com.br/ws/"+cep+"/json/";

// Aqui fazemos uma requisi��o ajax ao webservice, tratando o retorno com
// try/catch para que caso ocorra algum

// erro (o cep pode n�o existir, por exemplo) o usu�rio n�o seja afetado, assim
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
