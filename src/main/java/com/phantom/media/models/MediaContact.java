package com.phantom.media.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.CodePointLength;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Embeddable
@Getter
@Setter
public class MediaContact {

    @Column
    private String contactPersonName;

    @Column
    private String contactPersonSurname;

    @ElementCollection (fetch = FetchType.EAGER)
    private Set<String> telephoneNumber;

    @ElementCollection (fetch = FetchType.EAGER)
    private Set<String> email;
}
