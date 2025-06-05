"""
Diseñar un programa que, ingresado un año, nos devuelva por consola
si es un año bisiesto o no. Repetir la accion hasta que el usuario lo decida.
"""

# Armar la estructura repetitiva
continuar = True
while continuar:
    try:
        # Pedir al usuario el año, y verificar si es bisiesto
        year = int(input("\nIngresa un año: "))
        if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
            print(f"El año {year} es bisiesto")
        else:
            print(f"El año {year} no es bisiesto")

        # Preguntar al usuario si desea continuar o no.
        decision = input("¿Deseas verificar otro año? (s/n): ")
        while decision not in ['s', 'n']:
            decision = input("Error. Por favor ingresa 's' para si, o 'n' para no: ")
        if decision == 'n':
            continuar = False
            print("\n¡Espero te haya servido!")
    except ValueError: # Mostramos un mensaje de error si el usuario no ingresa un numero entero.
        print("Error. Ingresa el año solo como numeros, sin punto ni coma. Intenta nuevamente.")