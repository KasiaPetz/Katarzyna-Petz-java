package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String bun;
    private final int burgers;
    private final List<String> sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private final List<String> sauce = new ArrayList<>();
        private final List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }
        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;

        }
        public BigmacBuilder sauce(String sauce) {   //????????
            this.sauce.add(sauce);
            return this;
        }
        public BigmacBuilder ingredients(String ingredients) {
            this.ingredients.add(ingredients);
            return this;
        }

        public Bigmac build() {
            return  new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public Bigmac(String bun, int burgers, List<String> sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = new ArrayList<>(sauce);
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers='" + burgers + '\'' +
                ", sauce=" + sauce +
                ", ingredients=" + ingredients +
                '}';
    }
}
