package com.genericsassignments;

public class Pair<k extends String,v extends String>
	{
	k key;
	v value;
	Pair(k key,v value)
	{
	    this.key=key;
	    this.value=value;
	}
	public void setkey(k key)
	{
	    this.key=key;
	}
	public void setvalue(v value)
	{
	    this.value=value;
	}
	public k getkey()
	{
	    return key;
	}
	public v getvalue()
	{
	    return value;
	}

}
