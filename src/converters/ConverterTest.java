package converters;

public class ConverterTest {
    public static void main(String[] args) {
        System.out.println(converterToCamelCase("Teste"));
    }

    static String converterToCamelCase(String tipo) {
        String[] split = tipo.split("_");

        String retorno = "";
        for (String s : split) {
            retorno += s.substring(0, 1).toUpperCase();
            retorno += s.substring(1).toLowerCase();
        }

        return retorno;
    }


//    IMOVEIS("IMOVEL"),
//    BENS("OUTBEM"),
//    RENDA_TITULAR("RENDTIT"),
//    RENDA_CONJUGE("RENDCONJ"),
//    COMPROMISSOS("COMPROM"),
//    CARTOES_CREDITO("CARTAO"),
//    CONTAS_CORRENTES("CC"),
//    REFERENCIAS_COMERCIAIS("REFCOM"),
//    SOCIOS("SOCIO"),
//    RESTRICOES("RESTR");
}
