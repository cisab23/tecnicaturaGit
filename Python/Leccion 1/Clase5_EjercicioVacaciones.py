"""
# Ejercicio con el operador or
La pregunta es si un padre puede asistir al juego de su hijo.
1. Verificamos si tiene vacaciones
2. Verificamos si tiene el día libre
3. Usar estructura ‘if else’ con el operador or
4. Imprimir
"""

vacaciones = True
diaDeDescanso = True

if not (vacaciones or diaDeDescanso):
    print("No podrá asistir al juego.")
else:
    print("Podrá asistir al juego.")
