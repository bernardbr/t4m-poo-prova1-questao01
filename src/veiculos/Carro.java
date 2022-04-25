package veiculos;

public class Carro {
    private String _letrasPlaca;
    private int _numerosPlaca;
    private int _numeroChassi;
    private int _velocidadeAtual;

    public Carro(int numeroChassi) throws Exception {
        setNumeroChassi(numeroChassi);
        _velocidadeAtual = 0;
    }

    public Carro(String placa, int numeroChassi) throws Exception {
        setPlaca(placa);
        setNumeroChassi(numeroChassi);
        _velocidadeAtual = 0;
    }

    public String getPlaca() {
        if (_letrasPlaca == null) {
            return "";
        }

        return String.format("%s%d", _letrasPlaca, _numerosPlaca);
    }

    public int getNumeroChassi() {
        return _numeroChassi;
    }

    public int getVelocidadeAtual() {
        return _velocidadeAtual;
    }

    public void setPlaca(String placa) throws Exception {
        if (_letrasPlaca != null && !_letrasPlaca.isEmpty()) {
            throw new Exception("Placa já definida");
        }

        if (placa.length() == 7
            && placa.matches("[A-Z]{3}\\d{4}")) {
            _letrasPlaca = placa.substring(0, 3);
            _numerosPlaca = Integer.parseInt(placa.substring(3));
        } else {
            throw new Exception("Placa inválida");
        }
    }

    public void acelerar() throws InterruptedException {
        // System.out.print(".");
        // Thread.sleep(80);
        _velocidadeAtual++;
    }

    public void acelerar(int limite) throws InterruptedException {
        for (int i = _velocidadeAtual; i < limite; i++) {
            acelerar();
        }
    }

    public void frear() {
        _velocidadeAtual--;
    }

    private void setNumeroChassi(int numeroChassi) throws Exception {
        if (numeroChassi <= 0) {
            throw new Exception("Chassi inválido!");
        } 

        _numeroChassi = numeroChassi;
    }
}
