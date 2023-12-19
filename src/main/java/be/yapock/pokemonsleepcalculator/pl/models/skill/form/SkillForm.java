package be.yapock.pokemonsleepcalculator.pl.models.skill.form;

import be.yapock.pokemonsleepcalculator.dal.entities.enums.Grade;
import jdk.jfr.Description;
import lombok.NoArgsConstructor;

public record SkillForm(
        String name,
        Grade grade,
        String description
) {
}
