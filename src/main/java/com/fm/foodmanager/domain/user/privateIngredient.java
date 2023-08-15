package com.fm.foodmanager.domain.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "privateIngredient")
@Getter
@Setter

public class privateIngredient {
    @Id
    @Column(name ="id")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "ingredient_id")
    private Long ingredientId;

    @Column(name = "storage")
    private Long storage;

    @Column(name = "resist_date")
    private String resistDate;

    @Column(name = "remain_peroid")
    private Long remainPeroid;
}
