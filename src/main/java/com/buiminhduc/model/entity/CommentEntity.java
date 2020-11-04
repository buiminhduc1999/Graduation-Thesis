package com.buiminhduc.model.entity;
import javax.persistence.*;
@Entity
@Table(name = "comment")
public class CommentEntity extends BaseEntity{

    @Column(name = "content")
    private String content;

//
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_user")
    private BlogEntity blog;

}
