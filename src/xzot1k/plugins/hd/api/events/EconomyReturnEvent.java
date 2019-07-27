package xzot1k.plugins.hd.api.events;

import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import xzot1k.plugins.hd.HyperDrive;

public class EconomyReturnEvent extends Event implements Cancellable {
    private HyperDrive pluginInstance;
    private static HandlerList handlers;
    private boolean cancelled;
    private double amount;
    private OfflinePlayer player;

    public EconomyReturnEvent(HyperDrive pluginInstance, OfflinePlayer player, double amount) {
        setPluginInstance(pluginInstance);
        handlers = new HandlerList();
        setCancelled(false);
        setPlayer(player);
        setAmount(amount);
    }

    private HyperDrive getPluginInstance() {
        return pluginInstance;
    }

    private void setPluginInstance(HyperDrive pluginInstance) {
        this.pluginInstance = pluginInstance;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public OfflinePlayer getPlayer() {
        return player;
    }

    private void setPlayer(OfflinePlayer player) {
        this.player = player;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}