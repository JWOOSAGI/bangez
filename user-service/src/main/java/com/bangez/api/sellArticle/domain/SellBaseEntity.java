package com.bangez.api.sellArticle.domain;


import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@Getter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class SellBaseEntity {

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDate postDate;
}