package dezmond.visitorpattern.visitable;

import dezmond.visitorpattern.visitor.IVisitor;

public class Home extends House {

    public Home() {        
    }

    @Override
    public void accept(IVisitor v) {
        v.visit(this);
    }
    
}