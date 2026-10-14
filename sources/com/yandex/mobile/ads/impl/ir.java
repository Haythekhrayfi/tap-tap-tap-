package com.yandex.mobile.ads.impl;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ir implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f21794h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f21795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f21796c = new int[1];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EGLDisplay f21797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EGLContext f21798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EGLSurface f21799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SurfaceTexture f21800g;

    public static final class a extends RuntimeException {
        private a(String str) {
            super(str);
        }

        public /* synthetic */ a(String str, int i10) {
            this(str);
        }
    }

    public ir(Handler handler) {
        this.f21795b = handler;
    }

    public final SurfaceTexture a() {
        SurfaceTexture surfaceTexture = this.f21800g;
        Objects.requireNonNull(surfaceTexture);
        return surfaceTexture;
    }

    public final void a(int i10) {
        EGLConfig eGLConfig;
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        int i11 = 0;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == null) {
            throw new a("eglGetDisplay failed", i11);
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            throw new a("eglInitialize failed", i11);
        }
        this.f21797d = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, f21794h, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (!zEglChooseConfig || iArr2[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
            int i12 = da1.f19803a;
            throw new a(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), i11);
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f21797d, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eGLContextEglCreateContext == null) {
            throw new a("eglCreateContext failed", i11);
        }
        this.f21798e = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = this.f21797d;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null) {
                throw new a("eglCreatePbufferSurface failed", i11);
            }
        }
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
            throw new a("eglMakeCurrent failed", i11);
        }
        this.f21799f = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, this.f21796c, 0);
        ay.a();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f21796c[0]);
        this.f21800g = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.f21795b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f21800g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f21796c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f21797d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f21797d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f21799f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f21797d, this.f21799f);
            }
            EGLContext eGLContext = this.f21798e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f21797d, eGLContext);
            }
            if (da1.f19803a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f21797d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f21797d);
            }
            this.f21797d = null;
            this.f21798e = null;
            this.f21799f = null;
            this.f21800g = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f21795b.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f21800g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
