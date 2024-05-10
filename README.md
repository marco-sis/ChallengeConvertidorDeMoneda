# Convertidor de Monedas
# ---------------------------------------------------------------------
 Este proyecto es un desafio, donde la intension es convertir un valor de moneda a diferentes opciones, utilizando la tecnologia java, Gson y utilizar una API para su funcionamiento de cambio de monedas.
 ## Funcionalidades
 ------
 Las funciones del conversor de monedas son intuitivas y facil de utilizar, vemos lo siguiente:
- Mostramos un menu de opciones de las difrentes monedas
- Elegimos una opcion valida del menu
- Ingresamos la cantidad que se quiera convertir
- Elegimos una opcion valida para su conversion
- Mostramos la conversion de monedas
- Volvemos a preguntar al usuario que otra accion quiere realizar
- En caso que no haya mas conversiones elegimos la opcion 2 salir.

##  ExchangeRate-API
Es un formato de respuesta API: dada una moneda base proporcionada, devolverá la lista completa de otras monedas que admitimos y sus correspondientes tipos de cambio.

Para utilizar esta API necestamos una clave y la podemos obtener de forma gratuita ingresando un correo electronico del siguiente enlace: [ExchangeRate-API](http://www.exchangerate-api.com/ "ExchangeRate-API")


## Tecnologias utilizadas
* Intellij IDEA Community Edition
* JDK 21
* Biblioteca GSON
* Clase HttpClient de java para realizar solicitudes HTTP  a la API
