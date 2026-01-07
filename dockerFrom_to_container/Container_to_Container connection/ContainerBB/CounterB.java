import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.atomic.AtomicInteger;

public class CounterB {

    private static final AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/count-from-a", CounterB::handleIncrement);
        server.createContext("/value", CounterB::handleValue);

        server.start();
        System.out.println("Container B running on port 8080");
    }

    private static void handleIncrement(HttpExchange exchange) throws IOException {
        int value = counter.incrementAndGet();
        respond(exchange, "Counter B incremented to: " + value);
    }

    private static void handleValue(HttpExchange exchange) throws IOException {
        respond(exchange, "Counter B value: " + counter.get());
    }

    private static void respond(HttpExchange exchange, String msg) throws IOException {
        exchange.sendResponseHeaders(200, msg.length());
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(msg.getBytes());
        }
    }
}
