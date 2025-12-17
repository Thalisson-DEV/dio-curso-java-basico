package com.dio.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Cliente {
    private String nome;
    private String cpf;
    private Date dataNascimento;
}
