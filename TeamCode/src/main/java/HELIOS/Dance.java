package HELIOS;

import team5009.OpModes.AutonomousWithPaths;
import team5009.OpModes.Paths.annotations.Main;

/**
 * Created by team5009 on 2016-03-05.
 */
@Main
public class Dance extends Path {
    public Dance(AutonomousWithPaths auto) throws InterruptedException {
        super(auto);
    }

    @Override
    public void run() throws InterruptedException {
        boolean i = false;
        while (auto.opModeIsActive()) {
            i = !i;
            if (i) {
                auto.robot.servos.get(0).reposition(0.0);
                auto.robot.servos.get(1).reposition(.6);
                auto.robot.servos.get(2).reposition(0.0);
            } else {
                auto.robot.servos.get(0).reposition(.65);
                auto.robot.servos.get(1).reposition(.99);
                auto.robot.servos.get(2).reposition(0.48);
            }
            auto.sleep(500);
        }
    }
}
