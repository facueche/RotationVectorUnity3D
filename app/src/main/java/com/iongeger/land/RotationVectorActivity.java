package com.iongeger.land;

import com.unity3d.player.UnityPlayerActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Config;
import android.util.Log;
import android.app.Activity;

public class RotationVectorActivity extends UnityPlayerActivity {
    private static final String TAG = "Rotation Vector";

    private SensorManager mSensorManager;
    private Sensor mSensor;

    static public float xmag;
    static public float ymag;
    static public float zmag;
    static public float wmag;

    private final SensorEventListener mListener = new SensorEventListener() {
        public void onSensorChanged(SensorEvent event) {
            if (Config.DEBUG) Log.d(TAG,
                    "sensorChanged (" + event.values[0] + ", " + event.values[1] + ", " + event.values[2] + ", " + event.values[3] + ")");

            xmag = event.values[0];
            ymag = event.values[1];
            zmag = event.values[2];
            wmag = event.values[3];
        }

        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }
    };

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        mSensorManager = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
        mSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR);
    }

    @Override
    protected void onResume()
    {
        if (Config.DEBUG) Log.d(TAG, "onResume");
        super.onResume();

        mSensorManager.registerListener(mListener, mSensor,
                SensorManager.SENSOR_DELAY_GAME);
    }

    @Override
    protected void onStop()
    {
        if (Config.DEBUG) Log.d(TAG, "onStop");
        mSensorManager.unregisterListener(mListener);
        super.onStop();
    }

    public static float getX() {
        return xmag;
    }

    public static float getY() {
        return ymag;
    }

    public static float getZ() {
        return zmag;
    }

    public static float getW() {
        return wmag;
    }
}