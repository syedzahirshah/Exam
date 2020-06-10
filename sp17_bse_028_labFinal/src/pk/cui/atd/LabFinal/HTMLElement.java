package pk.cui.atd.LabFinal;

public class HTMLElement extends HTMLTag {

	String tagName;
	String startTag;
	String endTag;
	String tagBody;
	
	
	HTMLElement(String string) 
	{
		this.tagName = string;
	}
	
	@Override
	public String getTagName() 
	{
		return tagName;
	}

	@Override
	public void setStartTag(String starttag) 
	{
		this.startTag = starttag;
	}

	@Override
	public void setEndTag(String endtag)
	{
		this.endTag = endtag;
	}
	
	public void setTagBody(String bodytag)
	{
		this.tagBody = bodytag;
	}

	@Override
	public void generateHtml()
	{
		System.out.println(startTag + " " + tagBody + " " + endTag);
	}
}
