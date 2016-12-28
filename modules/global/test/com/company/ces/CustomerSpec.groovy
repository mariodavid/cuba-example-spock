package com.company.ces

class CustomerSpec extends spock.lang.Specification {

    def 'A customer is good if there a at least one related order'() {

        given: 'a customer'
        def mario = new Customer(firstName: "Mario", lastName: "David")

        when: 'the customer places one order'
        mario.orders << new Order(amount: 100)

        then: 'the customer is good'
        mario.isGoodCustomer()

    }
}
