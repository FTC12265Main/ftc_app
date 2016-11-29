package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by Rulon on 2016-11-28.
 * Edited by Raymond 6:03
 */


@TeleOp (name = "ENTER NAME HERE")

//@disabled
public class K9 extends LinearOpMode
{
    @Override
    public void runOpMode () throws  InterruptedException
    {
        motorLeft = hardwareMap.dcMotor.get("motorLeft");
        motorRight = hardwareMap.dcMotor.get("motorRight");
        motorLeft.setDirection(Dcmotor.Direction.REVERSE);
        armServo = hardwardMap.servo.get("armServo");

        waitForStart();

<<<<<<< HEAD
        while (opModeIsActive())
        {

            


        }

=======
        while (opModeIsActive()) {
>>>>>>> ed028b80afd002702e253a85a1ecfc406bf08416


        }
            idle();
    }



}
