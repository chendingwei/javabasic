package com.datastructure.symboltable.test;

import com.datastructure.symboltable.SymbolTable;

public class SymbolTableTest {
    public static void main(String[] args) {
        SymbolTable<Integer, String> symbolTable = new SymbolTable<>();
        symbolTable.put(1,"cdw");
        symbolTable.put(2,"lxw");
        symbolTable.put(3,"ccf");

        System.out.println(symbolTable.size());

        symbolTable.put(3,"wsx");
        System.out.println(symbolTable.size());

        System.out.println(symbolTable.get(3));

        symbolTable.delete(3);
        System.out.println(symbolTable.size());
    }}
