package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class ay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final cy f19073a = ot0.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f19074b = 0;

    public static FloatBuffer a(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void a() {
        int i10 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            StringBuilder sbA = v60.a("glError: ");
            sbA.append(GLU.gluErrorString(iGlGetError));
            p90.b("GlUtil", sbA.toString());
            i10 = iGlGetError;
        }
        if (i10 != 0) {
            StringBuilder sbA2 = v60.a("glError: ");
            sbA2.append(GLU.gluErrorString(i10));
            p90.b("GlUtil", sbA2.toString());
        }
    }

    public static void a(String str) {
        p90.b("GlUtil", str);
    }

    public static boolean a(Context context) {
        String strEglQueryString;
        int i10 = da1.f19803a;
        if (i10 < 24) {
            return false;
        }
        if (i10 < 26) {
            cy cyVar = f19073a;
            if (cyVar.a().equals(da1.f19805c) || cyVar.b().equals(da1.f19806d)) {
                return false;
            }
        }
        return (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content");
    }

    public static int b() {
        if (!(!da1.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT))) {
            p90.b("GlUtil", "No current context");
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        a();
        int i10 = iArr[0];
        GLES20.glBindTexture(36197, i10);
        a();
        GLES20.glTexParameteri(36197, 10240, 9729);
        a();
        GLES20.glTexParameteri(36197, 10241, 9729);
        a();
        GLES20.glTexParameteri(36197, 10242, 33071);
        a();
        GLES20.glTexParameteri(36197, 10243, 33071);
        a();
        return i10;
    }

    public static boolean c() {
        String strEglQueryString;
        return da1.f19803a >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_KHR_surfaceless_context");
    }
}
