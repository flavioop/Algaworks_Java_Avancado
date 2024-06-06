package com.algaworks.excecoes.clausulafinally;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {

    public static void main(String[] args) {

        Path arquivo = Path.of("C:\\Users\\Flavio\\Documents\\Algaworks\\Arquivo\\teste3.txt");
        BufferedReader reader = null;
        try {
            reader = Files.newBufferedReader(arquivo);
            System.out.println(reader.readLine());

            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                System.out.println("DEBUG: Finally");
            }
        }
    }
}