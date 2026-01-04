package com.canvas.www.DTO;

import com.canvas.www.models.Spell;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpellRepository extends JpaRepository<Spell, Long> {
}
