package BuilderPattern;
class Cilent {
    public static void main(String[] args) throws NullPointerException{
        Actor actor,actor1;

        ActorBuilder actorBuilder = new AngelBuilder();

        ActorBuilder actorBuilder1 = new DevilBuilder();

        ActorController actorController = new ActorController();

        actor = actorController.consturct(actorBuilder);

        actor1 = actorController.consturct(actorBuilder1);

        System.out.println("type:"+actor.getType());
        System.out.println("sex:"+actor.getSex());
        System.out.println("face:"+actor.getFace());
        System.out.println("costume:"+actor.getCostume());
        System.out.println("hair:"+actor.getHairStyle());

        System.out.println("====================================");
        System.out.println("type:"+actor1.getType());
        System.out.println("sex:"+actor1.getSex());
        System.out.println("face:"+actor1.getFace());
        System.out.println("costume:"+actor1.getCostume());
        System.out.println("hair:"+actor1.getHairStyle());


    }
}
