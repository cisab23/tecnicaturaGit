// Clase 7
// Hoy ya no se usa var, se utiliza let y const
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

// Clase 8
// Ampliando el uso de var let y const
/* Con var se puede reasignar en cualquier momento,
esta forma parte del ambito global.
Un error es que se sobreescriba */

var nombre = "Ariel";
nombre = "Osvaldo";
console.log(nombre);

function saludar(){
    var nombre3 = "Natalia";
    console.log(nombre3);
}
//console.log(nombre3); //No lee el dato en la funcion

if(true){
    var edad = 34;
    console.log(edad);
}
console.log(edad); //En la funcion funciona correctamente, en la estructura if falla

/* let: puede ser reasignada en cualquier momento
la diferencia es que su ambito es de bloque, solo
disponible dentro de un bloque de llaves o dentro de una funcion */

function saludar2(){
    let nombre2 = "Ariel"
    console.log(nombre2);
}
//console.log(nombre2);

if(true){
    let edad2 = 32;
    console.log(edad2);
}
//console.log(edad2);

// const: se utiliza para valores constantes que no pueden ser reasignados
const fechaNacimiento = 2006;
console.log(fechaNacimiento);
//fechaNacimiento = 2003; //Error assignment to constant variable
//console.log(fechaNacimiento); //Solo se ejecuta el console anterior
