package wuty.bean.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="config")  
public class ConfigXmlVo {

	@XmlElement (name="columns")
	public void setColumns(String columns)
	{
		
	}
}
