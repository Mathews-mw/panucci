package br.com.alura.panucci.navigation

sealed class AppDestination(val route: String) {
    object Highlight : AppDestination("highlight")
    object Menu : AppDestination("Menu")
    object Drinks : AppDestination("drinks")
    object ProductsDetails : AppDestination("productsDetails")
    object Checkout : AppDestination("checkout")
}