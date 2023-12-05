package com.phantom.media.repositories;

import com.phantom.media.models.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaRepository extends JpaRepository <Media, Integer> {

}
