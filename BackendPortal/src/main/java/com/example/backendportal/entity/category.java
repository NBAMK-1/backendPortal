package com.example.backendportal.entity;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class category {
//    @Query("Create ")


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategory;

    @Column(nullable = false,length = 20)
    private String title;

    public category() {
    }

    public category(int idCategory, String title) {
        this.idCategory = idCategory;
        this.title = title;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
