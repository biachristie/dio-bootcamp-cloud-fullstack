// TODO: faça um programa que contabilize quantos espaços em branco e quantas vogais existem na string de entrada

let str = 'Navegar nas aguas do teu mar'
let strSplit = str.toLowerCase().split('');

let espacosEmBranco = [];
let vogais = [];

for (let index = 0; index < strSplit.length; index++) {
    if(strSplit[index]==' '){
        espacosEmBranco.push(strSplit[index])
    }
}

let referenciaVogais = ['a', 'e', 'i', 'o', 'u']

for (let j = 0; j < referenciaVogais.length; j++) {
    for (let index = 0; index < strSplit.length; index++) {
        if(strSplit[index]==referenciaVogais[j]){
            vogais.push(strSplit[index])
        }
    }
}

console.log('Espacos em branco: ' + espacosEmBranco.length + ' Vogais: ' + vogais.length)