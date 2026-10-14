package com.applovin.exoplayer2.m.a;

import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.view.Surface;
import com.applovin.exoplayer2.m.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i extends GLSurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f7749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SensorManager f7750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Sensor f7751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f7752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f7753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f7754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SurfaceTexture f7755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Surface f7756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f7757i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f7758j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f7759k;

    public interface a {
        void a(Surface surface);
    }

    private void a() {
        boolean z10 = this.f7757i && this.f7758j;
        Sensor sensor = this.f7751c;
        if (sensor == null || z10 == this.f7759k) {
            return;
        }
        if (z10) {
            this.f7750b.registerListener(this.f7752d, sensor, 0);
        } else {
            this.f7750b.unregisterListener(this.f7752d);
        }
        this.f7759k = z10;
    }

    private static void a(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        Surface surface = this.f7756h;
        if (surface != null) {
            Iterator<a> it = this.f7749a.iterator();
            while (it.hasNext()) {
                it.next().a(surface);
            }
        }
        a(this.f7755g, surface);
        this.f7755g = null;
        this.f7756h = null;
    }

    public void a(a aVar) {
        this.f7749a.add(aVar);
    }

    public void b(a aVar) {
        this.f7749a.remove(aVar);
    }

    public com.applovin.exoplayer2.m.a.a getCameraMotionListener() {
        return this.f7754f;
    }

    public l getVideoFrameMetadataListener() {
        return this.f7754f;
    }

    public Surface getVideoSurface() {
        return this.f7756h;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7753e.post(new androidx.activity.c(this));
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f7758j = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f7758j = true;
        a();
    }

    public void setDefaultStereoMode(int i10) {
        this.f7754f.a(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f7757i = z10;
        a();
    }
}
