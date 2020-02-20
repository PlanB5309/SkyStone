import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@Autonomous(name="Color Sensor Testing")
public class ColorSensorOutput extends LinearOpMode {
    RobotHardware robot = new RobotHardware();
    FindSkyStone findSkyStone = new FindSkyStone(robot, telemetry, this);

    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);
        waitForStart();
        while (opModeIsActive()) {
            int avg = (robot.frontColorSensor.red()+robot.frontLeftColorSensor.red())/2;
            telemetry.addData("Front Color Sensor: ", robot.frontColorSensor.red());
            telemetry.addData("Front Left Color Sensor: ", robot.frontLeftColorSensor.red());
            telemetry.addData("Front Color Fraction", (float) robot.frontColorSensor.red()/avg);
            telemetry.addData("Front Left Color Fraction", (float) robot.frontLeftColorSensor.red()/avg);
            telemetry.addData("Front Distance Sensor: ", robot.frontDistanceSensor.getDistance(DistanceUnit.CM));
            telemetry.addData("Left Distance Sensor: ", robot.leftDistanceSensor.getDistance(DistanceUnit.CM));
            telemetry.addData("Right Distance Sensor: ", robot.rightDistanceSensor.getDistance(DistanceUnit.CM));
//            telemetry.addData("Red Threshold Value: ",
//                    (Math.pow(robot.frontDistanceSensor.getDistance(DistanceUnit.CM), -1.247)) * 3003);
//            telemetry.addData("Red Left Threshold Value: ",
//                    (Math.pow(robot.frontLeftDistanceSensor.getDistance(DistanceUnit.CM), -1.247)) * 3003);
            telemetry.addData("Current Light Modifier: ", robot.AMBIENT_LIGHT_MODIFIER);
            telemetry.update();
            Thread.sleep(100);
        }
    }
}