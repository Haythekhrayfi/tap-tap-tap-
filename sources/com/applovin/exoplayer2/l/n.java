package com.applovin.exoplayer2.l;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f7637a;

    public static final class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static int a(String str, String str2) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        b();
        a(35633, str, iGlCreateProgram);
        a(35632, str2, iGlCreateProgram);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            StringBuilder sbA = defpackage.a.a("Unable to link shader program: \n");
            sbA.append(GLES20.glGetProgramInfoLog(iGlCreateProgram));
            a(sbA.toString());
        }
        b();
        return iGlCreateProgram;
    }

    public static FloatBuffer a(int i10) {
        return ByteBuffer.allocateDirect(i10 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static FloatBuffer a(float[] fArr) {
        return (FloatBuffer) a(fArr.length).put(fArr).flip();
    }

    private static void a(int i10, String str, int i11) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            a(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str);
        }
        GLES20.glAttachShader(i11, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        b();
    }

    private static void a(String str) {
        q.d("GlUtil", str);
        if (f7637a) {
            throw new a(str);
        }
    }

    public static boolean a() {
        String strEglQueryString;
        return ai.f7595a >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    public static boolean a(Context context) {
        String strEglQueryString;
        int i10 = ai.f7595a;
        if (i10 < 24) {
            return false;
        }
        if (i10 >= 26 || !("samsung".equals(ai.f7597c) || "XT1650".equals(ai.f7598d))) {
            return (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    public static void b() {
        int i10 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            StringBuilder sbA = defpackage.a.a("glError ");
            sbA.append(GLU.gluErrorString(iGlGetError));
            q.d("GlUtil", sbA.toString());
            i10 = iGlGetError;
        }
        if (i10 != 0) {
            StringBuilder sbA2 = defpackage.a.a("glError ");
            sbA2.append(GLU.gluErrorString(i10));
            a(sbA2.toString());
        }
    }
}
