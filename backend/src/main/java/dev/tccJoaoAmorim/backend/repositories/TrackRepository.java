package dev.tccJoaoAmorim.backend.repositories;

import dev.tccJoaoAmorim.backend.models.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TrackRepository extends JpaRepository<Track, String> {
}
