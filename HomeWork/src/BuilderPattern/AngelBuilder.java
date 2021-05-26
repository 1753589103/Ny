package BuilderPattern;

public class AngelBuilder extends ActorBuilder{
        @Override
        public void buildType() {
            actor.setType("angel");
        }

        @Override
        public void buildSex() {
            actor.setSex("woman");
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
            actor.setHairStyle("长发");
        }
}
