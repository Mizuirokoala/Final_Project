package pl.mizuirokoala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mizuirokoala.entity.Hotel;
import pl.mizuirokoala.repository.HotelRepository;

@Controller
@RequestMapping("/hotel")

public class HotelController {

private final HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @PostMapping("/add")
    public String add(Model model) {
        model.addAttribute("hotel", new Hotel());
        return "hotel/form";
    }




}
