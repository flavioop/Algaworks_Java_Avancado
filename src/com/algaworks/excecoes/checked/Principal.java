package com.algaworks.excecoes.checked;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {

    public static void main(String[] args) {

        Path arquivo = Path.of("C:\\Users\\Flavio\\Documents\\Algaworks\\Arquivo\\arquivo.txt");
        try {
            Files.createFile(arquivo);
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());

        }
    }
}