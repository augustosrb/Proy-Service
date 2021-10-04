# Servicios Alumnos

Este proyecto registra alumnos, validando la edad solo para mayores de 17 años.

Se desplegaron 2 servicios, uno que realiza el crud y otro que contiene la lógica de las validaciones.

## Ejecutando las pruebas SWAGGER 📋

Usar el servicio Backend, crud sin validaciones.

https://proyservice.herokuapp.com/swagger-ui.html


## Ejecutando las pruebas POSTMAN⚙️

Para validar solo el crud sin validaciones

https://proyservice.herokuapp.com/swagger-ui.html

Ingresar a postman para consumir el servicio

### GET: Consulta todos los alumnos
https://proyservicegui.herokuapp.com/alumno

![Alt text](https://raw.githubusercontent.com/augustosrb/proy-service/main/assets/GET.jpg)

### GET: Consulta los alumnos por código, validando que el código ingresado exista.
https://proyservicegui.herokuapp.com/alumno

![Alt text](https://raw.githubusercontent.com/augustosrb/proy-service/main/assets/getID.jpg)

### POST: Registar alumnos validando que la edad sea mayor a 17 años.
https://proyservicegui.herokuapp.com/alumno
```
{
"nombre": "Nombre",
"edad": 18
}
```

![Alt text](https://raw.githubusercontent.com/augustosrb/proy-service/main/assets/post-OK.jpg)


Validando edad

![Alt text](https://raw.githubusercontent.com/augustosrb/proy-service/main/assets/post.jpg)


### PUT: Actualiza alumnos validando, que el código ingresado exista y  que la edad sea mayor a 17 años.

https://proyservicegui.herokuapp.com/alumno
```
{
"codigo": 2,
"nombre": "Jose",
"edad": 22
}
```
![Alt text](https://raw.githubusercontent.com/augustosrb/proy-service/main/assets/putOK.jpg)

Validando edad

![Alt text](https://raw.githubusercontent.com/augustosrb/proy-service/main/assets/putOK.jpg)

### DELETE: Elimina alumnos por código validando que exista.

https://proyservicegui.herokuapp.com/alumno/2

![Alt text](https://raw.githubusercontent.com/augustosrb/proy-service/main/assets/DeleteOK.jpg)

Validando código

![Alt text](https://raw.githubusercontent.com/augustosrb/proy-service/main/assets/DeleteFail.jpg)
