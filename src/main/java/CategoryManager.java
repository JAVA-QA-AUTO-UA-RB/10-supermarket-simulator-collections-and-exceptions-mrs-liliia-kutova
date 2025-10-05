package main.java;

import java.util.HashSet;
import java.util.Set;

public class CategoryManager {
    private Set<String> categories = new HashSet<>();

    public void  addCategory (String category) throws DuplicateCategoryException {
        if (!categories.add(category)){
            throw new DuplicateCategoryException(" Category " + category + " already exist ");
        }
    }

    public Set<String> getCategories() {
        return new HashSet<>(categories);
    }
}
