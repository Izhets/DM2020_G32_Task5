package com.company;

/*
Хныкин 3.2.

Алгоритмы обхода графа в глубину и ширину.

Картинки графа в пакете res
*/

import com.company.graph.Graph;

public class   Main {

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex('A'); //0
        graph.addVertex('B'); //1
        graph.addVertex('C'); //2
        graph.addVertex('D'); //3
        graph.addVertex('E'); //4
        graph.addVertex('F'); //5
        graph.addVertex('G'); //6

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 5);
        graph.addEdge(3, 6);
        graph.addEdge(2, 4);


        System.out.println("Обход в глубину:");
        graph.passInDeep(0);
        //System.out.println("Операций: " + graph.getCount());

        System.out.println();

        System.out.println("Обход в ширину:");
        graph.passInWidth(0);
        //System.out.println("Операций: " + graph.getCount());

    }
}
