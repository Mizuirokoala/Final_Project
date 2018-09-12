package pl.mizuirokoala.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {


    //    @ResponseBody
    @RequestMapping("/")
    public String home() {
        return "index";
    }


}


//
//    @RequestMapping("/index")
//    public String index() {
//        return "index";
//    }
//
//    @GetMapping("/admin")
//   // @ResponseBody
//    public String admin() {
//        return "admin";
//    }
//
////    @GetMapping("/create-user")
////    @ResponseBody
////    public String createUser() {
////        User user = new User();
////        user.setUsername("admin");
////        user.setPassword("admin");
////        userService.saveUser(user);
////        return "-created-";
////    }
//
//}
//    @Autowired
//    private HotelRepository hotelRepository;
//
//    @GetMapping("")
//    public String home( ) {
//        return "firstPage";
//    }
//
//    @PostMapping("")
//    public String homePost(@RequestParam String city, Model m) {
//        List<Hotel> cityHotels = this.hotelRepository.findAllByAddressCity(city);
//        m.addAttribute("cityHotels", cityHotels);
//        List<String> citiesList = getCitiesList();
//        m.addAttribute("citiesList", citiesList);
//        return "home";
//    }
//
//    @ModelAttribute("availableHotels")
//    public List<Hotel> getHotels() {
//        return this.hotelRepository.findAll();
//    }
//
//    public List<String> getCitiesList() {
//        HashSet<String> cities = new HashSet<String>();
//        List<Hotel> hotels = this.hotelRepository.findAll();
//        for (Hotel hotel : hotels) {
//            cities.add(hotel.getAddressCity());
//        }
//        List<String> citiesList = new ArrayList<String>(cities);
//        return citiesList;
//    }
//}
