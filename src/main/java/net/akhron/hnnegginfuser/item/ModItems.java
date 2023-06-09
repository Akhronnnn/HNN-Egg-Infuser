package net.akhron.hnnegginfuser.item;

import net.akhron.hnnegginfuser.HNNEggInfuser;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HNNEggInfuser.MOD_ID);
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
