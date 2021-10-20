import java.io.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

//Please resolve the imports for the classes used.
public class GraphDslAntlrSample {
  public static void main(String[] args) throws IOException {
    //Reading the DSL script
    InputStream is = 
            ClassLoader.getSystemResourceAsStream("graph.gr");
    
    //Loading the DSL script into the ANTLR stream.
    CharStream cs = new ANTLRInputStream(is);
    
    //Passing the input to the lexer to create tokens
    GraphLexer lexer = new GraphLexer(cs);
    
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    
    //Passing the tokens to the parser to create the parse trea. 
    GraphParser parser = new GraphParser(tokens);
    
    //Semantic model to be populated
    Graph g = new Graph();
    
    //Adding the listener to facilitate walking through parse tree. 
    parser.addParseListener(new MyGraphBaseListener(g));
    
    //invoking the parser. 
    parser.graph();
    
    Graph.printGraph(g);
  }
}

/**
 * Listener used for walking through the parse tree.
 */
class MyGraphBaseListener extends GraphBaseListener {

  Graph g;

  public MyGraphBaseListener(Graph g) {
    this.g = g;
  }
 
  @Override
  public void exitEdge(GraphParser.EdgeContext ctx) {
    //Once the edge rule is exited the data required for the edge i.e 
    //vertices and the weight would be available in the EdgeContext
    //and the same can be used to populate the semantic model
    Vertex fromVertex = new Vertex(ctx.vertex(0).ID().getText());
    Vertex toVertex = new Vertex(ctx.vertex(1).ID().getText());
    double weight = Double.parseDouble(ctx.NUM().getText());
    Edge e = new Edge(fromVertex, toVertex, weight);
    g.addEdge(e);
  }
}