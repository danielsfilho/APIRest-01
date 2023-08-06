package com.authApi.auth.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Entity( name = "product" )
@Table( name = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode( of = "id" )
public class Product {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private String id;

    private String name;

    private Integer price;

    public Product(ProductRequestDTO data) {
        this.setName(data.name());
        this.setPrice(data.price());
    }
}
