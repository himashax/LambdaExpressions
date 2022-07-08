package pastpapers;

import java.util.ArrayList;
import java.util.List;

//interface ITrafficService{
//    public String checkSpeed(List<Double> listOfCheckPoints);
//}

public class VehicleMonitor{

    public void displayResult(ArrayList<Double> list, ITrafficService iTrafficService){
        iTrafficService.checkSpeed(list);
    }

     static ITrafficService iTrafficService = listOfCheckPoints -> {

          double averageSpeed = listOfCheckPoints.stream().mapToDouble(Double::doubleValue).sum() / (listOfCheckPoints.size());


          if (averageSpeed >= 100.0) {
              return "Issue Fine";
          } else if ((averageSpeed < 100.0) && (averageSpeed >= 80.0)) {
              return "Warning message";
          } else if ((averageSpeed < 80.0) && (averageSpeed >= 50.0)) {
              return "Good speed";
          } else if ((averageSpeed < 50.0) && (averageSpeed >= 30.0)) {
              return "Normal";
          } else {
              return "Slow";
          }

    };



    public static void main(String[] args) {
        VehicleMonitor vehicleMonitor = new VehicleMonitor();

        ArrayList<Double> speedinCheckPoint = new ArrayList<>();
        speedinCheckPoint.add(20.0);
        speedinCheckPoint.add(30.0);
        speedinCheckPoint.add(60.0);
        speedinCheckPoint.add(80.0);
        speedinCheckPoint.add(100.0);
        speedinCheckPoint.add(120.0);

//        String result = iTrafficService.checkSpeed(speedinCheckPoint);
        //String result = vehicleMonitor.displayResult(speedinCheckPoint, iTrafficService);
        //System.out.println("Vehicle average status is in = " + result);
    }
}
