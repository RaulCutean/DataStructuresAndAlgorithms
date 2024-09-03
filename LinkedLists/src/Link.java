public class Link <T> {

    public T _iData;
    public T _dData;
    public Link next ;

    public Link(T iData , T dData) {
        _iData = iData;
        _dData = dData;
    }

    public void displayLink() {
        System.out.println( "{" +_iData + ", " + _dData + "}");
    }

}
