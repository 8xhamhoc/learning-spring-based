package rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.repository.CacheRepository;

import java.util.List;

@RestController
public class CacheController {

    @Autowired
    private CacheRepository cacheRepository;

    @RequestMapping("/cache")
    public List<String> cache() {
        return cacheRepository.loadCache();
    }

}
