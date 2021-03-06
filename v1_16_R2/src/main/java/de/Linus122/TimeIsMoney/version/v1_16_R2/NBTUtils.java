package de.Linus122.TimeIsMoney.version.v1_16_R2;

import de.Linus122.TimeIsMoney.tools.ActionBarUtils;
import net.minecraft.server.v1_16_R2.ChatMessageType;
import net.minecraft.server.v1_16_R2.IChatBaseComponent;
import net.minecraft.server.v1_16_R2.PacketPlayOutChat;
import org.bukkit.craftbukkit.v1_16_R2.entity.CraftPlayer;
import org.bukkit.entity.Player;

import static de.Linus122.TimeIsMoney.tools.Utils.CC;

import java.util.UUID;

/**
 * NBT Utils for v1_16_R2.
 *
 * @author Linus122
 * @since 1.9.6.12
 */
public class NBTUtils implements ActionBarUtils {
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void sendActionBarMessage(Player p, String message) {
		IChatBaseComponent icbc = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + CC(message) + "\"}");
		PacketPlayOutChat bar = new PacketPlayOutChat(icbc, ChatMessageType.GAME_INFO, UUID.randomUUID());
		((CraftPlayer) p).getHandle().playerConnection.sendPacket(bar);
	}
}
