package io.github.dbstjr3377.deepcombat;

import org.bukkit.plugin.java.JavaPlugin;

public final class DeepCombat extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("DeepCombat enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("DeepCombat disabled");
    }
}
