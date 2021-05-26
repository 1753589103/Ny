package MediatorPattern;

public abstract class Component {
    protected MidiatorPattern mediator;

    public void setMediator(MidiatorPattern mediator) {
        this.mediator = mediator;
    }

    //转发调用
    public void changed() {
        mediator.componentChanged(this);
    }

    public abstract void update();

}
