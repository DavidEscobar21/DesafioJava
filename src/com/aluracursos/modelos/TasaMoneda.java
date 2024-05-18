package com.aluracursos.modelos;

import java.util.Map;

public class TasaMoneda {

    private String base_code;
    private Map<String, Double> conversion_rates;

    public TasaMoneda(TasaMonedaOmdb tasaMonedaOmdb) {
        this.base_code = tasaMonedaOmdb.base_code();
        this.conversion_rates = tasaMonedaOmdb.conversion_rates();
    }

    public String getBase_code() {
        return base_code;
    }

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

    @Override
    public String toString() {
        return "TasaMoneda{" +
                "base_code='" + base_code + '\'' +
                ", conversion_rates=" + conversion_rates +
                '}';
    }
}
