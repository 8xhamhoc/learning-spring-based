package rest.controller;

import config.DataSourceProperties;
import config.VillageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;
import java.util.Map;

@Controller
public class HelloWorldController {

    @Autowired
    private VillageDAO villageDAO;

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model) throws SQLException {
        System.out.println("===dataSourceProperties: " + dataSourceProperties.getDriver());
        villageDAO.save();
        return "index";
    }

}
