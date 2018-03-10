package com.burlakov.evolution_alg;

public class EvolutionAltgorithmsRunner {

    public static void main(String[] args) {
        System.out.println("Generating initial generation");
        PopulationGenerator populationGenerator = new PopulationGenerator();
        int[][] population = populationGenerator.generatePopulation(500, 1);
        EvolutionAlgorithm evolutionAlgorithm = new TournamentSelectionAlgorithm(population);
    }
}
