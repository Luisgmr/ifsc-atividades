package com.luisgmr.atividades.outubro.dia24.atleta;

public class PrincipalAtleta {

    public static void main(String[] args) {
        Atleta[] atletas = new Atleta[5];
        int numAtletas = 0;

        // Cadastre pelo menos 5 atletas
        atletas[numAtletas++] = new Atleta("Jorge", 25, 'M', 10, 15);
        atletas[numAtletas++] = new Atleta("Maria", 22, 'F', 7, 10);
        atletas[numAtletas++] = new Atleta("Carlos", 30, 'M', 9, 20);
        atletas[numAtletas++] = new Atleta("Ana", 28, 'F', 12, 12);
        atletas[numAtletas++] = new Atleta("Pedro", 24, 'M', 5, 18);

        // Contagem de atletas por sexo
        int numAtletasMasculinos = 0;
        int numAtletasFemininos = 0;
        for (int i = 0; i < numAtletas; i++) {
            if (atletas[i].getSexo() == 'M') {
                numAtletasMasculinos++;
            } else {
                numAtletasFemininos++;
            }
        }

        // Percentual de cada sexo
        double percentualMasculino = (numAtletasMasculinos * 100.0) / numAtletas;
        double percentualFeminino = (numAtletasFemininos * 100.0) / numAtletas;

        // Encontre o sexo com mais atletas
        String sexoComMaisAtletas = (numAtletasMasculinos > numAtletasFemininos) ? "Masculino" : "Feminino";

        // Encontre o atleta com mais gols
        int maxGols = 0;
        String atletaComMaisGols = "";
        for (int i = 0; i < numAtletas; i++) {
            if (atletas[i].getNumeroGols() > maxGols) {
                maxGols = atletas[i].getNumeroGols();
                atletaComMaisGols = atletas[i].toString();
            }
        }

        // Imprima os resultados
        System.out.println("Quantidade de Atletas Masculinos: " + numAtletasMasculinos);
        System.out.println("Quantidade de Atletas Femininos: " + numAtletasFemininos);
        System.out.println("Percentual de Atletas Masculinos: " + percentualMasculino + "%");
        System.out.println("Percentual de Atletas Femininos: " + percentualFeminino + "%");
        System.out.println("Sexo com mais atletas: " + sexoComMaisAtletas);
        System.out.println("Atleta com mais gols: " + atletaComMaisGols.replace("Nome: ", ""));
        System.out.println(" ");
        System.out.println("Lista de Atletas:");
        for (int i = 0; i < numAtletas; i++) {
            System.out.println(atletas[i].toString());
        }
    }

}
