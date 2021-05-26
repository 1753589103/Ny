package BuilderPattern;

public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public void buildType() {
    }
    public void buildSex() {
    }
    public void buildFace() {
    }
    public void buildCostume() {
    }
    public void buildHairStyle() {
    }
    public Actor creatActor(){
        System.out.println(actor );
        return actor;
    }
}
