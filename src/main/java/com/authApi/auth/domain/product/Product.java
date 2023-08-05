package com.authApi.auth.domain.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity( name = "product" )
@Table( name = "product")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode( of = "id" )
public class Product {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private String id;

    private String name;

    private Integer price;
}
