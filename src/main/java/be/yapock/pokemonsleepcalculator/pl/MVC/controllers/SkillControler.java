package be.yapock.pokemonsleepcalculator.pl.MVC.controllers;

import be.yapock.pokemonsleepcalculator.bl.skill.SkillService;
import be.yapock.pokemonsleepcalculator.pl.models.skill.form.SkillForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/skill")
public class SkillControler {
    private final SkillService skillService;

    public SkillControler(SkillService skillService) {
        this.skillService = skillService;
    }

    /**
     * Retrieves the view name for displaying the create skill form.
     *
     * @param model the model used to pass data to the view
     * @return the view name for displaying the create skill form
     */
    @GetMapping("/create")
    public String getCreate(Model model){
        model.addAttribute("skill", new SkillForm(null, null, null));
        return "skill/create";
    }

    /**
     * Handles the HTTP POST request for creating a new skill.
     *
     * @param form the SkillForm object containing the data for the new skill
     * @return a String representing the redirect URL after successful creation of the skill
     */
    @PostMapping("/create")
    public String postCreate(@ModelAttribute("skill") SkillForm form) {
        skillService.create(form);
        return "redirect:/skill";
    }
}
