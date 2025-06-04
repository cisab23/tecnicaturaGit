"""
Determinar si es mayor de edad
1. Pedir un número al usuario
2. Almacenar el valor en una variable
3. Usar la estructura ‘if else’
4. La formula es: <num> >= 18
5. True: Eres mayor de edad, Imprimir
6. False: Eres menor de edad, Imprimir
"""
print("¿Cumple usted con la mayoría de edad?")
edad = (int(input("Por favor, ingrese cuántos años tiene: ")))
if edad >= 18:
    print("Usted es mayor de edad.")
else:
    print("Usted NO es mayor de edad.")
