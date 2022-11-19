package frc.robot;

import com.pathplanner.lib.PathPlanner;

import edu.wpi.first.math.trajectory.Trajectory;

public final class Trajectories {
    public static final Trajectory PATH_1 = PathPlanner.loadPath("Path 1", 10.0, 5.0, false);
    /**
     * SAMPLE:
     * Trajectory SAMPLE_PATH1 = PathPlanner.loadPath("5BallAuto", 10.0, 5.0, false);
     * Trajectory SAMPLE_PATH2 = PathPlannerHelper.loadPath("5BallAuto", false);
     */
}