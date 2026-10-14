package com.applovin.exoplayer2.l;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class j implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f7626a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f7627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f7628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f7629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EGLDisplay f7630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EGLContext f7631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private EGLSurface f7632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SurfaceTexture f7633h;

    public static final class a extends RuntimeException {
        private a(String str) {
            super(str);
        }
    }

    public interface b {
        void a();
    }

    public j(Handler handler) {
        this(handler, null);
    }

    public j(Handler handler, b bVar) {
        this.f7627b = handler;
        this.f7629d = bVar;
        this.f7628c = new int[1];
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f7626a, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!zEglChooseConfig || iArr[0] <= 0 || eGLConfigArr[0] == null) {
            throw new a(ai.a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfigArr[0];
    }

    private static EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eGLContextEglCreateContext != null) {
            return eGLContextEglCreateContext;
        }
        throw new a("eglCreateContext failed");
    }

    private static EGLSurface a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null) {
                throw new a("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext)) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new a("eglMakeCurrent failed");
    }

    private static void a(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        n.b();
    }

    private void c() {
        b bVar = this.f7629d;
        if (bVar != null) {
            bVar.a();
        }
    }

    private static EGLDisplay d() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == null) {
            throw new a("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        throw new a("eglInitialize failed");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a() {
        this.f7627b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f7633h;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f7628c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f7630e;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f7630e;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f7632g;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f7630e, this.f7632g);
            }
            EGLContext eGLContext = this.f7631f;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f7630e, eGLContext);
            }
            if (ai.f7595a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f7630e;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f7630e);
            }
            this.f7630e = null;
            this.f7631f = null;
            this.f7632g = null;
            this.f7633h = null;
        }
    }

    public void a(int i10) {
        EGLDisplay eGLDisplayD = d();
        this.f7630e = eGLDisplayD;
        EGLConfig eGLConfigA = a(eGLDisplayD);
        EGLContext eGLContextA = a(this.f7630e, eGLConfigA, i10);
        this.f7631f = eGLContextA;
        this.f7632g = a(this.f7630e, eGLConfigA, eGLContextA, i10);
        a(this.f7628c);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f7628c[0]);
        this.f7633h = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public SurfaceTexture b() {
        return (SurfaceTexture) com.applovin.exoplayer2.l.a.b(this.f7633h);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f7627b.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        c();
        SurfaceTexture surfaceTexture = this.f7633h;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
