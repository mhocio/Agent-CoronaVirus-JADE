import jade.core.Agent;
import jade.core.behaviours.SimpleBehaviour;

public class VirusBehaviour extends SimpleBehaviour {
    protected VirusAgent agent;
    protected boolean finished = false;

    public VirusBehaviour(VirusAgent virusAgent) {
        super(virusAgent);
        this.agent = virusAgent;
    }

    public void action() {
        if (agent.noPeopleHealthy == 0) {
            finished = true;
            System.out.println("Everyone are infected!!!");
        }
    }

    public final boolean done() {
        return finished;
    }
}
