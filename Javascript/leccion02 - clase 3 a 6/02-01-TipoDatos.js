// Tipos de Datos en Javascript
/* La sintaxis en lo que es comentarios
es muy similar a la de Java
realmente diriamos que es identica*/

// Clase 3 - Tipos de dato parte 1
// Tipo Str
var nombre = 'Juan';
console.log(nombre)
nombre = "Siete";
console.log(typeof nombre);
nombre = 12.3;
console.log(typeof nombre);

// Tipo Numerico
var numero = 3000;
console.log(numero);

// Tipo Object
var objeto = {
    nombre: "Jane",
    apellido: "Doe",
    telefono: "030345678"
}
console.log(objeto);

// Clase 4 - Tipo de datos parte 2
// Tipo de dato boolean
var bandera = true;
console.log(bandera);

// Tipo de dato Funcion - permite reutilizar lineas de codigo
function miFuncion(){}
console.log(typeof miFuncion)

// Tipo de dato Symbol
var simbolo = Symbol("Mi simbolo");
console.log(typeof simbolo);

// Tipo de dato clase - es una funcion
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(Persona);
console.log(typeof Persona);

//Clase 5 - Tipos de datos parte 5
// Tipo de dato undefined
var x;
console.log(x);
console.log(typeof x);
 
x = undefined;
console.log(x);

//null - significa ausencia de valor
var y = null; //null no es un tipo de dato, pero su origen es de tipo object
console.log(y);
console.log(typeof null);

// Tipo de dato Array y Empty String
var autos = ['Citroen','Audi','Ford'];
console.log(autos);
console.log(typeof autos);

var z = '';
console.log(z);
console.log(typeof z)
