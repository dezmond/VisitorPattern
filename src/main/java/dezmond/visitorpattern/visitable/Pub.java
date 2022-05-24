package dezmond.visitorpattern.visitable;

import dezmond.visitorpattern.visitor.IVisitor;

public class Pub extends House {
   
    public Pub() {        
    }

    @Override
    public void accept(IVisitor v) {
        v.visit(this);
    }
    
}