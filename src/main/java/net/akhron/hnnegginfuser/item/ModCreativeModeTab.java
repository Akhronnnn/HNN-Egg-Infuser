package net.akhron.hnnegginfuser.item;

import net.akhron.hnnegginfuser.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab HNNEGGINFUSER_TAB = new CreativeModeTab("hnnegginfusertab")
            {
                @Override
                public ItemStack makeIcon()
                {
                    return new ItemStack(ModBlocks.EGGINFUSER.get());
                }
            };
}
