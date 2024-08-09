# APP WEB DOWNTIME

## DESCRIPCION

Aplicacion web que permite administrar tiempos muertos con la finalidad de tener una informacion completa y detallada de los problemas que probocan que una linea pare.

## PROBLEMA

No se cuenta con un registro detallado de los tiempos muertos de las lineas de produccion, por lo cual los problemas tienden a ser repetitivos.

## SOLUCION

Desarrollar una aplicacion que almacene y administre los datos de los paros de linea o tiempos muertos.

## ARQUITECTURA

La aplicion DOWNTIME tiene un panel de registro de ticket de tiempo muerto el cual le permite a usuarios de produccion reportar un problema que detenga la linea detalladamente colocando toda la informacion requerida para que el problema sea facil de identificar para el grupo de soporte asignado. El usuario de soporte puede tomar el ticket para atenderlo y decidir si cancelarlo, reasignarlo a otro grupo de sporte o solucionarlo, esto colocando los detalles de cada opcion.


## TABLA DE CONTENIDOS



### REQUERIMIENTOS
- Acceso a red Celestica, mediante el server cmxapp69.
- Tener instalado el navegador Google Chrome version 127.0.6533.90 en adelante.
- Base de datos cmxapp27.
- Cuenta creada en aplicacion desde un usuer administrador.

### INSTALACION
En este caso no se necesita ningun tipo de instalacion ya que es una aplicacion web por lo cual es un software que se ejecuta en el navegador web, cumpliendo con los requerimientos mencionados en el apartado de requerimientos.

### CONFIGURACION
El usuario administrador debera configurar cada usuario creado a modo de perfiles.
- Produccion: El perfil podra crear, asignar, reasignar, cancelar y tomar tickets.
- IT: El perfil sera de administrador, cuenta con todos los privilegios.
- Ingenieria: El perfil solo puede reasignar, cancela y tomar tickets.
- Procesos: El perfil solo puede reasignar, cancela y tomar tickets.
- Calidad: El perfil solo puede reasignar, cancela y tomar tickets.
- Materiales: El perfil solo puede reasignar, cancela y tomar tickets.

### USO
- Existen dos modos de uso Produccion y Soporte donde el perfil de produccion se encarga de crear los tickets y los perfiles de soporte se encargan de cerrar o asignar a grupo correcto.
  
     - Para la creacion de los tickets para los usuario de produccion se mostrara la siguiente interfaz, en la cual
       se requieren obligatoriamente todos los campos para poder crear un ticket.


![image](https://github.com/user-attachments/assets/9c8209c3-9b26-4097-833f-290e165dced5)



     - Para reasignar, cancelar o tomar los tickets para los grupos de soporte se mostrara la siguiente interfaz, donde
       se tendran que llenar todos los campos obligatoriamente para poder reasignar el ticket.

![image](https://github.com/user-attachments/assets/2beb54da-d7f8-4d0e-8f21-47cf9c3aa131)

  
     - La aplicacion sera administrada por los usuarios de IT a los cuales se tiene que realizar el requerimiento de
      crear nueva cuenta o asignar perfiles.
     - Todos los perfiles pueden visualizar el reporte de los tickets, filtrandolos por dia.

![image](https://github.com/user-attachments/assets/caa05db0-385a-457b-a19c-4529380a10cd)


### CONTRIBUCION
- Guía de contribución para usuarios.
- Debe contar con pasos específicos para clonar repositorio, crear un nuevo branch, enviar el pull request, esperar a hacer el merge.
