package com.chriscoronel.conversordemonedas.modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMonedasService {
    public SeleccionMoneda buscaMoneda (String monedaBase){


        String api = "d9f485e7c6c5d72ed44db57a";
        URI pagina = URI.create("https://v6.exchangerate-api.com/v6/" + api + "/latest/"+ monedaBase);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(pagina)
                .build();


            try {
                HttpResponse<String> response;
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                return new Gson().fromJson(json, SeleccionMoneda.class);
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException("No se encontro ninguna moneda");
            }


    }
}
