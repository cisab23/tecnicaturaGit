"""
Suponga que se tiene un conjunto de calificaciones de un grupo de 10 alumnos
Realizar un algoritmo para calcular la calificacion promedio y la calificacion mas
baja de todo el grupo.
"""
# Inicializar las variables
suma = 0
calificacionBaja = 99999

# Pedir al usuario que ingrese 10 calificaciones
for i in range(10):
    calificacion = float(input(f"{i+1}. Ingrese una calificacion: "))

    # Sumar las notas
    suma += calificacion

    # Determinar la nota mas baja
    if calificacion < calificacionBaja:
        calificacionBaja = calificacion
else:
    # Calcular el promedio
    promedio = suma/10

print(f"La calificacion promedio es: {promedio}")
print(f"La calificacion mas baja es: {calificacionBaja}")