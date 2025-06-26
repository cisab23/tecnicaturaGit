// Ejercicio 2: Averiguar si el usuario es mayor de edad

let edad = parseInt(prompt("Ingresa tu edad: "));
if (isNaN(edad)){
    console.log("Ingresa una edad valida.");
}
else if (edad >= 18){
    console.log("Eres mayor de edad.");
}
else{
    console.log("No eres mayor de edad.");
}