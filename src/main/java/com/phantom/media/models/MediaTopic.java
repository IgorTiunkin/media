package com.phantom.media.models;

import lombok.Getter;

@Getter
public enum MediaTopic {
    MEDICINE("Medicine"), IT("IT");

    private final String title;

    MediaTopic (String title) {
        this.title = title;
    }
}
