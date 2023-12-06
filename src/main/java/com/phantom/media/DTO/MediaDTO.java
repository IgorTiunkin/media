package com.phantom.media.DTO;

import com.phantom.media.models.MediaContact;
import com.phantom.media.models.MediaTopic;
import com.phantom.media.models.MediaType;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MediaDTO {

    private String title;

    private Integer coverage;

    private MediaType mediaType;

    private Set<MediaTopic> mediaTopics;

    private MediaContactDTO mediaContactDTO;
}
