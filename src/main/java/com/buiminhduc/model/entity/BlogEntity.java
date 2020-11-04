package com.buiminhduc.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "blog")
public class BlogEntity extends BaseEntity {
    @Column(name = "title")
    String title;

    @Column(name = "image")
    String image;

    @Column(name = "content")
    String content;

    @OneToMany(mappedBy = "blog")
    private List<CommentEntity> comment = new ArrayList<>();

}
