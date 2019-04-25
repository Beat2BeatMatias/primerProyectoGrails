package primerproyectograils

class HomeController {
    def index() {
        //render view: 'anotherView'
        respond([name: session.name ?: 'User', vehicleList: Vehiculo.list(), vehicleTotal: Vehiculo.count()])
    }

    def updateName(String name) {
        session.name = name

        flash.message = "El nombre ha sido actualizado"

        redirect action: 'index'
    }
}
