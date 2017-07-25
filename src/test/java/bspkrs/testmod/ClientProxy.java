package bspkrs.testmod;

import net.minecraftforge.fml.common.FMLCommonHandler;

@SuppressWarnings("deprecation")
public class ClientProxy extends CommonProxy
{
    @Deprecated
    protected void registerTickHandler()
    {
        if (!TMTicker.isRegistered())
            FMLCommonHandler.instance().bus().register(new TMTicker());
    }
}
