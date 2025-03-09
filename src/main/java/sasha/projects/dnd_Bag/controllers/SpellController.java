package sasha.projects.dnd_Bag.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sasha.projects.dnd_Bag.entities.Spell;
import sasha.projects.dnd_Bag.repositories.SpellRepository;

import java.util.Optional;

@RestController
@RequestMapping("/spells")//"/spells"
public class SpellController {
    @Autowired
    private final SpellRepository spellRepository;

    public SpellController(SpellRepository spellRepository){
        this.spellRepository = spellRepository;
    }

    @GetMapping("/allSpells")
    public Iterable<Spell> getSpell(){
        return spellRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Spell> getSpellById(@PathVariable int id){
        return spellRepository.findById(id);
    }

    //Тест контролер
//    @GetMapping("/data")
//    public String getData() {
//        return "Привет из API!";
//    }
}
