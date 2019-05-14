/*

import java.util.*;
import java.io.*;
/** Abstract base class for graphs. A graph is a set of vertices and a set of edges. Vertices are represented by integers
 from 0 to n ‐ 1. Edges are ordered pairs of vertices.

public abstract class AbstractGraph implements Graph {

    /** The number of vertices
    private int numV;
    /** Flag to indicate whether this is a directed graph *
    private boolean directed;


    /** Construct a graph with the specified number of vertices and the directed
     flag. If the directed flag is true, this is a directed graph. @param numV The number of vertices
     @param directed The directed flag

    public AbstractGraph(int numV, boolean directed) {
        this.numV = numV;
        this.directed = directed;
    }


    /** Return the number of vertices.
     @return The number of vertices
    public int getNumV() {
        return numV;
    }

    /** Return whether this is a directed graph. @return true if this is a directed graph

    public boolean isDirected() {
        return directed;
    }

    public static Graph createGraph(Scanner scan, boolean isDirected, String type) {
        int numV = scan.nextInt();
        AbstractGraph returnValue;
        type = type.toLowerCase();
        switch (type) {
            case "matrix":
                returnValue = new MatrixGraph(numV, isDirected);
                break;
            case "list":
                returnValue = new ListGraph(numV, isDirected);
                break;
            default:
                throw new IllegalArgumentException();
        }
        returnValue.loadEdgesFromFile(scan);
        return returnValue;
    }
}


*/