package com.company.ces

class Customer {

    String firstName
    String lastName
    List<Order> orders = []

    boolean isGoodCustomer() {
        orders.size() > 0
    }

}
