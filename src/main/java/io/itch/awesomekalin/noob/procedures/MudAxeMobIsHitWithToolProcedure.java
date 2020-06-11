package io.itch.awesomekalin.noob.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;

import io.itch.awesomekalin.noob.NoobModElements;

@NoobModElements.ModElement.Tag
public class MudAxeMobIsHitWithToolProcedure extends NoobModElements.ModElement {
	public MudAxeMobIsHitWithToolProcedure(NoobModElements instance) {
		super(instance, 8);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MudAxeMobIsHitWithTool!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure MudAxeMobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		entity.setCustomName(new StringTextComponent("Noobed"));
		((itemstack)).setDisplayName(new StringTextComponent("HOW DARE YOU!"));
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"effect give @p poison 5 5");
			}
		}
	}
}
