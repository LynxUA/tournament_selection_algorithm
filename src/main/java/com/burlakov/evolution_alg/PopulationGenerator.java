package com.burlakov.evolution_alg;

import java.util.Random;

public class PopulationGenerator {

    private int from;
    private int to;

    public PopulationGenerator() {
    }

    public PopulationGenerator(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int[][] generatePopulation(int populationCount, int dimension) {
        int[][] population = new int[populationCount][dimension];

        Random random = new Random();
        for(int i = 0; i < populationCount; i++) {
            for(int j = 0; j < dimension; j++) {
                population[i][j] = from + random.nextInt(to - from);
            }
        }
        return population;
    }
}
