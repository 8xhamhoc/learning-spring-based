package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WebProperties {

    private final String protocol;
    private final String serverHost;
    private final int serverPort;

    @Autowired
    public WebProperties(@Value("${app.server.protocol}") String protocol,
                         @Value("${app.server.host}") String serverHost,
                         @Value("${app.server.port}") int serverPort) {
        checkThatProtocolIsValid(protocol);

        this.protocol = protocol.toLowerCase();
        this.serverHost = serverHost;
        this.serverPort = serverPort;
    }

    private void checkThatProtocolIsValid(String protocol) {
        if (!protocol.equalsIgnoreCase("http") && !protocol.equalsIgnoreCase("https")) {
            throw new IllegalArgumentException(String.format(
                    "Protocol: %s is not allowed. Allowed protocols are: http and https.",
                    protocol
            ));
        }
    }

    public String getProtocol() {
        return protocol;
    }

    public String getServerHost() {
        return serverHost;
    }

    public int getServerPort() {
        return serverPort;
    }
}
