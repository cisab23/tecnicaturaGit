"""
Ejercicio: El mayor de dos números
1. Solicitar al usuario dos valores, determinar cual es el mayor.
2. Solicitar al usuario dos valores
3. Se debe imprimir el mayor de los dos números (La salida debe ser identica a la siguiente):
	Digite el valor para el numero1:
	Digite el valor para el numero2:
	El número mayor es:
"""

valor1 = int(input("Digite el valor para el numero 1: "))
valor2 = int(input("Digite el valor para el numero 2: "))

if valor1 > valor2:
    print("El numero 1 es mayor.")
else:
    print("El numero 2 es mayor.")