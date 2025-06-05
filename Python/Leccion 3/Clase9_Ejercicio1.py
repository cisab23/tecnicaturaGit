# Ejercicio 1: Calcular la suma de "N" primeros numeros.

# Solicitar al usuario un numero entero
num = int(input("Ingrese la cantidad de numeros a sumarse: "))

# Inicializar la suma en 0
suma = 0

# Sumar los primeros numeros y mostrar el resultado
for i in range(1, num + 1):
    suma += i
    print(f"La suma es: {suma}")
