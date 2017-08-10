package com.unity3d.player;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class UnityPlayerProxyActivity
  extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = new Intent(this, UnityPlayerActivity.class);
    paramBundle.addFlags(65536);
    Bundle localBundle = getIntent().getExtras();
    if (localBundle != null) {
      paramBundle.putExtras(localBundle);
    }
    startActivity(paramBundle);
  }
}


/* Location:              C:\Users\facu\Desktop\dex2jar-2.0\classes-dex2jar.jar!\com\unity3d\player\UnityPlayerProxyActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */