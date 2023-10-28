import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 * The Car subclass
 */
public class Car extends Vehicle
{
    
    public Car(VehicleSpawner origin) {
        super(origin); // call the superclass' constructor
        maxSpeed = 1.5 + ((Math.random() * 30)/5);
        speed = maxSpeed;
        yOffset = 4;
        followingDistance = 6;
    }

    public void act()
    {
        super.act();
    }


    

    /**
     * When a Car hit's a Pedestrian, it should knock it over and honk the horn
     */
    public boolean checkHitPedestrian() {
        Pedestrian p = (Pedestrian)getOneObjectAtOffset((int)speed + getImage().getWidth()/2, 0, Pedestrian.class);
        if (p != null)
        {
            p.knockDown();
            //honkHorn(); // Call the honkHorn method when hitting a pedestrian
            return true;
        }
        return false;
    }
}
