package com.phantom.media.controllers;

import com.phantom.media.models.Media;
import com.phantom.media.services.MediaService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Column;
import java.util.List;

@Controller
@RequestMapping("/media")
@RequiredArgsConstructor
public class MediaController {

    private final MediaService mediaService;

    @GetMapping("/all")
    public String getAllMedia(Model model){
        List<Media> allMedia = mediaService.getAllMedia();
        model.addAttribute("allMedia", allMedia);
        return "/media/all";
    }

}
