package com.zl;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by acer on 2017/8/8.
 */
public class JSONObjectSample {

    public static void main(String[] args){
//        JSONObjectTest();
//        createJosnMap();
        creatJsonByBean();
    }

    private static void JSONObjectTest() {
        JSONObject test = new JSONObject();
        try {
            test.put("name","zl");
            test.put("age",25.0);
            test.put("birthday","1992.08.22");
            test.put("major",new String[] {"理发","挖掘机"});
            System.out.print(test.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void createJosnMap(){
        HashMap<String,Object> map = new HashMap<String,Object>();

        map.put("name","zl");
        map.put("age",25);
        map.put("birthday","1992.08.22");
        map.put("major",new String[] {"理发","挖掘机"});
        System.out.print(new JSONObject(map).toString());
    }

    public static void creatJsonByBean(){
        Person person = new Person();

        person.setName("zl");
        person.setAge(25);
        person.setBirthday("1992.08.22");
        person.setMajor(new String[] {"理发","挖掘机"});
        System.out.print(new JSONObject(person));

    }
}
