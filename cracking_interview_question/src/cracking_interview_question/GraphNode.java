package cracking_interview_question;

public class GraphNode<K> {
	public GraphNode[] connectedNode = null;
	public K key;
	
	public GraphNode(K key, GraphNode[] connectedNode)
	{
		this.connectedNode = connectedNode;
		this.key = key;
	}
}
