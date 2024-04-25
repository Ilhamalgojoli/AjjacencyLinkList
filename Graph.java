import java.util.LinkedList ;

public class Graph {
    String v;
    LinkedList<String> adjacencyList[];

    Graph(String v){
        this.v = v ;
        adjacencyList = new LinkedList[v.length()];

            for(int i = 0 ; i < v.length(); i++){
                adjacencyList[i] = new LinkedList<>();
            }
    }void TambahEdge(String vertexAwal, String vertexAkhir){
        adjacencyList[v.indexOf(vertexAwal)].add(vertexAkhir);
    }void cetakList(){
        for(int i = 0 ; i < v.length(); i++){
            if(adjacencyList[i].size() > 0){
                System.out.print(v.charAt(i) + " --> " + adjacencyList[i]);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Graph graph = new Graph("ABCDEFGHI");
        graph.TambahEdge("A", "B");
        graph.TambahEdge("A", "E");
        graph.TambahEdge("A", "D");
        graph.TambahEdge("B", "E");
        graph.TambahEdge("D", "G");
        graph.TambahEdge("G", "H");
        graph.TambahEdge("E", "H");
        graph.TambahEdge("E", "F");
        graph.TambahEdge("F", "H");
        graph.TambahEdge("H", "I");
        graph.TambahEdge("I", "F");
        graph.TambahEdge("E", "F");
        graph.TambahEdge("F", "C");
        graph.TambahEdge("C", "B");
        graph.cetakList();
    }
}
