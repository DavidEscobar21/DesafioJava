package com.aluracursos.modelos;

import java.util.Map;

public record TasaMonedaOmdb(String base_code,
                             Map<String, Double> conversion_rates) {
}
