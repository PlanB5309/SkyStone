import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class SkyStoneClaw {

    RobotHardware robot;
    Telemetry telemetry;
    LinearOpMode linearOpMode;

    public SkyStoneClaw (RobotHardware robot, Telemetry telemetry, LinearOpMode linearOpMode){
        this.robot = robot;
        this.telemetry = telemetry;
        this.linearOpMode = linearOpMode;
    }
    public void down () throws InterruptedException {
        robot.skyStoneClaw.setPosition(robot.SKYSTONE_SERVO_DOWN_AUTO);
        Thread.sleep (500);
    }
    public void up () throws InterruptedException {
        robot.skyStoneClaw.setPosition(robot.SKYSTONE_SERVO_UP);
        Thread.sleep(500);
    }
    public void tray_down () throws InterruptedException {
        robot.skyStoneClaw.setPosition(robot.SKYSTONE_SERVO_DOWN_TELEOP);
        Thread.sleep(500);
    }

}