package q2;
import java.util.*;
import java.io.*;

public class Report {
    public static void report(Writer out, List<Machine> machines, Robot robot)
            throws IOException 
    {
       /* out.write("FACTORY REPORT\n");

        Iterator<Machine> line = machines.iterator();
        while (line.hasNext()) {
            Machine machine = (Machine) line.next();
            out.write("Machine " + machine.name());

            if (machine.bin() != null)
                out.write(" bin=" + machine.bin());

            out.write("\n");
        }
        out.write("\n");

        out.write("Robot");
        if (robot.location() != null)
            out.write(" location=" + robot.location().name());

        if (robot.bin() != null)
            out.write(" bin=" + robot.bin());

        out.write("\n");

        out.write("========\n");*/
    	
    	writeHeader(out);
    	writeMachines(out, machines);
    	writeRobot(out, robot);
    	writeFooter(out);
    }
    
    public static void writeHeader(Writer out)
    		throws IOException
    {
    	out.write("FACTORY REPORT\n");
    }
    
    public static void writeMachines(Writer out, List<Machine> machines)
    		throws IOException
    {
    	Iterator<Machine> line = machines.iterator();
        while (line.hasNext()) {
            Machine machine = (Machine) line.next();
            out.write("Machine " + machine.name());

            if (machine.bin() != null)
                out.write(" bin=" + machine.bin());

            out.write("\n");
        }
        out.write("\n");
    }
    
    public static void writeRobot(Writer out, Robot robot)
    		throws IOException
    {
    	out.write("Robot");
        if (robot.location() != null)
            out.write(" location=" + robot.location().name());

        if (robot.bin() != null)
            out.write(" bin=" + robot.bin());

        out.write("\n");
    }
    
    public static void writeFooter(Writer out)
    		throws IOException
    {
    	out.write("========\n");
    }
}