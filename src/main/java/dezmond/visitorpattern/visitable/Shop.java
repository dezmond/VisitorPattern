package dezmond.visitorpattern.visitable;

import dezmond.visitorpattern.visitor.IVisitor;

public class Shop extends House {

    public Shop() {        
    }

    @Override
    public void accept(IVisitor v) {
        v.visit(this);
    }
    
}