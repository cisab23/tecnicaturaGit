# Ingresar "N" enteros, visualizar la suma de los numeros pares
# de la lista, cuantos numeros pares existen, y cual es el promedio
# de los numeros impares

elementos = int(input("Digite la cantidad de elementos a ingresar: "))
i = 0
sumaPar = 0
conteoPar = 0
sumaImpar = 0
conteoImpar = 0
while i < elementos:
    num = int(input(f"{i+1}. Ingrese un numero: "))
    if num % 2 == 0:
        print(f"El numero es par.")
        sumaPar += num
        conteoPar += 1
    else:
        print(f"El numero es impar.")
        sumaImpar += num
        conteoImpar += 1
    i += 1

if conteoPar == 0:
    print("\nNo se han ingresado numeros pares.")
else:
    print(f"\nHas ingresado {conteoPar} numeros pares")
    print(f"La suma de los numeros pares es: {sumaPar}")

if conteoImpar == 0:
    print("\nNo se han ingresado numeros impares.")
else:
    promedioImpar = sumaImpar / conteoImpar
    print(f"\nEl promedio de los numeros impares es: {promedioImpar}")
