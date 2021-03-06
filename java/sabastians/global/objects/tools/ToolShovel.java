package sabastians.global.objects.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import sabastians.global.Main;
import sabastians.global.init.ItemInit;
import sabastians.global.util.interfaces.IHasModel;

public class ToolShovel extends ItemSpade implements IHasModel {
	
	public ToolShovel(String name, ToolMaterial material) {
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}