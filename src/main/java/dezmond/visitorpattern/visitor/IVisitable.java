package dezmond.visitorpattern.visitor;

import dezmond.visitorpattern.visitor.IVisitor;

public interface IVisitable{
  public void accept(IVisitor visitor);
}