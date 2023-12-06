package com.phantom.media.DTO;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.FetchType;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MediaContactDTO {

    private String contactPersonName;


    private String contactPersonSurname;


    private Set<String> telephoneNumber;


    private Set<String> email;
}
