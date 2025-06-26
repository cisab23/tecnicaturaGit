// Ejercicio 1: Encontrar numeros pares
let parImpar = parseInt(prompt("Ingresa un numero: "));
if(isNaN(parImpar)){
    console.log("Ingresa un numero valido.");
}
else if (parImpar % 2 === 0){
    console.log("Es un numero par");
}
else{
    console.log("Es un numero impar");
}