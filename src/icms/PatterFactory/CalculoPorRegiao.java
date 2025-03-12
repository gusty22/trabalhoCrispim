package icms.PatterFactory;

import java.math.BigDecimal;

import icms.model.Orcamento;


public interface CalculoPorRegiao {
    public BigDecimal calculoPorRegiao(Orcamento orcamento);
}
