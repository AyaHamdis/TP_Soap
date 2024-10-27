import entite.ws.StudentWebService;
import jakarta.xml.ws.Endpoint;

public class serverJWS {
    public static void main(String[] args) {
        /*Endpoint.publish("http://0.0.0.0:8081/", new StudentWebService());
        System.out.println("Web service déployé sur http://0.0.0.0:8081/");*/
        String url = "http://localhost:8081/";
        Endpoint.publish(url, new StudentWebService());
        System.out.println("Web service déployé sur : " + url);
    }
}
