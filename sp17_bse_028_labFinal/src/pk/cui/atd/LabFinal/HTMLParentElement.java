package pk.cui.atd.LabFinal;

import java.util.ArrayList;


public class HTMLParentElement extends HTMLTag{
	
	private ArrayList<HTMLTag> children = new ArrayList<HTMLTag>();
	private String tagName;
	private String startTag;
	private String endTag;
	
	
	HTMLParentElement(String string)
	{
		this.tagName = string;
	}

	public String getTagName()
	{
		return tagName;
	}


	public void setStartTag(String startTag) 
	{
		this.startTag = startTag;
	}

	public void setEndTag(String endTag) 
	{
		this.endTag = endTag;
	}
	
	public void addChildTag(HTMLTag addchildtag)
	{
		children.add(addchildtag);
	}
	
	public void removeChildTag(HTMLTag removechildtag) 
	{
		children.remove(removechildtag);
	}
	
	public ArrayList<HTMLTag> getChildren()
	{
		return children;
	}

	@Override
	public void generateHtml()
	{
		System.out.println(startTag);
		for (HTMLTag htmlTag : children)
		{
			htmlTag.generateHtml();
		}
		System.out.println(endTag);
	}
	
}
