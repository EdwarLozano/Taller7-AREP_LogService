package co.edu.eci.arep.logservice;

import java.security.spec.RSAOtherPrimeInfo;

import static spark.Spark.*;

public class Logservice {
    public static void main(String[] args) {
        System.out.println("Log Service");
        port(getPort());
        get("/logservice", (req, pesp) -> {
            String val = req.queryParams("value");
            return logMessage(val);
        });

    }
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4568;
    }

    private static String logMessage(String val){

        return """
                {
                "m1":"mensaj1",
                "m2":"mensaj1",
                "m3":"mensaj1"
                }
                """;
    }
}
