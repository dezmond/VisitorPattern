package dezmond.visitorpattern.visitor;

import dezmond.visitorpattern.visitable.HMO;
import dezmond.visitorpattern.visitable.Home;
import dezmond.visitorpattern.visitable.Pub;
import dezmond.visitorpattern.visitable.Shop;

public class Criminal implements IVisitor {

    @Override
    public void visit(Shop shop) {
        System.out.println("A criminal visited the shop and stole a cake.");
    }

    @Override
    public void visit(Home home) {
        System.out.println("A criminal visited a home and riffled through their belongings for valuables.");
    }

    @Override
    public void visit(HMO hmo) {
        System.out.println("A criminal visited an HMO and quickly went through each occupancy for valuables.");
    }

    @Override
    public void visit(Pub pub) {
        System.out.println("A criminal visited a pub and had a meal on his ill gotten gains.");
    }

}