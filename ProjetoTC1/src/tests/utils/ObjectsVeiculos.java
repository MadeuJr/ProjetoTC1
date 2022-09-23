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

import entities.Veiculo;

public class ObjectsVeiculos implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws IOException, ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");


        Veiculo v1 = new Veiculo();
         
        // Inválida;
        // Veiculo v2 = new Seguradora(simpleDateFormat.parse("10/03/2001") new ArrayList<String>(Arrays.asList("bruna_duarte@tribunaimpressa.com.br")), new ArrayList<Long>(Arrays.asList(7139083612L)));
        // Válidas

        

        return Stream.of().map(Arguments::of);
    }
}