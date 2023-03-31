let vetor = [];
let pares = [];
let impares = [];

for(let i = 0; i < 5; i++){
    let resp = parseInt(gets());
    vetor.push(resp);
}

//TODO: Implemente uma condição para o armazenamento dos números PARES e ÍMPARES:

for(let j = 0; j < vetor.length; j++){
    if (vetor[j]%2 == 0){
        pares.push(vetor[j])
    } else {
        impares.push(vetor[j])
    }
}

//TODO: Imprima os valores dos três vetores um em cada linha:

console.log('Vetor: ' + vetor);
console.log('Par(es): ' + pares);
console.log('Impar(es): ' + impares);