package br.com.fiap.entity;

import jakarta.persistence.*;

@Entity
@Table(name="TDS_TB_CLIENTE")
@SequenceGenerator(name="cliente", sequenceName = "SQ_TDS_TB_CLIENTE", allocationSize = 1)
public class Cliente {

    @Id
    @Column(name = "id_cliente")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")
    private Integer id;

    @Column(name="nm_cliente", nullable = false, length = 100)
    private String nome;


}
