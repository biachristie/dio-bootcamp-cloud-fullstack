// TODO: faça um programa que retorne a data da entrada com o mês por extenso

let data = gets()
let dataSplit = data.split('/')
let mesExtenso = '';

switch (parseInt(dataSplit[1])) {
    case 01:
        mesExtenso = 'Janeiro'
        break;
    case 02:
        mesExtenso = 'Fevereiro'
        break;
    case 03:
        mesExtenso = 'Março'
        break;
    case 04:
        mesExtenso = 'Abril'
        break;
    case 05:
        mesExtenso = 'Maio'
        break;
    case 06:
        mesExtenso = 'Junho'
        break;
    case 07:
        mesExtenso = 'Julho'
        break;
    case 08:
        mesExtenso = 'Agosto'
        break;
    case 09:
        mesExtenso = 'Setembro'
        break;
    case 10:
        mesExtenso = 'Outubro'
        break;
    case 11:
        mesExtenso = 'Novembro'
        break;
    case 12:
        mesExtenso = 'Dezembro'
        break;
}

print(dataSplit[0] + ' de ' + mesExtenso + ' de ' + dataSplit[2])