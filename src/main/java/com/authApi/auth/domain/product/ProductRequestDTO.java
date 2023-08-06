package com.authApi.auth.domain.product;

import jakarta.validation.constraints.NotBlank;

public record ProductRequestDTO (
        @NotBlank
        String name,

        @NotBlank
        Integer price
) {

}
