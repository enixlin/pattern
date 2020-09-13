package simple.prototype;

public class ConcreteProtoType implements IProtoType {
    @Override
    public ConcreteProtoType clone() {
        ConcreteProtoType protoType = new ConcreteProtoType();
        return protoType;
    }
}
