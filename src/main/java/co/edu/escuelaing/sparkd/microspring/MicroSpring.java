package co.edu.escuelaing.sparkd.microspring;


import co.edu.escuelaing.sparkd.httpserver.URIProcessor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class MicroSpring implements URIProcessor {

    private Map<String, Method> webservices = new HashMap<>();

    public void mapService(String componentName) throws Exception {
        int nMethods = 0;
        for (Method m : Class.forName(componentName).getMethods()) {
            if (m.isAnnotationPresent(RequestMapping.class)) {
                System.out.println("Tiene anotación @RequestMapping");
                RequestMapping rm = m.getAnnotation(RequestMapping.class);
                webservices.put(rm.value(), m);
                nMethods++;
            }
        }
        System.out.printf("N° of webservices: ", nMethods);
    }


    public String executeService(String theuri){
        try {
            return webservices.get(theuri).invoke(null).toString();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return "Error";
    }
}
