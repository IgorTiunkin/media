package com.phantom.media.mappers;

import com.phantom.media.DTO.MediaContactDTO;
import com.phantom.media.DTO.MediaDTO;
import com.phantom.media.models.Media;
import com.phantom.media.models.MediaContact;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;


@Mapper(componentModel = "spring")
public interface MediaToDTOMapper {

    @Mapping(source = "mediaContact", target = "mediaContactDTO", qualifiedByName = "contactToContactDTO")
    MediaDTO mediaToMediaDTO(Media media);

    @Mapping(source = "mediaContactDTO", target = "mediaContact", qualifiedByName = "contactDTOToContact")
    Media mediaDTOToMedia(MediaDTO mediaDTO);

    @Named("contactToContactDTO")
    MediaContactDTO contactToContactDTO(MediaContact mediaContact);

    @Named("contactDTOToContact")
    MediaContact contactDTOToContact(MediaContactDTO mediaContactDTO);

}
