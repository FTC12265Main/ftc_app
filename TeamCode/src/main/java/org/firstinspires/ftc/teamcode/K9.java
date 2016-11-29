package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Rulon on 2016-11-28.
 * Edited by Raymond 6:03
 */


@TeleOp (name = "ENTER NAME HERE")

//@disabled
public class K9 extends LinearOpMode
{

    private DcMotor motorLeft;
    private DcMotor motorRight;

    private Servo armServo;
    
    @Override
    public void runOpMode () throws  InterruptedException
    {
        motorLeft = hardwareMap.dcMotor.get("motorLeft");
        motorRight = hardwareMap.dcMotor.get("motorRight");
        motorLeft.setDirection(DcMotor.Direction.REVERSE);
        armServo = hardwareMap.servo.get("armServo");

        waitForStart();


        while (opModeIsActive())
        {

            motorRight.setPower(gamepad1.right_stick_y);
            motorLeft.setPower(gamepad1.left_stick_y);



            


        }


        while (opModeIsActive()) {



        }
            idle();
    }



}
