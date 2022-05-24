package dezmond.visitorpattern;

import dezmond.visitorpattern.visitable.HMO;
import dezmond.visitorpattern.visitable.Home;
import dezmond.visitorpattern.visitable.House;
import dezmond.visitorpattern.visitable.Pub;
import dezmond.visitorpattern.visitable.Shop;
import dezmond.visitorpattern.visitor.Criminal;
import dezmond.visitorpattern.visitor.TaxCollector;
import java.util.ArrayList;
import java.util.List;
import dezmond.visitorpattern.visitor.IVisitor;

public class Main {

    public static void main(String[] args) {
        List<House> houses = new ArrayList<>();
        houses.add(new HMO());
        houses.add(new Home());
        houses.add(new Pub());
        houses.add(new Shop());
        
        IVisitor taxCollector = new TaxCollector();
        for (House house: houses) {
            house.accept(taxCollector);
        }
        
        IVisitor criminal = new Criminal();
        for (House house: houses) {
            house.accept(criminal);
        }
    }
}
