"""
Ejercicio: Tienda de libros
Mostrar: Ingrese los siguientes datos del libro
Digite el nombre del libro
Digite el ID del libro
Digite el precio del libro
Indicar si el envío es gratuito (True/False)
Mostrar:
	Nombre:
	ID:
	Precio:
	Envío Gratuito?:
"""
print("Ingrese los siguientes datos del libro.")
nombreLibro = input("Digite el nombre del libro: ")
idLibro = int(input("Digite el ID del libro: "))
precioLibro = float(input("Digite el precio del libro: "))
envioGratis = input("Indicar si el envio es gratuito (True/False): ")

if envioGratis == "True":
    envioGratis = True
elif envioGratis == "False":
    envioGratis = False
else:
    envioGratis = "El valor ingresado no es valido. Debe escribir True o False."
print(f'''Nombre: {nombreLibro}
ID: {idLibro}
Precio: ${precioLibro}
Envio gratuito?: {envioGratis}
''')
