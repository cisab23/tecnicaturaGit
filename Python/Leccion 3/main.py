# Ciclo while (mientras o durante)

"""condicion = True
while condicion:
   print("Ejecutando el ciclo while")
else:
    print("Fin del ciclo while")"""

"""contador = 0
while contador < 3:
    print("Ejecutamos nuestro ciclo while", contador)
    contador += 1
else:
    print("Fin del ciclo while")"""

# Ciclo for (para)

"""cadena = "Hello"
for letra in cadena:
    print(letra)
else:
    print("Fin del ciclo for")"""

# Palabra reservada 'break'
'''for letra in "Alemania":
    if letra == "a":
        print(f"Letra encontrada: {letra}")
        break # Rompe la estructura al encontrar cualquier tipo de elemento
else:
    print("Fin del ciclo for")'''

# Palabra reservada 'continue'
for i in range(6):
    if i % 2 == 0:
        print(f"Valor: {i}")


for i in range(6):
    if i % 2 != 0:
        continue
    print(f"Valor: {i}")