import utility as utility
import loader as loader
import numpy as np


def main():

    # Paths to the data and solution files.
    vrp_file = "n32-k5.vrp"  # "data/n80-k10.vrp"


    # Loading the VRP data file.
    px, py, demand, capacity, depot = loader.load_data("../files/" + vrp_file)

    # Displaying to console the distance and visualizing the optimal VRP solution.
    vrp_best_sol1 = loader.load_solution("../files/n32-k5nn.sol")
    vrp_best_sol2 = loader.load_solution("../files/n32-k5sv.sol")
    utility.visualise_solution(vrp_best_sol1, px, py, depot, "nearest neighbour")
    utility.visualise_solution(vrp_best_sol2, px, py, depot, "savings")


main() # Calling main function.

