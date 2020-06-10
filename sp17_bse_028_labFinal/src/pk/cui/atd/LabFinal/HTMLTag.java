package pk.cui.atd.LabFinal;

import java.util.List;

public abstract class HTMLTag {
	
	HTMLTag()
	{
		
	}
	
	public abstract String getTagName();
	public abstract void setStartTag(String tag);
	public abstract void setEndTag(String tag);
	
	public void setTagBody(String tagbody) 
	{
		
	}
	
	public void addChildTag(HTMLTag addchiltag) 
	{
		
	}
	
	public void removeChildTag(HTMLTag removechildtag)
	{
		
	}
	
	public List<HTMLTag> getChildren()
	{
		return null;
		
	}
	
	public abstract void generateHtml();
}
