package com.unity3d.player;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;

public final class d
  implements f
{
  private static final SurfaceTexture a = new SurfaceTexture(-1);
  private static final int b;
  private volatile boolean c;
  
  static
  {
    if (q.f) {}
    for (int i = 5894;; i = 1)
    {
      b = i;
      return;
    }
  }
  
  private void a(final View paramView, int paramInt)
  {
    Handler localHandler = paramView.getHandler();
    if (localHandler == null)
    {
      a(paramView, this.c);
      return;
    }
    localHandler.postDelayed(new Runnable()
    {
      public final void run()
      {
        d.this.a(paramView, d.a(d.this));
      }
    }, 1000L);
  }
  
  public final void a(final View paramView)
  {
    if (q.g) {
      return;
    }
    paramView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener()
    {
      public final void onSystemUiVisibilityChange(int paramAnonymousInt)
      {
        d.a(d.this, paramView);
      }
    });
  }
  
  public final void a(View paramView, boolean paramBoolean)
  {
    this.c = paramBoolean;
    if (this.c) {}
    for (int i = paramView.getSystemUiVisibility() | b;; i = paramView.getSystemUiVisibility() & (b ^ 0xFFFFFFFF))
    {
      paramView.setSystemUiVisibility(i);
      return;
    }
  }
  
  public final boolean a(Camera paramCamera)
  {
    try
    {
      paramCamera.setPreviewTexture(a);
      return true;
    }
    catch (Exception paramCamera) {}
    return false;
  }
  
  public final void b(View paramView)
  {
    if ((!q.f) && (this.c))
    {
      a(paramView, false);
      this.c = true;
    }
    a(paramView, 1000);
  }
}


/* Location:              C:\Users\facu\Desktop\dex2jar-2.0\classes-dex2jar.jar!\com\unity3d\player\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */