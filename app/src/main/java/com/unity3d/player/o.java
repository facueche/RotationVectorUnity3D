package com.unity3d.player;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

public final class o
{
  private final Bundle a;
  
  public o(Activity paramActivity)
  {
    localBundle = Bundle.EMPTY;
    Object localObject = paramActivity.getPackageManager();
    localComponentName = paramActivity.getComponentName();
    try
    {
      localObject = ((PackageManager)localObject).getActivityInfo(localComponentName, 128);
      paramActivity = localBundle;
      if (localObject != null)
      {
        paramActivity = localBundle;
        if (((ActivityInfo)localObject).metaData != null) {
          paramActivity = ((ActivityInfo)localObject).metaData;
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramActivity)
    {
      for (;;)
      {
        m.Log(6, "Unable to retreive meta data for activity '" + localComponentName + "'");
        paramActivity = localBundle;
      }
    }
    this.a = new Bundle(paramActivity);
  }
  
  private static String a(String paramString)
  {
    return String.format("%s.%s", new Object[] { "unityplayer", paramString });
  }
  
  public final boolean a()
  {
    return this.a.getBoolean(a("ForwardNativeEventsToDalvik"));
  }
}


/* Location:              C:\Users\facu\Desktop\dex2jar-2.0\classes-dex2jar.jar!\com\unity3d\player\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */