package com.datastructure.symboltable.test;

import com.datastructure.symboltable.OrderSymbolTable;
import com.datastructure.symboltable.SymbolTable;

public class OrderSymbolTableTest {
    public static void main(String[] args) {
        OrderSymbolTable<Integer, String> orderSymbolTable = new OrderSymbolTable<>();
        orderSymbolTable.put(1,"cdw");
        orderSymbolTable.put(2,"lxw");
        orderSymbolTable.put(4,"ccf");

        orderSymbolTable.put(3,"wsx");

    }}
