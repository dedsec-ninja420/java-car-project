public class Car {
    public String brand;
    public String model;
    public int year;
    public double weight;
    public double horsePower;
    public double engineVolume;
    public double revolutionsPerMinute;

    // dichiarazione costruttore
    public Car(String b, String m, int y, double hp, double w, double cc, double rpm) {
        brand = b;
        model = m;
        year = y;
        horsePower = hp;
        weight = w;
        engineVolume = cc;
        revolutionsPerMinute = rpm;
    }

    public double getWeightPowerRatio() {
        return this.horsePower / this.weight;
    }

    public double getKilowatts() {
        return this.horsePower * 0.735499;
    }

    public double getTorque() {
        return 5252 * horsePower / this.revolutionsPerMinute;
    }

    public String isForBeginners() {
        if (getKilowatts() > 55) {
            return "Il veicolo non può essere guidato da neopatentati.";
        } else {
            return "Il veicolo può essere guidato da neopatentati.";
        }
    }

    public String toString() {
        return "Produttore: " + this.brand + "\nModello: " + this.model + "\nCilindrata: " + this.engineVolume
                + "cc \nPeso: " + this.weight + "kg \nCavalli: " + this.horsePower + " a " + this.revolutionsPerMinute
                + " giri al minuto.\nLa potenza dell'auto è pari a " + getKilowatts()
                + " kW, il suo rapporto peso/potenza è di " + getWeightPowerRatio()
                + " CV/Kg, la sua coppia è uguale a "
                + getTorque() + "N/m. " + isForBeginners();
    }

}