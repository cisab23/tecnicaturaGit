//Clase 6
var nombre = 'Jose';
var apellido = ' Montes';
var nombreCompleto = nombre+' '+apellido; //Primera concatenacion
console.log(nombreCompleto);
var nombreCompleto2 = 'Juan'+' '+'Perez'; //Segunda concatenacion
console.log(nombreCompleto2);
var juntos = nombre + 219; //Lee de izq a der siguiendo la cadena lee el numero como str
console.log(juntos);
juntos = nombre + 78 + 17;
console.log(juntos);
juntos = 78 + 17 + nombre;
console.log(juntos);

nombre += apellido; //Operador simplificado
console.log(nombre);

// Clase 7
let nombre2 = "Pedro";
console.log(nombre2);

const apellido2 = "Lepes";
//apellido2 = "Peres"; una constante no puede ser modificada
console.log(apellido2);

let x, y; //Se pueden crear varias variables dentro de una misma linea
x = 17, y = 21; //Se pueden asignar varias variables dentro de una misma linea
let z = x + y; //Se asigna el valor de la operacion
console.log(z);

// let _1num = 31; No utilizar numeros para iniciar el nombre de una variable
// let break = "rompe"; No utilizar palabras reservadas para variables