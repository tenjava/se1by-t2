package com.bitbyterstudios.tenjava.devices;

import org.bukkit.Location;

/**
 * Created by Jonas Seibert on 12.07.2014.
 * All rights reserved.
 *
 * Possible devices: furnance, chest(spawning frankenstein^^), redstone block as battery
 */
public interface Device {
    /**
     * Called when a device gets powered. Should handle conversion, spawning etc.
     */
    public void power();
    public Location getLocation();
}
