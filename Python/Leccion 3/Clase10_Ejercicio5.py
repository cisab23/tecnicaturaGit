# Calcular el factorial de un numero mayor o igual a 0.

num = int(input("Ingrese un numero: "))
if num >= 0:
    i = 1
    factorial = 1
    while i <= num:
        factorial = factorial * i
        i = i+1
    print(f"El factorial de {num} es: {factorial}")
else:
    print("Debe ingresar un numero mayor o igual a 0.")
