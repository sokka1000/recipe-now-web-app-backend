package com.example.recipenowwebappbackend.entity.base;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
    private static final long serialVersionUID = 1L;

//    @CreatedDate
//    @CreationTimestamp
//    @Column(name = "created_date")
//    private LocalDateTime createdDate;
//
//    @LastModifiedDate
//    @UpdateTimestamp
//    @Column(name = "modified_date")
//    private LocalDateTime modifiedDate;
//
//    @CreatedBy
//    @Column(name = "created_by")
//    private String createdBy = "anonymous";
//
//    @LastModifiedBy
//    @Column(name = "modified_by")
//    private String modifiedBy = "anonymous";
//
//    @Column(name = "marked_as_deleted")
//    private Boolean markedAsDeleted = false;
}