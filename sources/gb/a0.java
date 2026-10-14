package gb;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f30179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f30180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f30181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f30182d;

    public interface a {
        void a();
    }

    public static final class b implements SensorEventListener {
        public b() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
            j0.i(sensor, "sensor");
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            a aVar;
            j0.i(sensorEvent, "event");
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            a0 a0Var = a0.this;
            a0Var.f30181c = a0Var.f30180b;
            a0Var.f30180b = (float) Math.sqrt((f12 * f12) + (f11 * f11) + (f10 * f10));
            a0 a0Var2 = a0.this;
            float f13 = (a0Var2.f30179a * 0.9f) + (a0Var2.f30180b - a0Var2.f30181c);
            a0Var2.f30179a = f13;
            if (f13 <= 20.0f || (aVar = a0Var2.f30182d) == null) {
                return;
            }
            aVar.a();
        }
    }

    public a0(Context context) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        b bVar = new b();
        Object systemService = context.getSystemService("sensor");
        j0.g(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        sensorManager.registerListener(bVar, sensorManager.getDefaultSensor(1), 3);
        this.f30180b = 9.80665f;
        this.f30181c = 9.80665f;
    }
}
