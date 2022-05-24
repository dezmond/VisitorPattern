package dezmond.visitorpattern.visitor;

import dezmond.visitorpattern.visitable.Pub;
import dezmond.visitorpattern.visitable.HMO;
import dezmond.visitorpattern.visitable.Shop;
import dezmond.visitorpattern.visitable.Home;

public interface IVisitor {
    public void visit(Shop shop);
    public void visit(Home home);
    public void visit(HMO hmo);
    public void visit(Pub pub);
}