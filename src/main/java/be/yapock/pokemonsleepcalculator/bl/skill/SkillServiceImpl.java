package be.yapock.pokemonsleepcalculator.bl.skill;

import be.yapock.pokemonsleepcalculator.dal.entities.Skill;
import be.yapock.pokemonsleepcalculator.pl.models.skill.form.SkillForm;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImpl implements SkillService{
    @Override
    public void create(SkillForm form) {
        
    }

    @Override
    public Skill getOne(long id) {
        return null;
    }

    @Override
    public void update(long id, SkillForm form) {

    }

    @Override
    public void delete(long id) {

    }
}
