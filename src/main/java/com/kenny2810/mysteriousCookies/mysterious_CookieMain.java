package com.kenny2810.mysteriousCookies;

// This Import list will grow longer with each additional tutorial.
// It's not pruned between full class postings, unlike other tutorial code.
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid="mysteriouscookies", name="Mysterious Cookies", version="1.0.0")
public class mysterious_CookieMain 
{
private static final String MODID = "mysteriousCookies";


//Declaration of variables	
	//Registering Crackers
	public static Item MysteriousCookies = new mysterious_Cookie(2, false);


        @Instance(value="mysteriousCookies")
        public static mysterious_CookieMain instance;
        
        @SidedProxy(clientSide="com.kenny2810.mysteriousCookies.Client.ClientProxy",
                        serverSide="com.kenny2810.mysteriousCookies.CommonProxy")
        public static CommonProxy proxy;
        
  
        
        @EventHandler
        	
        	public void preInit(FMLPreInitializationEvent event) {
        	// Initialising Crackers
        	MysteriousCookies = new mysterious_Cookie(2, false).setUnlocalizedName("Mysterious Cookie").setTextureName(mysterious_CookieMain.MODID+":"+"mysteriousCookie");
        	
            
        }
        
        @EventHandler
        public void load(FMLInitializationEvent event) 
        {
        	//Registering Blocks
        	
       	
            //Registering Crackers
        	GameRegistry.registerItem(MysteriousCookies, "Mysterious Cookie");
        	
                
                proxy.registerRenderers();
        }
        @EventHandler
        public void postInit(FMLPreInitializationEvent e) 
        {
        }
        
        
     
      
    }

    
   