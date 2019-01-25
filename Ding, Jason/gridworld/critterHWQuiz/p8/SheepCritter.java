package critterHWQuiz.p8;

/**
 * A SheepCritter looks for a WolfCritter directly in front of it.
 * The SheepCritter does not look for any other types of actors nor does
 * it look anywhere else for a WolfCritter.
 * 
 * If the SheepCritter does not see a WolfCritter it moves like a Critter.
 * 
 * If the SheepCritter sees a WolfCritter it attempts to move backwards.
 * The SheepCritter can only move backwards if the location directly
 * behind it is empty. If the SheepCritter cannot move backwards it does
 * not move.
 * 
 * If the SheepCritter sees a WolfCritter for 3 consecutive runs of act
 * (including the current run) it dies (removes itself from the grid).
 */
public class SheepCritter
{
    
}
