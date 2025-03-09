package sasha.projects.dnd_Bag.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
//@Getter
//@Setter
@Table(name="spell")
public class Spell {
    public Spell(){
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//отдаю генерацию в руки БД
    @Column(name = "id_spell")
    private int id;

    @Column(name="name_spell")
    private String name;

    @Column(name="component_v")
    private String componentV;

    @Column(name="component_s")
    private String componentS;

    @Column(name="component_m")
    private String componentM;

    @Column(name="duration_spell")
    private String duration;

    @Column(name="distance_spell")
    private String distance;

    @Column(name="time_of_application_spell")
    private String timeOfApplicationSpell;

    @Column(name="description_spell")
    private String descriptionSpell;

    public String getComponentM() {
        return componentM;
    }

    public void setComponentM(String componentM) {
        this.componentM = componentM;
    }

    public String getComponentS() {
        return componentS;
    }

    public void setComponentS(String componentS) {
        this.componentS = componentS;
    }

    public String getComponentV() {
        return componentV;
    }

    public void setComponentV(String componentV) {
        this.componentV = componentV;
    }

    public String getDescriptionSpell() {
        return descriptionSpell;
    }

    public void setDescriptionSpell(String descriptionSpell) {
        this.descriptionSpell = descriptionSpell;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfApplicationSpell() {
        return timeOfApplicationSpell;
    }

    public void setTimeOfApplicationSpell(String timeOfApplicationSpell) {
        this.timeOfApplicationSpell = timeOfApplicationSpell;
    }
}
