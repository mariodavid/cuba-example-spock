package com.company.ces

import spock.lang.Specification

class CustomerSpec extends Specification {

    Customer mario

    def setup() {
        mario = new Customer(firstName: "Mario", lastName: "David")
    }

    def 'A customer is good if there a at least one related order'() {

        given: 'the customer places one order'
        mario.orders << new Order(amount: 100)

        expect: 'the customer is a good customer'
        mario.isGoodCustomer()

    }


    def 'A customer is not good if there are no related orders'() {

        given: 'the customer places no orders'
        mario.orders = []

        expect: 'the customer is bad'
        !mario.isGoodCustomer()

    }

    def 'A customer is not good if the orders list is null'() {

        given: 'the customer places no orders'
        mario.orders = null

        expect: 'the customer is bad'
        !mario.isGoodCustomer()

    }
}
