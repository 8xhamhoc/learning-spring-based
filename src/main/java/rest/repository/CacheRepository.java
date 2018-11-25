package rest.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CacheRepository {

    @Cacheable("nameList")
    public List<String> loadCache() {
        System.out.println("======Load list");
        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");
        return names;
    }

}
