package com.example;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DoorController {
    DoorDao watchDao=new DoorDao();// daca o sa avem mai multe metode sa nu initializam de atatea ori

    @GetMapping("/doors")
    public ModelAndView watchPageById(@PathVariable int id) throws SQLException, IOException {

        ModelAndView mav=new ModelAndView("DoorTable");//the name of the jsp

        //get the watch from db
        Door door=DoorDao.getAll();

        mav.addObject("door",door);
        System.out.println(door.getId());


        //set it in the page

        return mav;
    }

}