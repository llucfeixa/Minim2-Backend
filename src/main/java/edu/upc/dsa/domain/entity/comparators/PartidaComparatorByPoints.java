package edu.upc.dsa.domain.entity.comparators;

import edu.upc.dsa.domain.entity.Partida;

import java.util.Comparator;

public class PartidaComparatorByPoints implements Comparator<Partida> {
    public int compare(Partida partida1, Partida partida2) {
        return (partida2.getPoints() - partida1.getPoints());
    }
}
