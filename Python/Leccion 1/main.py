"""
miVariable = 3
print(miVariable)
miVariable = "Hola a todos los estudiantes de la tecnicatura"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print(z)
print(id(x))
# Las literales se escriben x120, la variable y = x864, la variable z = x184
print(id(y))
print(id(z))

# Tipos int, float, String, Bool
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "Hola alumnos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

# Manejo de cadenas
miGrupoFavorito = "the GazettE"
caracteristicas = "aguante el Visual Kei"
print("Mi grupo favorito es: "+miGrupoFavorito+" "+caracteristicas)  # El simbolo + funciona como concatenacion
miGrupoFavorito = "lynch."
caracteristicas = "Ese punto es parte del nombre"
print("El otro grupo que me gusta es:", miGrupoFavorito, caracteristicas)  # La coma tambien sirve para concatenar

numero1 = "7"
numero2 = "8"
print(numero1 + numero2)  # No los va a sumar debido a que ambas variables son tipo string
print(int(numero1)+int(numero2))  # Convertimos el string a entero
# Se pueden sumar dos cadenas siempre y cuando ambas tengan un numero que se pueda covertir a entero

# Tipos Booleanos (bool)
miBooleano = True
print(miBooleano)
miBooleano = False
print(miBooleano)
miBooleano = 3 > 2
print(miBooleano)  # Jamas se van a ejecutar True y False al mismo tiempo

if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")

# Procesar entrada del usuario
# Funcion input
# resultado = input("Digite un numero: ")  # Regresa un dato tipo string
# print(resultado)

# Conversion de la entrada de datos
numero1 = int(input("Escribe el primer numero: "))
numero2 = int(input("Escribe el segundo numero: "))
resultado = numero1 + numero2
print("El resultado de la suma es: ", resultado)

operandoA = 8
operandoB = 5
suma = operandoA + operandoB
print("Resultado de la suma: ", suma)
print(f"El resultado de la suma es: {suma}")

resta = operandoA - operandoB
print(f"El resultado de la resta es: {resta}")

multiplicacion = operandoA * operandoB
print(f"El resultado de la multiplicacion es: {multiplicacion}")

division = operandoA / operandoB
print(f"El resultado de la division es: {division}")
division = operandoA // operandoB
print(f"El resultado de la division (int) es: {division}")

modulo = operandoA % operandoB
print(f"El residuo es: {modulo}")

exponente = operandoA ** operandoB
print(f"El exponente es: {exponente}")

miVariable3 = 10
print(miVariable3)

# Operadores de reasignacion
miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1
print(miVariable3)

# miVariable3 = miVariable3 - 2
miVariable3 -= 2
print(miVariable3)

# miVariable3 = miVariable3 * 3
miVariable3 *= 3
print(miVariable3)

# miVariable3 = miVariable3 / 2
miVariable3 /= 2
print(miVariable3)

# Operadores de Comparacion
d = 4
b = 2
resultado = d == b # Comprobamos si son iguales
print(resultado)

# Operador diferente
resultado = d != b
print(resultado)

# Operador Mayor que
resultado = d > b
print(resultado)

# Operador Menor que
resultado = d < b
print(resultado)

# Operador Menor o Igual que
resultado = d <= b
print(resultado)

# Operador Mayor o Igual que
resultado = d >= b
print(resultado)
"""
# Operadores logicos
a = False
b = False
resultado = a and b
print(resultado)

# Operador OR
resultado = a or b
print(resultado)

# Operador NOT
resultado = not a
print(resultado)
