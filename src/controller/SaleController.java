package controller;

import model.Sale;

public class SaleController {

    private Sale[] vendas;
    private int amountOfSales;

    public SaleController(DataController d) {
        vendas = d.getSales();
        amountOfSales = d.getAmountOfSales();
    }

    public String[] getSaleName() {
        String[] name = new String[amountOfSales];
        for (int i = 0; i < amountOfSales; i++) {
        	System.out.println(vendas[i].getName());
            name[i] = vendas[i].getName();
        }
        return name;
    }

    public double getValorFinal(int i) {
        return vendas[i].getValue();
    }

    public int getQntVendas() {
        return amountOfSales;
    }

    public String getSaleName(int i) {
        return vendas[i].getName();
    }

    public String getProductName(int i) {
        return vendas[i].getProductName();
    }

    public String getClientName(int i) {
        return vendas[i].getClientName();
    }


    public String getEmployeeName(int i) {
        return vendas[i].getEmployeeName();
    }

    public int getIdSale(int i) {
        return vendas[i].getIdSale();
    }
}