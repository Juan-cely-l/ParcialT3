# ParcialT3
# Backend

## Integrante:
- Juan Esteban Cely Lopez CVDS-G3

#Diagrama de Arquitectura 
![image](https://github.com/user-attachments/assets/fbaadb2e-cd3d-4da8-87f0-5dd3c29bd5d5)

## Tecnologías Utilizadas

Este proyecto usa:

- **Spring Boot**: Framework principal para construir aplicaciones Java.
- **JaCoCo**: Herramienta de cobertura de código que se integra con el proyecto para asegurar que las pruebas unitarias cubran la mayor parte del código fuente.
- **Maven**: Herramienta de construcción y gestión de dependencias. Maven se utiliza para la gestión de dependencias y la automatización del proceso de construcción del proyecto.





## Instalacion y Configuracion

1. Clonar el repositorio 

    ``` https://github.com/Juan-cely-l/ParcialT3.git```

2. Ejecutar proyecto 

    ```cd ParcialT3```

    ```Se  ejecuta en ParcialT3 aplication main```

En este caso Modelos Es la capa donde se trabaja con los datos, por tanto contendrá mecanismos para acceder a la información y también para actualizar su estado. Los datos los tendremos habitualmente en una base de datos, por lo que en los modelos tendremos todas las funciones que accederán a las tablas y harán los correspondientes selects, updates, inserts, etc.

En la vista generalmente trabajamos con los datos, sin embargo, no se realiza un acceso directo a éstos. Las vistas requerirán los datos a los modelos y ellas se generará la salida, tal como nuestra aplicación requiera.

Controladores Contiene el código necesario para responder a las acciones que se solicitan en la aplicación, como visualizar un elemento, realizar una compra, una búsqueda de información, etc.

En realidad es una capa que sirve de enlace entre las vistas y los modelos, respondiendo a los mecanismos que puedan requerirse para implementar las necesidades de nuestra aplicación. Sin embargo, su responsabilidad no es manipular directamente datos, ni mostrar ningún tipo de salida, sino servir de enlace entre los modelos y las vistas para implementar las diversas necesidades del desarrollo.







