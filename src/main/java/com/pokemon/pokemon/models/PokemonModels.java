package com.pokemon.pokemon.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pokemon699")
public class PokemonModels {
    private String name;
    private String url;

    @Override
    public String toString() {
        return "PokemonModels{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
