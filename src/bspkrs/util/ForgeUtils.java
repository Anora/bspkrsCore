package bspkrs.util;

import net.minecraftforge.common.ForgeVersion;

@Deprecated
public final class ForgeUtils
{
    public static boolean isForgeEnv()
    {
        try
        {
            ForgeVersion.getVersion();
            return true;
        }
        catch (Throwable e)
        {
            return false;
        }
    }
}
