package dezmond.visitorpattern.visitor;

import dezmond.visitorpattern.visitable.HMO;
import dezmond.visitorpattern.visitable.Home;
import dezmond.visitorpattern.visitable.Pub;
import dezmond.visitorpattern.visitable.Shop;

public class TaxCollector implements IVisitor {

    @Override
    public void visit(Shop shop) {
        System.out.println("Tax collector visited the shop and made sure their accounts were in order.");
    }

    @Override
    public void visit(Home home) {
        System.out.println("Tax collector visited the home and made sure people had been paying their income tax.");
    }

    @Override
    public void visit(HMO hmo) {
        System.out.println("Tax collector visited the different people in each occupancy and made sure each had been paying their income tax.");
    }

    @Override
    public void visit(Pub pub) {
        System.out.println("Tax collector visited the pub and had a pint.");
    }

}