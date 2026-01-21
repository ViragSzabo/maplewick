package implementation.week14.cybernetic;

import java.util.ArrayList;
import java.util.List;

public class Hospital
{

    private String hospitalName;
    private List<Robot> robotList;

    public Hospital(String hospitalName)
    {
        setHospitalName(hospitalName);
        this.robotList = new ArrayList<>();
    }

    public void printReport()
    {
        for (Robot robot : robotList)
        {
            System.out.println(robot.getSerialNumber() + robot.selfCheck());
        }
    }

    public String getHospitalName()
    {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName)
    {
        if (hospitalName == null)
        {
            throw new IllegalArgumentException("Hospital name cannot be null");
        }

        this.hospitalName = hospitalName;
    }

    public List<Robot> getRobotList()
    {
        return this.robotList;
    }

    public void addRobot(Robot robot)
    {
        this.robotList.add(robot);
    }

    public void removeRobot(Robot robot)
    {
        this.robotList.remove(robot);
    }
}