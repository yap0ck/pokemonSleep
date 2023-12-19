package be.yapock.pokemonsleepcalculator.dal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepositories extends JpaRepository<SkillRepositories, Long>, JpaSpecificationExecutor<SkillRepositories> {

}
