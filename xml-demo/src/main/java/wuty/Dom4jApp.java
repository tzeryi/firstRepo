package wuty;

import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class Dom4jApp {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws DocumentException {

		SAXReader reader = new SAXReader();
		System.out.println(ClassLoader.getSystemResourceAsStream("columnInfo.xml"));
		Document document = reader.read(ClassLoader.getSystemResourceAsStream("columnInfo.xml"));

		//Element root = document.getRootElement();

		List<Element> list = document.selectNodes("/config/columns/column");
		for (Element node : list)
		{
			Node element = node.selectSingleNode("columns");
			
			if (element == null)
			{
				System.out.println("single : " + node.selectSingleNode("headerText").getStringValue());
				System.out.println("single : " + node.selectSingleNode("dataField").getStringValue());
			}
			else
			{
				System.out.println(element.selectSingleNode("../headerText").getStringValue());
				List<Node> groupNode = element.selectNodes("column");
				for (Node gNode : groupNode)
				{
					System.out.println("group : " + gNode.selectSingleNode("headerText").getStringValue());
					System.out.println("group : " + gNode.selectSingleNode("dataField").getStringValue());
				}
			}
		}
		
	}

	public static void treeWalk(Element element) {
	    for ( int i = 0, size = element.nodeCount(); i < size; i++ ) {
	        Node node = element.node(i);
	        if (node instanceof Element) {
	            treeWalk( (Element) node );
	        }
	        else {
	            // do something....
	        }
	    }
	}

}
