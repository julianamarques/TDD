package tests;

import models.ConversorRomanos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestesConversorRomanos {

    @Test
    public void deve_converter_algarismos_romanos_simples_para_arabicos() {
        ConversorRomanos conversorRomanos = new ConversorRomanos();
        Assertions.assertEquals(10, conversorRomanos.converterAlgarismoRomanoSimplesParaArabico("X"));
    }

    @Test
    public void deve_converter_numeros_romanos_com_dois_algarismos_para_arabicos() {
        ConversorRomanos conversorRomanos = new ConversorRomanos();
        Assertions.assertEquals(4, conversorRomanos.converterParaArabicoNumeroRomanoComDoisAlgarismos("IV"));
    }

    @Test
    public void deve_lancar_uma_excecao_se_receber_algarismo_romano_invalido() {
        ConversorRomanos conversorRomanos = new ConversorRomanos();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            conversorRomanos.converterAlgarismoRomanoSimplesParaArabico("A");
            conversorRomanos.converterParaArabicoNumeroRomanoComDoisAlgarismos("KK");
        });
    }
}
