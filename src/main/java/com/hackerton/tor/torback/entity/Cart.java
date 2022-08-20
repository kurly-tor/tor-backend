package com.hackerton.tor.torback.entity;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Table(name="cart")
public class Cart {

    @NotNull
    @Column("userId") // FK
    private String userId;

    @NotNull
    @Column("productId")// FK
    private int productId;

    @NotNull
    @Column("count")
    private int count;

    @Nullable
    @Column("createdAt")
    private LocalDateTime createdAt;

    @Nullable
    @Column("updatedAt")
    private LocalDateTime updatedAt;
}
