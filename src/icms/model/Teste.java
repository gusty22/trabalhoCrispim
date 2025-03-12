package icms.model;
import icms.PatterFactory.IcmsFactory;
import java.math.BigDecimal;

public class Teste {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new
                BigDecimal("1000.0"), "ICMS_MG");
        IcmsFactory icmsFactory = new IcmsFactory();
        BigDecimal resultado = icmsFactory.getIcmsPorEstado(
                "ICMS_MG").calculoPorRegiao(orcamento);
        System.out.println(resultado);
    }
}