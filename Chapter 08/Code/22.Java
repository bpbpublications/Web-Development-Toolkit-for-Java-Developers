package src;

public class PageAccessCount 
{
    static private int count=0;
private String pagename;

    public int getCount() {
        return count;
    }

    public void setCount(int i) {
        count = count + i;
    }

    public String getPagename() {
        return pagename;
    }

    public void setPagename(String pagename) {
this.pagename = pagename;
    }
}
