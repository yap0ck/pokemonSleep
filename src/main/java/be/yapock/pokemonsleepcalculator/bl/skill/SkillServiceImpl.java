package be.yapock.pokemonsleepcalculator.bl.skill;

import be.yapock.pokemonsleepcalculator.dal.entities.Skill;
import be.yapock.pokemonsleepcalculator.dal.repositories.SkillRepository;
import be.yapock.pokemonsleepcalculator.pl.models.skill.form.SkillForm;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImpl implements SkillService{
    private final SkillRepository skillRepository;

    public SkillServiceImpl(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @Override
    public void create(SkillForm form) {
        new Skill();
        Skill skill = Skill.builder()
                .name(form.name())
                .grade(form.grade())
                .description(form.description())
                .build();
        skillRepository.save(skill);
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
