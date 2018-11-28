package rest.controller;

import config.VillageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Map;

@Controller
public class HelloWorldController {

    @Autowired
    private VillageDAO villageDAO;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model) throws SQLException {
        villageDAO.save();
        return "index";
    }

}
