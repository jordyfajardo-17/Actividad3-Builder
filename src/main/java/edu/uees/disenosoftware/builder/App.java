package edu.uees.disenosoftware.builder;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        System.out.println("=== BUILDER | UEES ===");

        Reserva reservaVirtual = new ReservaBuilder()
                .estudiante("Ana Torres")
                .docente("Carlos Perez")
                .fechaHora(LocalDateTime.of(2026, 9, 3, 18, 0))
                .modalidad(Modalidad.VIRTUAL)
                .motivo("Revision del proyecto")
                .observacion("Analizar diagrama UML")
                .prioridad(Prioridad.ALTA)
                .recordatorio(true)
                .enlace("https://meet.example/tutoria")
                .duracionMinutos(45)
                .idiomaNotificacion("Español")
                .requiereGrabacion(true)
                .build();

        System.out.println("Reserva 1:");
        System.out.println(reservaVirtual);

        System.out.println();

        Reserva reservaPresencial = new ReservaBuilder()
                .estudiante("Maria Lopez")
                .docente("Juan Garcia")
                .fechaHora(LocalDateTime.of(2026, 9, 4, 10, 0))
                .modalidad(Modalidad.PRESENCIAL)
                .build();

        System.out.println("Reserva 2 con valores por defecto:");
        System.out.println(reservaPresencial);

        System.out.println();

        try {
            new ReservaBuilder()
                    .docente("Carlos Perez")
                    .fechaHora(LocalDateTime.now())
                    .modalidad(Modalidad.VIRTUAL)
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Validacion correcta: " + e.getMessage());
        }
    }
}
