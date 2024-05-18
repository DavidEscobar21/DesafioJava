package com.aluracursos.modelos;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneraArchivo {

    public void generarArchivo(List<TasaMoneda> data) throws IOException {

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        FileWriter escritura = new FileWriter("TasaMoneda.json");
        escritura.write(gson.toJson(data));
        escritura.close();
    }

}