// Ejercicio 1: Calcular estacion del año
let mes = 4;
let estacion;

if(mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano";
}
else if(mes == 3 || mes == 4 || mes == 5){
    estacion = "Otoño";
}
else if(mes == 6 || mes == 7 || mes == 8){
    estacion = "Invierno"
}
else if(mes == 9 || mes == 10 || mes == 11){
    estacion = "Primavera"
}
else{
    estacion = "Mes incorrecto";
}
console.log("El valor corresponde a la estacion "+ estacion);

// Ejercicio 2: Hora del dia
/*
de 6 a 11 nos saluda: Good Morning
de 12 a 16 nos saluda: Good afternoon
de 17 a 19 nos saluda: Good evening
de 20 a 23 nos saluda: Good night
Trabajaremos con 24 hs
*/
let horaDia = 9;
let saludo;
if(horaDia >6 && horaDia <=11){
    saludo = "Good morning";
}
else if(horaDia >= 17 && horaDia <= 19) {
    saludo = "Good evening";
}
else if(horaDia >= 20 && horaDia <= 23) {
    saludo = "Good night";
}
else{
    saludo = "Valor Incorrecto";
}
console.log("El valor corresponde a "+ saludo);

//Estructura Switch (Misma sintaxis que Java)
switch(mes){ //Tambien se pueden usar cadenas
case 1: case 2: case 12:
    estacion = "Verano";
    break;
case 3: case 4: case 5:
    estacion = "Otoño";
    break;
case 6: case 7: case 8:
    estacion = "Invierno";
    break;
case 9: case 10: case 11:
    estacion = "Primavera";
    break;
default:
    estacion = "Valor Incorrecto";
}
console.log("Bienvenido a la estacion de: ", estacion);