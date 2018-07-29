package models;

public class ConversorRomanos {

    public int converterAlgarismoRomanoSimplesParaArabico(String algarismoRomano) {
        if("I".equalsIgnoreCase(algarismoRomano)) {
            return 1;
        }

        else if ("V".equalsIgnoreCase(algarismoRomano)) {
            return 5;
        }

        else if ("X".equalsIgnoreCase(algarismoRomano)) {
            return 10;
        }

        else if ("L".equalsIgnoreCase(algarismoRomano)) {
            return 50;
        }

        else if ("C".equalsIgnoreCase(algarismoRomano)) {
            return 100;
        }

        else if ("D".equalsIgnoreCase(algarismoRomano)) {
            return 500;
        }

        else if ("M".equalsIgnoreCase(algarismoRomano)) {
            return 1000;
        }

        else {
            throw new IllegalArgumentException("Algarismo Invalido");
        }
    }

    public int converterParaArabicoNumeroRomanoComDoisAlgarismos(String numeroRomano) {
        int numeroArabico = 0;

        for (int i = 0; i < numeroRomano.length()-1; i++) {
            if (numeroRomano.charAt(i) > numeroRomano.charAt(i + 1)) {
                numeroArabico = converterAlgarismoRomanoSimplesParaArabico(String.valueOf(numeroRomano.charAt(i))) + converterAlgarismoRomanoSimplesParaArabico(String.valueOf(numeroRomano.charAt(i + 1)));
            }

            else {
                numeroArabico = converterAlgarismoRomanoSimplesParaArabico(String.valueOf(numeroRomano.charAt(i + 1))) - converterAlgarismoRomanoSimplesParaArabico(String.valueOf(numeroRomano.charAt(i)));
            }
        }

        return numeroArabico;
    }
}
