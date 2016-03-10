package cracking_interview_question;

import java.util.List;
import java.util.PriorityQueue;

class Vertex
{
    public String     name;   // Vertex name
    public List       adj;    // Adjacent vertices
    public double     dist;   // Cost
    public Vertex     prev;   // Previous vertex on shortest path
    public int        scratch;// Extra variable used in algorithm

    public Vertex( String nm )
      { name = nm; adj = (List) new LinkedList( ); reset( ); }

    public void reset( )
      { dist = Graph.INFINITY; prev = null; scratch = 0; }    
      

}
