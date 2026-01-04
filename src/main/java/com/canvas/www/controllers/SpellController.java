package com.canvas.www.controllers;

import com.canvas.www.DTO.SpellRepository;
import com.canvas.www.models.Spell;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spells")
public class SpellController {

    private final SpellRepository repo;

    public SpellController(SpellRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Spell crear(@RequestBody Spell spell) {
        return repo.save(spell);
    }

    @GetMapping
    public List<Spell> listar() {
        return repo.findAll();
    }
}
