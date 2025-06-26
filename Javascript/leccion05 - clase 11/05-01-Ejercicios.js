//Evitar repetir tu codigo
//Try not to repeat yourself
let days = 5;
switch (days){
    case 1:
        console.log("hoy es Lunes");
        break;
    case 2:
        console.log("hoy es Martes");
        break;
    case 3:
        console.log("hoy es Miercoles");
        break;
    case 4:
        console.log("hoy es Jueves");
        break;
    case 5:
        console.log("hoy es Viernes");
        break;
    case 6:
        console.log("hoy es Sabado");
        break;
    case 7:
        console.log("hoy es Domingo");
        break;
    default:
        console.log("Error en el ingreso del dia de la semana");
        break;
}


//Esta es la version mejorada
let days2 = ["Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"] //Se crea un arreglo
function getDay(n){
    if(n < 1 || n > 7){
        throw new Error("out of range");
    }
    return days2[n-1];
}
console.log(getDay(5));

/* Hacer un ejercicio similar al que esta hecho, pero ahora con los
meses del año, debes hacerlo con la estructura switch y luego con
la función en la opción mejorada */

//Con estructura switch
let month = 7;

switch (month) {
    case 1:
        console.log("El mes es Enero");
        break;
    case 2:
        console.log("El mes es Febrero");
        break;
    case 3:
        console.log("El mes es Marzo");
        break;
    case 4:
        console.log("El mes es Abril");
        break;
    case 5:
        console.log("El mes es Mayo");
        break;
    case 6:
        console.log("El mes es Junio");
        break;
    case 7:
        console.log("El mes es Julio");
        break;
    case 8:
        console.log("El mes es Agosto");
        break;
    case 9:
        console.log("El mes es Septiembre");
        break;
    case 10:
        console.log("El mes es Octubre");
        break;
    case 11:
        console.log("El mes es Noviembre");
        break;
    case 12:
        console.log("El mes es Diciembre");
        break;
    default:
        console.log("Error: Ingresa un número de mes válido (1-12)");
        break;
}

// Opcion mejorada
let mes = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"];

function getMes(n) {
    if (n < 1 || n > 12) {
        throw new Error("Error: El número de mes está fuera de rango (1-12)");
    }
    return mes[n - 1];
}
console.log(getMes(9));