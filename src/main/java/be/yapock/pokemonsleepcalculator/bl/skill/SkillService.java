package be.yapock.pokemonsleepcalculator.bl.skill;

import be.yapock.pokemonsleepcalculator.dal.entities.Skill;
import be.yapock.pokemonsleepcalculator.pl.models.skill.form.SkillForm;

public interface SkillService {
    void create(SkillForm form);
    Skill getOne(long id);
    void update(long id, SkillForm form);
    void delete(long id);
}
