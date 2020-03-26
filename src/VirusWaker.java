import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;

public class VirusWaker extends WakerBehaviour {
    protected VirusAgent agent;

    public VirusWaker(VirusAgent Virusagent) {
        super(Virusagent, 10);
        this.agent = Virusagent;
    }

    public void onWake() {
        System.out.println("Hello! I am your virus. I will expire after I kill everyone or they kill me first.");
    }
}
