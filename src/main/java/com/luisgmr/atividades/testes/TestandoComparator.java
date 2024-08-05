package com.luisgmr.atividades.testes;

import java.util.*;

public class TestandoComparator {

    public static void main(String[] args) {
        List<Time> times = new ArrayList<>(Arrays.asList(
                new Time("Corinthians", 20),
                new Time("Flamengo", 50),
                new Time("Criciúma", 25),
                new Time("Avaí", 15)
        ));
        Collections.sort(times, new PontosComparator());
        System.out.println(times);
    }

    private static class PontosComparator implements Comparator<Time> {
        @Override
        public int compare(Time o1, Time o2) {
            return o2.getPontos().compareTo(o1.getPontos());
        }
    }

}
