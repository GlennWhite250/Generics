package Retail

import Contest.Cat

class CatRetailer: Retailer<Cat> {
    override fun sell(): Cat {
        println("Sell Cat")
        return Cat(" ")
    }
}