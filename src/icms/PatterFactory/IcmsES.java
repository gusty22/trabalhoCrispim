package icms.PatterFactory;

import icms.model.Orcamento;

import java.math.BigDecimal;

public class IcmsES implements CalculoPorRegiao{
    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.17"));
    }
}
