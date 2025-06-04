"""
Ejercicio 1: Escribir la expresion en forma de expresion algoritmica.
1. Pedimos al usuario 3 valores = a, b, c
2. Mostramos el resultado final
"""
a = float(input("Ingrese el valor de A: "))
b = float(input("Ingrese el valor de B: "))
c = float(input("Ingrese el valor de C: "))
resultado = (a**3 * (b**2 - 2*a*c))/(2*b)
print(f"El resultado es: {resultado}")
