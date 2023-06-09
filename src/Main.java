import java.io.File;

public class Main {

    public static void main(String[] args) {
        String inst = "n32-k5"; // or "n80-k10"

        File instFile = new File("files/" + inst + ".vrp");
        VRPInstance instance = VRPIO.loadInstance(instFile);

        VRPSolution nnSol = Utility.nearestNeighbourHeuristic(instance);
        nnSol.setTotalCost(Utility.calculateTotalCost(nnSol, instance));

        VRPSolution svSol = Utility.savingsHeuristic(instance);
        svSol.setTotalCost(Utility.calculateTotalCost(svSol, instance));

        VRPIO.writeSolution(nnSol, "files/" + inst + "nn.sol");
        VRPIO.writeSolution(svSol, "files/" + inst + "sv.sol");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\n complete! Check the files folder for the solutions. \n");
        System.out.println("-----------------------------------------------------------------");
    }
}
