package Retail

interface Retailer<out T> {
    fun sell(): T
}