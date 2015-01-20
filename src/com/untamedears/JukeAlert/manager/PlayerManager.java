package com.untamedears.JukeAlert.manager;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class PlayerManager {

    public Player[] getPlayers() {
        return (Player[]) Bukkit.getServer().getOnlinePlayers().toArray();
    }

}
