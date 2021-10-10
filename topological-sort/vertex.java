import java.util.List;
import java.util.ArrayList;
public class Vertex{
 
    private String data;
    private boolean visited;
    private List<Vertex> neighbourList;

    public Vertex(String data){
        this.data = data;
        this.neighbourList = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex){
        this.neighbourList.add(vertex);
    }

    public List<Vertex> getNeighbourList(){
        return this.neighbourList;
    }

    public String getData(){
        return data;
    }

    public void setData(String data){
        this.data = data;
    }

    public boolean isVisited(){
        return visited;
    }

    public void setVisited(boolean visited){
        this.visited = visited;
    }

}