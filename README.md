# Actividad 3 - Laboratorio Builder

Implementacion del patron de diseño **Builder** para la construccion progresiva de objetos `Reserva` en un sistema de gestion de tutorias.

## Objetivo

Resolver el problema de un constructor con muchos parametros, separando la construccion del objeto de su representacion final y permitiendo configurar propiedades de forma legible mediante una Fluent Interface.

## Tecnologias

- Java 21
- Maven
- PlantUML
- Git/GitHub

## Estructura

```text
src/main/java/edu/uees/disenosoftware/builder/
├── App.java
├── Modalidad.java
├── Prioridad.java
├── Reserva.java
└── ReservaBuilder.java

docs/
└── builder.puml
```

## Ejecucion

```bash
mvn clean compile
mvn exec:java "-Dexec.mainClass=edu.uees.disenosoftware.builder.App"
```

## Caracteristicas implementadas

- `Reserva` inmutable.
- Construccion progresiva mediante `ReservaBuilder`.
- Fluent Interface con metodos encadenables.
- Valores por defecto para atributos opcionales.
- Validacion en `build()`.
- Dos configuraciones diferentes de reserva.
- Reto adicional: `idiomaNotificacion` y `requiereGrabacion`.
- Diagrama UML en PlantUML.

## Campos obligatorios

- estudiante
- docente
- fechaHora
- modalidad

## Campos opcionales

- motivo
- observacion
- prioridad
- recordatorio
- enlace
- duracionMinutos
- idiomaNotificacion
- requiereGrabacion

## Complejidad que resuelve Builder

Builder evita depender de la posicion de muchos parametros de un constructor largo. Los nombres de los metodos expresan que configuracion se esta realizando y permiten omitir opciones que utilizan valores por defecto.
