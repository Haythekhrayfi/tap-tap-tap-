package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes3.dex */
public final class w31 extends GLSurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f26152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SensorManager f26153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Sensor f26154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dp0 f26155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f26156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final hz0 f26157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SurfaceTexture f26158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Surface f26159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f26160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f26161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f26162k;

    public final class a implements GLSurfaceView.Renderer, c71.a, dp0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final hz0 f26163a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float[] f26166d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float[] f26167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float[] f26168f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f26169g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f26170h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float[] f26164b = new float[16];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float[] f26165c = new float[16];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float[] f26171i = new float[16];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float[] f26172j = new float[16];

        public a(hz0 hz0Var) {
            float[] fArr = new float[16];
            this.f26166d = fArr;
            float[] fArr2 = new float[16];
            this.f26167e = fArr2;
            float[] fArr3 = new float[16];
            this.f26168f = fArr3;
            this.f26163a = hz0Var;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f26170h = 3.1415927f;
        }

        public final synchronized void a(PointF pointF) {
            float f10 = pointF.y;
            this.f26169g = f10;
            Matrix.setRotateM(this.f26167e, 0, -f10, (float) Math.cos(this.f26170h), (float) Math.sin(this.f26170h), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            Matrix.setRotateM(this.f26168f, 0, -pointF.x, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }

        @Override // com.yandex.mobile.ads.impl.dp0.a
        public final synchronized void a(float[] fArr, float f10) {
            float[] fArr2 = this.f26166d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f11 = -f10;
            this.f26170h = f11;
            Matrix.setRotateM(this.f26167e, 0, -this.f26169g, (float) Math.cos(f11), (float) Math.sin(this.f26170h), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f26172j, 0, this.f26166d, 0, this.f26168f, 0);
                Matrix.multiplyMM(this.f26171i, 0, this.f26167e, 0, this.f26172j, 0);
            }
            Matrix.multiplyMM(this.f26165c, 0, this.f26164b, 0, this.f26171i, 0);
            this.f26163a.a(this.f26165c);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f26164b, 0, f10 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f10))) * 2.0d) : 90.0f, f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            w31.this.b(this.f26163a.a());
        }
    }

    public interface b {
        void a(Surface surface);

        void b();
    }

    public w31(Context context) {
        this(context, null);
    }

    public w31(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26152a = new CopyOnWriteArrayList<>();
        this.f26156e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) pa.a(context.getSystemService("sensor"));
        this.f26153b = sensorManager;
        Sensor defaultSensor = da1.f19803a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f26154c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        hz0 hz0Var = new hz0();
        this.f26157f = hz0Var;
        a aVar = new a(hz0Var);
        View.OnTouchListener c71Var = new c71(context, aVar);
        this.f26155d = new dp0(((WindowManager) pa.a((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), c71Var, aVar);
        this.f26160i = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(c71Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f26158g;
        Surface surface = this.f26159h;
        Surface surface2 = new Surface(surfaceTexture);
        this.f26158g = surfaceTexture;
        this.f26159h = surface2;
        Iterator<b> it = this.f26152a.iterator();
        while (it.hasNext()) {
            it.next().a(surface2);
        }
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(SurfaceTexture surfaceTexture) {
        this.f26156e.post(new do1(this, surfaceTexture));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Surface surface = this.f26159h;
        if (surface != null) {
            Iterator<b> it = this.f26152a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
        SurfaceTexture surfaceTexture = this.f26158g;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
        this.f26158g = null;
        this.f26159h = null;
    }

    private void d() {
        boolean z10 = this.f26160i && this.f26161j;
        Sensor sensor = this.f26154c;
        if (sensor == null || z10 == this.f26162k) {
            return;
        }
        if (z10) {
            this.f26153b.registerListener(this.f26155d, sensor, 0);
        } else {
            this.f26153b.unregisterListener(this.f26155d);
        }
        this.f26162k = z10;
    }

    public final eh a() {
        return this.f26157f;
    }

    public final xe1 b() {
        return this.f26157f;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26156e.post(new pp1(this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f26161j = false;
        d();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f26161j = true;
        d();
    }

    public void setDefaultStereoMode(int i10) {
        this.f26157f.a(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f26160i = z10;
        d();
    }
}
