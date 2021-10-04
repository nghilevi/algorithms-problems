public class TopologicalSort{
    
    private Stack<Vertex> stack;

    public TopologicalSort(){
        this.stack = new Stack();
    }

    public void dfs(Vertex vertex){
        vertex.setVisited(true);
        for(Vertex v : vertex.getNeighbourList()){
            if(!v.isVisited()){
                dfs(v)
            }
        }
        stack.push(vertex)
    }

    public Stack<Vertex> getStack(){
        return this.stack;
    }

}