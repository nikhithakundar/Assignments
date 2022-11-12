package com.genericsassignments;

import java.util.Date;

public class Pair1 <k extends String,v extends Date>
{
    k key;
    v value;
    Pair1(k key,v value)
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
