package programacaoOrientadaObjetos2.hotelCanino.administracao;

public class CalculoSoEstadia extends Calculo {
    @Override
    public double getValorFinal(CheckOut checkOut){
        double somaTotal = checkOut.getEstadia();
        RegistroContabil.addRegistroContabil(checkOut.getCachorro(), somaTotal);
        return somaTotal;
    }
}
