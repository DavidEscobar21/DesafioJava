package com.aluracursos.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaTasa {

    public TasaMonedaOmdb buscaTasaMonesa(String moneda) throws IOException, InterruptedException {

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String direccion = "https://v6.exchangerate-api.com/v6/f7e774abfbff8f716da38f7f/latest/" + moneda;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String Json = response.body();
        TasaMonedaOmdb tasaMonedaOmdb = gson.fromJson(Json, TasaMonedaOmdb.class);
        return tasaMonedaOmdb;

    }

}
