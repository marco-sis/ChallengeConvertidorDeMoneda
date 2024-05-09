package com.marcode.conversor.modulos;

public record MonedaApi(String base_code,
                        String target_code,
                        double conversion_rate,
                        double conversion_result) {
}
