package primerproyectograils

import grails.testing.gorm.DataTest
import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class ValueEstimateServiceSpec extends Specification implements ServiceUnitTest<ValueEstimateService>, DataTest{

    void setupSpec() {
        mockDomain Make
        mockDomain Model
        mockDomain Vehiculo
    }

    void testEstimateRetrieval() {
        given: 'a vehicle'
        def make = new Make(name: 'Test')
        def model = new Model(name: 'Test', make: make)
        def vehiculo = new Vehiculo(year: 2000, make: make, model: model, name: 'Test Vehicle')

        when: 'service is called'
        def estimate = service.getEstimate(vehiculo)

        then: 'a non-zero result is returned'
        estimate > 0

        and: 'estimate is not too large'
        estimate < 1000000
    }
}
