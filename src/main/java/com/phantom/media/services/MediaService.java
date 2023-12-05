package com.phantom.media.services;


import com.phantom.media.models.Media;
import com.phantom.media.repositories.MediaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MediaService {

    private final MediaRepository mediaRepository;


    public List<Media> getAllMedia() {
        return mediaRepository.findAll();
    }
}
