package primerproyectograils

class Vehiculo {

    Integer year

    String name

    Make make
    Model model

    static constraints = {
        name maxSize: 255
        year min: 1900
    }
}
