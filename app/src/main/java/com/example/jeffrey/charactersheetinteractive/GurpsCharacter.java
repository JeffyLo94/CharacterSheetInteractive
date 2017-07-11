package com.example.jeffrey.charactersheetinteractive;

/**
 * GurpsCharacter Class
 *
 *
 * GURPS is a trademark of Steve Jackson Games, and its rules and art are copyrighted
 * by Steve Jackson Games. All rights are reserved by Steve Jackson Games. This game aid is the
 * original creation of Ben Finney and is released for free distribution, under the permissions
 * granted in the Steve Jackson Games Online Policy.
 *
 * @author Jeffrey Lo
 */

public class GurpsCharacter {
    //Constructors

    //Mutators

    //Accessors

    //V A R I A B L E S
    //Primary Attributes
    private int str; //Strength
    private int dex; //Dexterity
    private int iq;  //Intelligence
    private int ht;  //Health

    //Derived Attributes
    private int hp;   //Health Pool
    private int will; //Will
    private int per;  //Perception
    private int fp;   //Fatigue Points
    private int baseLift;   // Base Lift in Kilograms
    private int dmgThr;     // Thrust Damage
    private int dmgSw;      // Swing Damage
    private int baseSpeed;  // Base Speed in m/s
    private int baseMove;   // Base Movement
    private int encumbrance;    //Encumbrance in kg
    //Build Modifiers
    private int height;         //Character Height in meters - May Need to change to ENUM
    private int weight;         //Character weight in meters - May need to change to ENUM
    private int sizeMod;        //Size Modifier
    private int age;            //Age
    private String appearance;  //Description of Appearance;

    //For all Metric References:  http://bignose.whitetree.org/projects/gurps/house-rules.devel/gurps-metric.xhtml

    //Character Variables
    private String charName;    //Character name
    //Player Class
    private int totPts;         //Total Points
    private int unspentPts;     //Unspent points
    private String notes;       //Notes about Character


    //Backstory Variables
    //Language Known Container - List of Language Modifier Class Objects
    //Advantages List - Contains List of Modifier Class Objects
    //Disadvantages List - List of Modifier Class Objects

    //Inventory
    //List of Hand Wepaons
    //List of Ranged Weapons
    //List of Armor
    //List of Possessions

}
