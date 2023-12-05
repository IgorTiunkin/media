package com.phantom.media.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "media")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Media {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "coverage")
    private Integer coverage;

    @Column(name = "media_type")
    @Enumerated(value = EnumType.STRING)
    private MediaType mediaType;

    @ElementCollection (fetch = FetchType.EAGER)
    @Enumerated(value = EnumType.STRING)
    private Set<MediaTopic> mediaTopics;

    @Embedded
    @AttributeOverrides({@AttributeOverride( name = "contactPersonName", column = @Column(name = "contact_person_name")),
            @AttributeOverride( name = "contactPersonSurname", column = @Column(name = "contact_person_surname")),
            @AttributeOverride( name = "telephoneNumber", column = @Column(name = "telephone_number")),
            @AttributeOverride( name = "email", column = @Column(name = "email"))})
    private MediaContact mediaContact;

}
