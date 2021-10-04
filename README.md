# proy-service

Este proyecto registra alumnos, validando la edad solo para mayores de 17 años.

Se desplegaron 2 servicios, uno que realiza el crud y otro que contiene la logica de las validaciones.

## Ejecutando las pruebas ⚙️

Para validar solo el crud sin validaciones

https://proyservice.herokuapp.com/swagger-ui.html

Ingresar a postman para consumir el servicio

GET: Consulta todos los alumnos
https://proyservicegui.herokuapp.com/alumno

https://raw.githubusercontent.com/augustosrb/proy-service/main/assets/GET.jpg

GET: Consulta los alumnos por codigo, validando que el código ingresado exista.
https://proyservicegui.herokuapp.com/alumno

https://raw.githubusercontent.com/augustosrb/proy-service/main/assets/getID.jpg

POST: Registar alumnos validando que la edad sea mayor a 17 años.
https://proyservicegui.herokuapp.com/alumno

{
"nombre": "Nombre",
"edad": 18

![Alt text](https://raw.githubusercontent.com/augustosrb/proy-service/main/assets/post-OK.jpg "Registro")


Validando edad
https://raw.githubusercontent.com/augustosrb/proy-service/main/assets/post.jpg


PUT: Actualiza alumnos validando, que el código ingresado exista y  que la edad sea mayor a 17 años.
https://raw.githubusercontent.com/augustosrb/proy-service/main/assets/putOK.jpg

https://proyservicegui.herokuapp.com/alumno

{
"codigo": 2,
"nombre": "Jose",
"edad": 22
}

Validando edad

https://raw.githubusercontent.com/augustosrb/proy-service/main/assets/putOK.jpg

DELETE: Elimina alumnos por código validando que exista.

https://proyservicegui.herokuapp.com/alumno/2

https://raw.githubusercontent.com/augustosrb/proy-service/main/assets/DeleteOK.jpg

Validando código
https://raw.githubusercontent.com/augustosrb/proy-service/main/assets/DeleteFail.jpg

