package com.example.meepmeep;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.core.colorscheme.scheme.ColorSchemeRedDark;
import com.noahbres.meepmeep.roadrunner.Constraints;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepTest {
    public static void main(String[] args) {
        MeepMeep mm = new MeepMeep(700);
        Constraints constraints = new Constraints(55, 55, Math.toRadians(180), Math.toRadians(180), 14.24);
//        RoadRunnerBotEntity blueCycleBot = new DefaultBotBuilder(mm)
//                .setDimensions(11.95, 13.8)
//                .setColorScheme(new ColorSchemeRedDark())
//                .setConstraints(constraints)
//                .followTrajectorySequence(drive -> drive.trajectorySequenceBuilder(new Pose2d(12, 64, Math.toRadians(90)))
////                        .strafeLeft(1.5)
////                        .back(15)
////                        .turn(Math.toRadians(-40))
////                        .back(14)
////                        .forward(14)
////                        .turn(Math.toRadians(-50))
////                        .forward(30)
////                        .back(30)
////                        .turn(Math.toRadians(50))
////                        .back(14)
////                        .forward(14)
////                        .turn(Math.toRadians(-50))
////                        .forward(30)
//                        .waitSeconds(2)
//                        .setReversed(true)
//                        .splineTo(new Vector2d(-6, 40), Math.toRadians(-110))
//                        .setReversed(false)
//                        .splineTo(new Vector2d(44, 48), Math.toRadians(0))
//                        .setReversed(true)
//                        .splineTo(new Vector2d(0, 37), Math.toRadians(-135))
//                        .setReversed(false)
//                        .splineTo(new Vector2d(44, 48), Math.toRadians(0))
//                        .build());
//
//        RoadRunnerBotEntity blueCarouselBot = new DefaultBotBuilder(mm)
//                .setDimensions(11.95, 13.8)
//                .setColorScheme(new ColorSchemeRedDark())
//                .setConstraints(constraints)
//                .followTrajectorySequence(drive -> drive.trajectorySequenceBuilder(new Pose2d(-36, 64, Math.toRadians(90)))
////                        .strafeRight(1.5)
////                        .back(12)
////                        .turn(Math.toRadians(40))
////                        .back(19)
////                        .forward(28)
////                        .turn(Math.toRadians(-130))
////                        .back(15)
////                        .forward(5)
////                        .strafeLeft(5.35)
////                        .forward(90)
//                        .waitSeconds(2)
//                        .setReversed(true)
//                        .splineTo(new Vector2d(-18, 40), Math.toRadians(-70))
//                        .waitSeconds(1)
//                        .setReversed(false)
//                        .splineToLinearHeading(new Pose2d(-62, 63, Math.toRadians(330)), Math.toRadians(110))
//                        .waitSeconds(1)
//                        .splineToLinearHeading(new Pose2d(-55, 58, Math.toRadians(90)), Math.toRadians(-90))
//                        .forward(8)
//                        .setReversed(true)
//                        .splineTo(new Vector2d(-18, 40), Math.toRadians(-70))
//                        .waitSeconds(1)
//                        .setReversed(false)
//                        .splineTo(new Vector2d(-60, 36), Math.toRadians(270))
//                        .build());
        RoadRunnerBotEntity redCycleBot = new DefaultBotBuilder(mm)
                .setDimensions(13, 13)
                .setColorScheme(new ColorSchemeRedDark())
                .setConstraints(constraints)
                .followTrajectorySequence(drive -> drive.trajectorySequenceBuilder(new Pose2d(12, 64, Math.toRadians(0)))

                        //Cycle to warehouse
                        .setReversed(false)
                        .splineTo(new Vector2d(50, 66), Math.toRadians(0))

                        .setReversed(true)
                        .splineTo(new Vector2d(12, 65), Math.toRadians(180))

                        .setReversed(false)
                        .splineTo(new Vector2d(50, 66), Math.toRadians(0))
                        .setReversed(true)
                        .splineTo(new Vector2d(12, 65), Math.toRadians(180))

                        .setReversed(false)
                        .splineTo(new Vector2d(50, 66), Math.toRadians(0))
                        .setReversed(true)
                        .splineTo(new Vector2d(12, 65), Math.toRadians(180))

                        .setReversed(false)
                        .splineTo(new Vector2d(50, 66), Math.toRadians(0))
                        .setReversed(true)
                        .splineTo(new Vector2d(12, 65), Math.toRadians(180))

                        .setReversed(false)
                        .splineTo(new Vector2d(50, 66), Math.toRadians(0))
                        .setReversed(true)
                        .splineTo(new Vector2d(12, 65), Math.toRadians(180))

                        .setReversed(false)
                        .splineTo(new Vector2d(50, 66), Math.toRadians(0))
                        .setReversed(true)
                        .splineTo(new Vector2d(12, 65), Math.toRadians(180))

                        .setReversed(false)
                        .splineTo(new Vector2d(50, 66), Math.toRadians(0))
                        .setReversed(true)
                        .splineTo(new Vector2d(12, 65), Math.toRadians(180))

                        .setReversed(false)
                        .splineTo(new Vector2d(50, 66), Math.toRadians(0))
                        .setReversed(true)
                        .splineTo(new Vector2d(12, 65), Math.toRadians(180))

                        .setReversed(false)
                        .splineTo(new Vector2d(50, 66), Math.toRadians(0))
                        .build());




//         .setReversed(true)
//                .splineTo(new Vector2d(-6, -40), Math.toRadians(110))
//                .waitSeconds(1.13)
//                .setReversed(false)
//                .splineTo(new Vector2d(18, -66), Math.toRadians(0))
//                .splineTo(new Vector2d(48, -66), Math.toRadians(0))
//                .setReversed(true)
//                .splineTo(new Vector2d(18, -66), Math.toRadians(180))
//                .splineTo(new Vector2d(-6, -40), Math.toRadians(110))
//                .waitSeconds(1.13)
//                .setReversed(false)
//                .splineTo(new Vector2d(18, -66), Math.toRadians(0))
//                .splineTo(new Vector2d(48, -66), Math.toRadians(0))
//                .setReversed(true)
//                .splineTo(new Vector2d(18, -66), Math.toRadians(180))
//                .splineTo(new Vector2d(-6, -40), Math.toRadians(110))
//                .waitSeconds(1.13)
//                .setReversed(false)
//                .splineTo(new Vector2d(18, -66), Math.toRadians(0))
//                .splineTo(new Vector2d(48, -66), Math.toRadians(0))
//                .setReversed(true)
//                .splineTo(new Vector2d(18, -66), Math.toRadians(180))
//                .splineTo(new Vector2d(-6, -40), Math.toRadians(110))
//                .waitSeconds(1.13)
//                .setReversed(false)
//                .splineTo(new Vector2d(18, -66), Math.toRadians(0))
//                .splineTo(new Vector2d(30, -66), Math.toRadians(0))
//                .build());
//                        .waitSeconds(1.13)
//                        .setReversed(false)
//                        .splineTo(new Vector2d(18, -66), Math.toRadians(0))
//                        .splineTo(new Vector2d(48, -66), Math.toRadians(0))
//                        .setReversed(true)
//                        .splineTo(new Vector2d(18, -66), Math.toRadians(180))
//                        .splineTo(new Vector2d(-6, -40), Math.toRadians(110))
//                        .waitSeconds(1.13)
//                        .setReversed(false)
//                        .splineTo(new Vector2d(18, -66), Math.toRadians(0))
//                        .splineTo(new Vector2d(48, -66), Math.toRadians(0))
//                        .setReversed(true)
//                        .splineTo(new Vector2d(18, -66), Math.toRadians(180))
//                        .splineTo(new Vector2d(-6, -40), Math.toRadians(110))
//                        .waitSeconds(1.13)
//                        .setReversed(false)
//                        .splineTo(new Vector2d(18, -66), Math.toRadians(0))
//                        .splineTo(new Vector2d(48, -66), Math.toRadians(0))
//                        .setReversed(true)
//                        .splineTo(new Vector2d(18, -66), Math.toRadians(180))
//                        .splineTo(new Vector2d(-6, -40), Math.toRadians(110))
//                        .waitSeconds(1.13)
//                        .setReversed(false)
//                        .splineTo(new Vector2d(18, -66), Math.toRadians(0))
//                        .splineTo(new Vector2d(30, -66), Math.toRadians(0))
//                        .setReversed(true)
//                        .splineTo(new Vector2d(18, -66), Math.toRadians(180))
//                        .splineTo(new Vector2d(-6, -40), Math.toRadians(110))
//                        .waitSeconds(1.13)
//                        .setReversed(false)
//                        .splineTo(new Vector2d(18, -66), Math.toRadians(0))
//                        .splineTo(new Vector2d(30, -66), Math.toRadians(0))
//                        .build());
//                        .splineTo(new Vector2d(16, -46), Math.toRadians(0))
//                        .splineTo(new Vector2d(36, -46), Math.toRadians(0))
//                        .splineTo(new Vector2d(44, -48), Math.toRadians(-20))
//                        .setReversed(true)
//                        .splineTo(new Vector2d(36, -46), Math.toRadians(180))
//                        .splineTo(new Vector2d(16, -46), Math.toRadians(180))
//                        .splineTo(new Vector2d(0, -37), Math.toRadians(135))
//                        .setReversed(false)
//                        .splineTo(new Vector2d(16, -46), Math.toRadians(0))
//                        .splineTo(new Vector2d(36, -46), Math.toRadians(0))
//                        .splineTo(new Vector2d(44, -48), Math.toRadians(-20))
//                        .setReversed(true)
//                        .splineTo(new Vector2d(36, -46), Math.toRadians(180))
//                        .splineTo(new Vector2d(16, -46), Math.toRadians(180))
//                        .splineTo(new Vector2d(0, -37), Math.toRadians(135))
//                        .setReversed(false)
//                        .splineTo(new Vector2d(16, -46), Math.toRadians(0))
//                        .splineTo(new Vector2d(36, -46), Math.toRadians(0))
//                        .splineTo(new Vector2d(44, -48), Math.toRadians(-20))
//                        .setReversed(true)
//                        .splineTo(new Vector2d(36, -46), Math.toRadians(180))
//                        .splineTo(new Vector2d(16, -46), Math.toRadians(180))
//                        .splineTo(new Vector2d(0, -37), Math.toRadians(135))
//                        .setReversed(false)
//                        .splineTo(new Vector2d(16, -46), Math.toRadians(0))
//                        .splineTo(new Vector2d(36, -46), Math.toRadians(0))
//                        .splineTo(new Vector2d(44, -48), Math.toRadians(-20))
//                        .setReversed(true)
//                        .splineTo(new Vector2d(36, -46), Math.toRadians(180))
//                        .splineTo(new Vector2d(16, -46), Math.toRadians(180))
//                        .splineTo(new Vector2d(0, -37), Math.toRadians(135))
//                        .setReversed(false)
//                        .splineTo(new Vector2d(16, -46), Math.toRadians(0))
//                        .splineTo(new Vector2d(36, -46), Math.toRadians(0))
//                        .splineTo(new Vector2d(44, -48), Math.toRadians(-20))
//                        .setReversed(true)
//                        .splineTo(new Vector2d(36, -46), Math.toRadians(180))
//                        .splineTo(new Vector2d(16, -46), Math.toRadians(180))
//                        .splineTo(new Vector2d(0, -37), Math.toRadians(135))
//                        .setReversed(false)
//                        .splineTo(new Vector2d(16, -46), Math.toRadians(0))
//                        .splineTo(new Vector2d(36, -46), Math.toRadians(0))
//                        .splineTo(new Vector2d(44, -48), Math.toRadians(-20))
//                        .setReversed(true)
//                        .splineTo(new Vector2d(36, -46), Math.toRadians(180))
//                        .splineTo(new Vector2d(16, -46), Math.toRadians(180))
//                        .splineTo(new Vector2d(0, -37), Math.toRadians(135))
//                        .setReversed(false)
//                        .splineTo(new Vector2d(16, -46), Math.toRadians(0))
//                        .splineTo(new Vector2d(36, -46), Math.toRadians(0))
//                        .build());
//
//        RoadRunnerBotEntity redCarouselBot = new DefaultBotBuilder(mm)
//                .setDimensions(11.95, 13.8)
//                .setColorScheme(new ColorSchemeRedDark())
//                .setConstraints(constraints)
//                .followTrajectorySequence(drive -> drive.trajectorySequenceBuilder(new Pose2d(-36, -64, Math.toRadians(-90)))
//                        .strafeLeft(1.5)
//                        .back(12)
//                        .turn(Math.toRadians(-40))
//                        .back(19)
//                        .forward(28)
//                        .turn(Math.toRadians(-140))
//                        .strafeLeft(15)
//                        .forward(3)
//                        .strafeRight(5)
//                        .forward(90)
//                        .waitSeconds(2)
//                        .setReversed(true)
//                        .splineTo(new Vector2d(-24, -37), Math.toRadians(45))
//                        .waitSeconds(1)
//                        .forward(8)
//                        .turn(Math.toRadians(140))
//                        .splineTo(new Vector2d(-55, -55), Math.toRadians(-135))
//                        .setReversed(false)
//                        .waitSeconds(1)
//                        .forward(5)
//                        .turn(Math.toRadians(-135))
//                        .forward(8)
//                        .setReversed(true)
//                        .splineTo(new Vector2d(-24, -37), Math.toRadians(45))
//                        .addTemporalMarker(() -> System.out.println(blueCarouselBot.getPose()))
//                        .waitSeconds(1)
//                        .setReversed(false)
//                        .splineTo(new Vector2d(-60, -36), Math.toRadians(90))
//                        .build());
//                        .splineTo(new Vector2d(44, -64), Math.toRadians(0))
//                        .setReversed(true)
//                        .splineTo(new Vector2d(-12, -42), Math.toRadians(90))
//                        .setReversed(false)
//                        .splineTo(new Vector2d(44, -64), Math.toRadians(0))
//                        .setReversed(true)
//                        .splineTo(new Vector2d(-12, -42), Math.toRadians(90))
//                        .setReversed(false)
//                        .splineTo(new Vector2d(44, -64), Math.toRadians(0))
//                        .build());

        mm.setBackground(MeepMeep.Background.FIELD_FREIGHTFRENZY_OFFICIAL)
                // Set theme
                .setTheme(new ColorSchemeRedDark())
                // Background opacity from 0-1
                .setBackgroundAlpha(1f)
//                .addEntity(blueCycleBot)
//                .addEntity(blueCarouselBot)
                .addEntity(redCycleBot)
//                .addEntity(redCarouselBot)
                .start();
    }
}