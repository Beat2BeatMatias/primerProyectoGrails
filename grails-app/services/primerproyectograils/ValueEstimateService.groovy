package primerproyectograils

import grails.gorm.transactions.Transactional

@grails.transaction.Transactional
class ValueEstimateService {

    def getEstimate(Vehiculo vehicle) {
        log.info 'Estimating vehicle value...'

        //TODO: Call third-party valuation API
        Math.round (vehicle.name.size() + vehicle.model.name.size() * vehicle.year) * 2
    }
}
