package sasha.projects.dnd_Bag.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sasha.projects.dnd_Bag.entities.Spell;

@Repository
public interface SpellRepository extends CrudRepository<Spell, Integer> {
}
