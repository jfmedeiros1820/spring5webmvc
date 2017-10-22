package com.springframework.webmvc.domain;

import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@ToString(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
