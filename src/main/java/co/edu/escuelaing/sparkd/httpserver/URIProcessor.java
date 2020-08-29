package co.edu.escuelaing.sparkd.httpserver;

public interface URIProcessor {

    void mapService(String command) throws Exception;

    String executeService(String theuri);

}
