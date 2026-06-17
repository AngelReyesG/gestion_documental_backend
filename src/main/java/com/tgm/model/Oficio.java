package com.tgm.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "oficios")
@Data
@NoArgsConstructor
public class Oficio implements Serializable{

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_oficio")
    private int id;

    @Column(nullable = false, unique = true, length = 50)
    private String folio;

    @Column(nullable = false, length = 150)
    private String asunto;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String cuerpo;

    @Column(nullable = false, length = 30)
    private String estado = "Borrador";

    @Column(name = "fecha_creacion", updatable = false)
    private LocalDateTime fechaCreacion;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_creador", nullable = false)
    private Usuario creador;

    @PrePersist
    protected void onCreate() {
        this.fechaCreacion = LocalDateTime.now();
    }
}
