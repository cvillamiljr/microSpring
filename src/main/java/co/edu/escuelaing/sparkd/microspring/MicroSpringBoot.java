package co.edu.escuelaing.sparkd.microspring;

import co.edu.escuelaing.sparkd.httpserver.HttpServer;
import co.edu.escuelaing.sparkd.httpserver.URIProcessor;

public class MicroSpringBoot {
    public static void main(String[] args) {
        URIProcessor microspring = new MicroSpring();
        try {
            microspring.mapService(args[0]);
            HttpServer server = new HttpServer(microspring);
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
