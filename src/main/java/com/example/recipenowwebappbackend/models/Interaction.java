package com.example.recipenowwebappbackend.models;



import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;



@Entity
@Table(name = "recipe_interaction")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Interaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;

    @Column(name= "date",nullable = false)
    private LocalDateTime submitted;

    @Column(name= "edit_date",nullable = false)
    private LocalDateTime editDate;


    @Column(name = "rating")
    private Integer rating;

    @Column(name = "review")
    private String review;
}

