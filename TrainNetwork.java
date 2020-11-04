public class TrainNetwork {
	public static void main(String[] args) {
		Graph trainNetwork = new Graph(true, true);
    Vertex la = trainNetwork.addVertex("Los Angeles");
    Vertex sf = trainNetwork.addVertex("San Francisco");
    Vertex nyc = trainNetwork.addVertex("New York");
    Vertex atl = trainNetwork.addVertex("Atlanta");
    Vertex den = trainNetwork.addVertex("Denver");
    Vertex cal = trainNetwork.addVertex("Calgary");

    trainNetwork.addEdge(sf, la, 400);
    trainNetwork.addEdge(la, sf, 400);
    trainNetwork.addEdge(nyc, den, 1800);
    trainNetwork.addEdge(den, nyc, 1800);
    trainNetwork.addEdge(cal, den, 1000);
    trainNetwork.addEdge(den, cal, 1000);
    trainNetwork.addEdge(la, atl, 2100);
    trainNetwork.addEdge(atl, la, 2100);

    trainNetwork.removeEdge(nyc, den);
    trainNetwork.removeEdge(cal, den);
    trainNetwork.removeEdge(den, cal);
    trainNetwork.removeVertex(cal);

    trainNetwork.print();
	}
}
