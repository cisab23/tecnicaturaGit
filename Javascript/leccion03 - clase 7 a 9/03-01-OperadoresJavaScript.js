// Clase 7
//Ejercicio para encontrar numeros pares e impares
let parImpar = 10;
if(parImpar % 2 == 0){
    console.log("Es un numero PAR");
}
else{
    console.log("Es un numero IMPAR");
}

//Ejercicio: es mayor de edad
let edad = 18, adulto = 18;
if(edad >= adulto){
    console.log("Usted es una persona adulta");
}
else{
    console.log("Usted es una persona menor de edad");
}

//Ejercicio: Dentro de un rango
let dentroRango = 5; //Aqui vamos a ir cambiando el valor
let valMin = 0, valMax = 10;
if(dentroRango >= valMin && dentroRango <= valMax){
    console.log("Esta dentro del rango establecido")
}
else{
    console.log("Esta fuera del rango establecido")
}

// Clase 9

//Operador OR - Ejercicio: Si el padre puede asistir al juego de su hijo
let vacaciones = true, diaDescanso = false;
if (vacaciones || diaDescanso){
    console.log("El padre puede asistir al juego de su hijo")
}
else{
    console.log("El padre no puede asistir al juego de su hijo")
}

//Operador ternario - Ejercicio Par Impar
let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado2);

let numero = 9;
resultado2 = numero % 2 == 0 ? "Es un numero PAR" : "Es un numero IMPAR";
console.log(resultado2);

//Funcion Number - Ejercicio es mayor de edad (convertir a String)
let miNumero = "21"; //Es una cadena
console.log(typeof miNumero);
let edad2 = Number(miNumero); //Esta es una funcion
console.log(typeof edad2);
if(edad2 >= 18){
    console.log("Puede votar");
}
else{
    console.log("Muy joven para votar");
}

let resultado3 = edad2 >= 18 ? "Puede votar" : "Muy joven para votar";
console.log(resultado3);

//Funcion isNaN
let miNumero1 = "10";
console.log(miNumero1);
let edad3 = Number(miNumero1);
console.log(edad3);

if(isNaN(edad3)){
    console.log("Esta variable no contiene solo numeros.")
}
else{
    if(edad3 >= 18){
        console.log("Puede votar");
    }
    else{
        console.log("Muy joven para votar");
    }
}