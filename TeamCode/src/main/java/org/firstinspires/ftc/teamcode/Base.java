package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Rulon on 2016-11-28.
 */


@TeleOp (name = "ENTER NAME HERE")
//@disabled
public class Base extends LinearOpMode
{
    private DcMotor motorLeft;
    private DcMotor motorRight;

    private Servo armServo;
    
    @Override
    public void runOpMode () throws  InterruptedException
    {

        waitForStart();

        while (opModeIsActive())
        {



            idle();
    }



}
