package dezmond.visitorpattern.visitable;

import dezmond.visitorpattern.visitor.IVisitor;

public class HMO extends House {

    public HMO() {        
    }

    @Override
    public void accept(IVisitor v) {
        v.visit(this);
    }
    
}