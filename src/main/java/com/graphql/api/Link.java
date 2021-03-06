package com.graphql.api;


public class Link {
    private final String id;
    private final String url;
    private final String description;

    public Link(String id, String url, String description) {
        this.id = id;
        this.url = url;
        this.description = description;
    }

    public Link(String url, String description){
        this(null, url, description);
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }
}
