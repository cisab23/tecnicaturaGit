"""
Ejercicio: Numero par o impar
1. Solicitamos que el usuario ingrese un numero
2. Este se asigna a una variable
3. Utilizaremos la estructura 'if else'
4. La formula <num> % 2 == 0
    Esta operacion nos dice si es un numero par
5. Si es True imprimimos que es par
6. Si es False imprimimos que es impar
"""
num = int(input("Por favor, ingresa un numero: "))
print(f"El residuo de la division es: {num % 2}")
if num % 2 == 0:
    print(f"El {num} es un numero PAR")
else:
    print(f"El {num} es un numero IMPAR")
