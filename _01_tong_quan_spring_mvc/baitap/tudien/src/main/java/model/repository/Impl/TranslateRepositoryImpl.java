package model.repository.Impl;

import model.repository.TranslateRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TranslateRepositoryImpl implements TranslateRepository {
     private static Map<String,String>map = new HashMap<>();
    static {
        map.put("helllo","xin chào");
        map.put("goodbye","tạm biệt");
        map.put("eat","ăn");
    }
    @Override
    public Map<String, String> translate(String vietnam) {

        return null;
    }
}
