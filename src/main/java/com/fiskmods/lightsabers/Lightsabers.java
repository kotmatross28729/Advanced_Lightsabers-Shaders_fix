package com.fiskmods.lightsabers;

import static com.fiskmods.lightsabers.common.config.ModConfig.denyAnimationslist;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fiskmods.lightsabers.common.command.CommandForce;
import com.fiskmods.lightsabers.common.config.ItemsRegistry;
import com.fiskmods.lightsabers.common.config.ModConfig;
import com.fiskmods.lightsabers.common.item.ModItems;
import com.fiskmods.lightsabers.common.proxy.CommonProxy;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import fiskfille.utils.FiskUtils;
import fiskfille.utils.FiskUtils.Hook;

@Mod(
    modid = Lightsabers.MODID,
    name = Lightsabers.NAME,
    version = Lightsabers.VERSION,
    dependencies = "required-after:Forge@[10.13.4.1558,);after:" + ALConstants.BATTLEGEAR
        + ";after:"
        + ALConstants.DYNAMIC_LIGHTS,
    guiFactory = "com.fiskmods.lightsabers.client.gui.GuiFactoryAL")
public class Lightsabers {

    public static final String NAME = "Advanced Lightsabers";
    public static final String MODID = "lightsabers";
    public static final String VERSION = "1.2.6" + " kotmatross edition";

    public static final Logger logger = LogManager.getLogger(NAME);

    @Instance
    public static Lightsabers instance;

    @SidedProxy(
        clientSide = "com.fiskmods.lightsabers.common.proxy.ClientProxy",
        serverSide = "com.fiskmods.lightsabers.common.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static final CreativeTabs CREATIVE_TAB = new CreativeTabs(MODID) {

        @Override
        public Item getTabIconItem() {
            return ModItems.lightsaber;
        }
    };

    public static boolean isBattlegearLoaded;
    public static boolean isDynamicLightsLoaded;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        FiskUtils.hook(Hook.PREINIT);

        isBattlegearLoaded = Loader.isModLoaded(ALConstants.BATTLEGEAR);
        isDynamicLightsLoaded = Loader.isModLoaded(ALConstants.DYNAMIC_LIGHTS);

        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        ModConfig.load(config);

        if (config.hasChanged()) {
            config.save();
        }

        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        FiskUtils.hook(Hook.INIT);
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        FiskUtils.hook(Hook.POSTINIT);

        for (String itemName : denyAnimationslist) {
            String modId;
            String itemNameOnly;

            String[] parts = itemName.split(":");
            if (parts.length >= 2) {
                modId = parts[0];
                itemNameOnly = parts[1];

                Item item = GameRegistry.findItem(modId, itemNameOnly);
                if (item != null) {
                    ItemsRegistry.ItemWM excludedItem = new ItemsRegistry.ItemWM(item);
                    ItemsRegistry.excludedItems.add(excludedItem);
                    // logger.info("Added excluded item: " + excludedItem);
                } else {
                    logger.error(
                        modId + ":"
                            + itemNameOnly
                            + " in denyAnimationslist == null (not found), check if the "
                            + modId
                            + " is present in the current instance");
                }
            }
        }
    }

    @EventHandler
    public void serverStart(FMLServerStartingEvent event) {
        event.registerServerCommand(new CommandForce());
    }
}
