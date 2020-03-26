import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
import java.util.Random;

public class VirusTicker extends TickerBehaviour {
    VirusAgent agent;

    int day = 0;

    public VirusTicker(VirusAgent virusAgent, int days) {
        super(virusAgent, days);
        this.agent = virusAgent;
    }

    @Override
    protected void onTick() {
        System.out.println("Day " + day);
        System.out.println("Infected: " + agent.noInfected);
        System.out.println("Healthy: " + agent.noPeopleHealthy);
        System.out.println("Killed: " + agent.noKilled);
        System.out.println();

        if (agent.noInfected == 0 && agent.noPeopleHealthy == 0) {
            System.out.println("I killed everyone... Buhahahahha!!!");
            this.stop();
        } else if (agent.noInfected == 0) {
            System.out.println("You defeated the virus.");
            this.stop();
        }

        long infected = 0;
        long killed = 0;
        long cured = 0;

        for(int human = 0; human < agent.noInfected; human += 1) {
            Random random = new Random();

            if (random.nextInt(100) < agent.infectChance) {
                if (agent.noPeopleHealthy > 0) {
                    agent.noPeopleHealthy -= 1;
                    infected += 1;
                }
            }

            random = new Random();
            if (random.nextInt(100) < agent.cureChance) {
                agent.noPeopleHealthy += 1;
                cured += 1;
                continue;
            }

            random = new Random();
            if (random.nextInt(100) < agent.killChance) {
                killed += 1;
                continue;
            }
        }

        agent.noInfected += infected;
        agent.noInfected -= killed;
        agent.noInfected -= cured;

        agent.noKilled += killed;

        day += 1;
    }
}
