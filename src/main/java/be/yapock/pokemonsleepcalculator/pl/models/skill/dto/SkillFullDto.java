package be.yapock.pokemonsleepcalculator.pl.models.skill.dto;

import be.yapock.pokemonsleepcalculator.dal.entities.Skill;
import be.yapock.pokemonsleepcalculator.dal.entities.enums.Grade;

public record SkillFullDto(
        long id,
        String name,
        Grade grade,
        String Description
) {
    public SkillFullDto fromEntity(Skill skill){
        return new SkillFullDto(
                skill.getId(),
                skill.getName(),
                skill.getGrade(),
                skill.getDescription()
        );
    }
}
