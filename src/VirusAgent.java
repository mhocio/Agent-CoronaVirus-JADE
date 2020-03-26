import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class VirusAgent extends Agent
{
    protected long timeout;

    protected long noInfected;
    protected long noPeopleHealthy;
    protected long noKilled;

    protected double killChance = 5;
    protected double cureChance = 30;
    protected double infectChance = 40;

    public String Name;

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long t) {
        timeout = t;
    }

    protected void setup() {
        System.out.println("Hello World. ");
        System.out.println("My name is "+ getLocalName());

        Object[] args = getArguments();
        Name = (String)args[0];
        noInfected = 1;
        noKilled = 0;
        noPeopleHealthy = Long.parseLong((String)args[1]);

        Behaviour behaviour = new VirusWaker(this);
        this.addBehaviour(behaviour);

        behaviour = new VirusTicker(this, 1000);
        this.addBehaviour(behaviour);

        behaviour = new VirusBehaviour(this);
        this.addBehaviour(behaviour);
    }

    protected void takeDown() {
        super.takeDown();
    }
}
