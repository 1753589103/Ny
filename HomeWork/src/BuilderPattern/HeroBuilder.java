package BuilderPattern;

public class HeroBuilder extends ActorBuilder{
    @Override
    public void buildType() {
        actor.setType("hero");
    }

    @Override
    public void buildSex() {
        actor.setSex("man");
    }

    @Override
    public void buildFace() {
        actor.setFace("面瘫脸");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("铠甲");
    }

    @Override
    public void buildHairStyle() {
        actor.setHairStyle("光头");
    }
}
