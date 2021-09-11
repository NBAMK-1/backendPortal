package com.example.backendportal.Controller;


import com.example.backendportal.entity.category;
import com.example.backendportal.repository.categoryRepo;
import com.example.backendportal.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@Controller
public class controller {

    @Autowired
    private userRepository repo;

    @Autowired
    private categoryRepo catRepo ;

    @GetMapping("/login")
    public String login(Model model){
        return "index";
    }

    @GetMapping("/forgot")
    public String forgot(){
        return "forgotPage";
    }

    @GetMapping("/change")
    public String change(){
        return "changePage";
    }


    @GetMapping("/category")
    public String getCategory(){
        return "category";
    }

    @GetMapping("/categoryShow")
    public List categoryShow(@RequestParam String title){
        save( title);
        return catRepo.findAll();
    }

    private void save( String title) {
        category cat = new category();
        cat.setTitle(title);
        catRepo.save(cat);
    }



}
