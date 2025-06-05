# Leer 10 numeros e imprimir cuantos son positivos, cuantos negativos y cuantos nuestros.

# Contador para cada tipo de numero
positivos = 0
negativos = 0
neutros = 0

# Pedir 10 numeros al usuario
for i in range(10):
    num = int(input(f"{i+1}. Ingrese un numero: "))

    # Verificr el tipo de numero
    if num == 0:
        neutros += 1
    elif num > 0:
        positivos +=1
    else:
        negativos += 1

print(f"La cantidad de numeros positivos es: {positivos}")
print(f"La cantidad de numeros negativos es: {negativos}")
print(f"La cantidad de numeros neutros es: {neutros}")
