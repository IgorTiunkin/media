package com.phantom.media.services;


import com.phantom.media.DTO.MediaDTO;
import com.phantom.media.mappers.MediaToDTOMapper;
import com.phantom.media.repositories.MediaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class MediaService {

    private final MediaRepository mediaRepository;
    private final MediaToDTOMapper mediaToDTOMapper;

    public MediaService(MediaRepository mediaRepository, MediaToDTOMapper mediaToDTOMapper) {
        this.mediaRepository = mediaRepository;
        this.mediaToDTOMapper = mediaToDTOMapper;
    }


    public List<MediaDTO> getAllMedia() {
        return mediaRepository.findAll().stream().map(mediaToDTOMapper::mediaToMediaDTO)
                .collect(Collectors.toList());
    }


}
