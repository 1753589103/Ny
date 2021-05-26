package BuilderPattern;

public class ActorController {
    public Actor consturct(ActorBuilder ab){
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildHairStyle();
        ab.buildCostume();
        actor = ab.creatActor();
        return actor;
    }
}
