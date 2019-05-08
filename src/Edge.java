public class Edge {

    private Vertex destination;
    private Vertex source;
    private double weight;
    private Vertex[][] matrix;

    public Edge(Vertex source, Vertex destination) {
        this.source = source;
        this.destination = destination;
    }

    public Edge(Vertex source, Vertex destination, double weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public boolean equals(Object o) {
        return false;
    }

    public Vertex getDestination() {
        return  destination;
    }

    public Vertex getSource() {
        return source;
    }

    public double getWeight() {
        return weight;
    }

    public int hashCode() {
        Integer code = new Integer(source.hashCode() + destination.hashCode());
        return code;
    }

    @Override
    public String toString() {
        return "destination = " + destination +
                ", source = " + source +
                ", weight = " + weight;
    }
}
