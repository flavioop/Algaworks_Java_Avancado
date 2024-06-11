package com.algaworks.excecoes.cadastroanuncio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ServicoCadastroAnuncio {
    public void cadastrar(String codigo, String descricao){
        Path arquivo = Path.of("H:\\Flavio", codigo+".txt");

        try {
            Files.writeString(arquivo, descricao);

        }catch (IOException e){
            throw  new CadastroAnuncioException("Erro na escrita do arquivo de anuncio", e);


            // melhor usar uma biblioteca de log
            //System.out.println("Erro escrevendo arquivo ignorado");
            //e.printStackTrace();

        }

    }
}