package co.edu.escuelaing.sparkd.microspring.componenttest;

import co.edu.escuelaing.sparkd.microspring.RequestMapping;

public class HelloController {

    @RequestMapping("/hello")
    public static String greetings() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/pi")
    public static String pi() {
        return "PI: "+Math.PI;
    }

    @RequestMapping("/web")
    public static String pagina() {
        String outputLine =
                "HTTP/1.1 200 OK\r\n"
                + "Content-Type: text/html\r\n"
                + "\r\n"
                + "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "<meta charset=\"UTF-8\">\n"
                + "<title>Title of the document</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<h1>Valor de E</h1>\n"
                + "<h1>"+Math.E+"</h1>\n"
                + "</body>\n"
                + "</html>\n";
        return outputLine;
    }

}



