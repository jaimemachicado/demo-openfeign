# Demo OpenFeign

Ejemplo de proyecto que hace uso de OpenFeign para el consumo de recursos de un servicio externo.


## Requisitos

- Java JDK 17
- Maven 3

## Configuración del Proyecto

* Implementa un cliente con OpenFeign que consume los post a partir de un GET de:
http://jsonplaceholder.typicode.com/posts
* Compilar el proyecto, haciendo uso del multirun configurado en la carpeta ./run o con "mvn clean install"
* Arrancar la aplicación: DemoApplication

Esto permite hacer:
* Llamada GET a http://localhost:8090/posts y recuperar una lista Posts desde la URL externa (http://jsonplaceholder.typicode.com)
