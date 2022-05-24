package dezmond.visitorpattern.visitable;

import dezmond.visitorpattern.visitor.IVisitable;

public abstract class House implements IVisitable {

    private String address;

    public House() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
