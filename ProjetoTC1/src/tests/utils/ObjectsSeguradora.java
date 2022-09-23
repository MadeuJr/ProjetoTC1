package tests.utils;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import entities.Seguradora;

public class ObjectsSeguradora implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws IOException, ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");


        
        // Inválida;
        Seguradora s2 = new Seguradora(92691995000100L, "Carros Party", simpleDateFormat.parse("10/03/2001"), new ArrayList<String>(Arrays.asList("bruna_duarte@tribunaimpressa.com.br")), new ArrayList<Long>(Arrays.asList(7139083612L)));
        // Válidas
        Seguradora s1 = new Seguradora(92691995000100L, "Peace Love Padaria", simpleDateFormat.parse("12/05/2020"), new ArrayList<String>(Arrays.asList("ester-damota84@albap.com.br")), new ArrayList<Long>(Arrays.asList(4827390520L)));
        Seguradora s3 = new Seguradora(32180189000138L, "Cranberry Foco", simpleDateFormat.parse("01/07/2005"), new ArrayList<String>(Arrays.asList("giovanni_samuel_souza@eccofibra.com.br")), new ArrayList<Long>(Arrays.asList(48981406067L, 67981854177L)));
        Seguradora s4 = new Seguradora(77198497000129L, "Arroz com Ovo", simpleDateFormat.parse("22/03/2010"), new ArrayList<String>(Arrays.asList("claricesophiafigueiredo@afsn.com.br", "sabrinalizpinto@bodyfast.com.br")), new ArrayList<Long>(Arrays.asList(6726585573L)));
        Seguradora s5 = new Seguradora(37074069000170L, "Cantinho da Zezé", simpleDateFormat.parse("11/11/2020"), new ArrayList<String>(Arrays.asList("giovanni_lopes@outllok.com", "gabriellylizbrito@right.com.br")), new ArrayList<Long>(Arrays.asList(51984997569L)));
        Seguradora s6 = new Seguradora(11859423000188L, "Wizer Taveira", simpleDateFormat.parse("11/9/2001"), new ArrayList<String>(Arrays.asList("flavia.bruna.jesus@shimu.com.br")), new ArrayList<Long>(Arrays.asList(94986649810L)));
        Seguradora s7 = new Seguradora(69024188000104L, "No Way Bike", simpleDateFormat.parse("18/08/2013"), new ArrayList<String>(Arrays.asList("leticia_aparicio@greenschool.com.br")), new ArrayList<Long>(Arrays.asList(85994992654L)));
        Seguradora s8 = new Seguradora(40373994000106L, "Familia dos Seguros", simpleDateFormat.parse("12/12/2012"), new ArrayList<String>(Arrays.asList("davi_luiz_galvao@outershoes.com.br")), new ArrayList<Long>(Arrays.asList(21989706983L, 79981716275L)));
        Seguradora s9 = new Seguradora(25413107000192L, "Seguro Dos Brabos", simpleDateFormat.parse("11/11/2011"), new ArrayList<String>(Arrays.asList("luccaandersoncaldeira@panevale.com.br")), new ArrayList<Long>(Arrays.asList(82988017988L)));
        Seguradora s10 = new Seguradora(76654320000127L, "Segurinho do Jorginho", simpleDateFormat.parse("13/03/2019"), new ArrayList<String>(Arrays.asList("malu-galvao72@mushsanches.com")), new ArrayList<Long>(Arrays.asList(21985839823L)));
        

        return Stream.of(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10).map(Arguments::of);
    }
}