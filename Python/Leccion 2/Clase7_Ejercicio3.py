"""
Ejercicio 3: Calcular estacion del año
Pedir al usuario que ingrese un mes del año, el valor debe ser entre 1 y 12,
luego le decimos en que estacion del año esta.
"""
# Pedir el mes al usuario
mes = int(input("Ingresa un mes del año (1 al 12): "))
estacion = None

# Asignar los valores numericos a una estacion
if mes == 1 or mes == 2 or mes == 3:
    estacion = "Verano"
elif mes == 4 or mes == 5 or mes == 6:
    estacion = "Otoño"
elif mes == 7 or mes == 8 or mes == 9:
    estacion = "Invierno"
elif mes == 10 or mes == 11 or mes == 12:
    estacion = "Verano"
else:
    print("Error, este numero no corresponde a ningun mes")

print(f"La estacion {estacion} corresponde al mes {mes}")
