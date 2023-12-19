package be.yapock.pokemonsleepcalculator.pl.models.skill.dto;

import be.yapock.pokemonsleepcalculator.dal.entities.Skill;
import be.yapock.pokemonsleepcalculator.dal.entities.enums.Grade;

public record SkillShortDto(
        long id,
        String name,
        Grade grade
) {
    public SkillShortDto fromEntity(Skill skill){
        return new SkillShortDto(
                skill.getId(),
                skill.getName(),
                skill.getGrade()
        );
    }
}
