package controle;

/**
 *
 * @author rocr
 */
public class Calculadora {
    
    /**
     * Calcula a rentabilidade no período conforme a taxa selic informada
     * @param valAplic - Valor aplicado
     * @param selic - Taxa Selic informada
     * @param periodo - período aplicado
     * @return total - Valor total do período
     */
    public Double calcularRentabilidade(Double valAplic, Double selic, Double periodo) {
        Double total = 0.0;
        
        Double tempo = (periodo / 252);
        Double valMultSelic = (1 + (selic/100));
        total =  valAplic * Math.pow(valMultSelic, tempo);
        
        return total;
    }
}
