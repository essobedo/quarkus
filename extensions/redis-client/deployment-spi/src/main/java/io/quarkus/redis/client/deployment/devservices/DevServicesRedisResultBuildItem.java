package io.quarkus.redis.client.deployment.devservices;

import java.util.Map;

import io.quarkus.builder.item.SimpleBuildItem;

public final class DevServicesRedisResultBuildItem extends SimpleBuildItem {

    private final Result defaultConnection;
    private final Map<String, Result> namedConnections;

    public DevServicesRedisResultBuildItem(Result defaultConnection, Map<String, Result> namedConnections) {
        this.defaultConnection = defaultConnection;
        this.namedConnections = namedConnections;
    }

    public Result getDefaultConnection() {
        return defaultConnection;
    }

    public Map<String, Result> getNamedConnections() {
        return namedConnections;
    }

    public static final class Result {
        private final Map<String, String> properties;

        public Result(Map<String, String> properties) {
            this.properties = properties;
        }

        public Map<String, String> getProperties() {
            return properties;
        }
    }
}
