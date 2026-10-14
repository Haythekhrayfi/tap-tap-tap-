package com.yandex.mobile.ads.impl;

import android.opengl.GLES20;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a[] f27436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b[] f27437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f27438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f27439e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27440a;

        private a(String str) {
            this.f27440a = str;
        }

        public static a a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr, 0);
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveAttrib(i10, i11, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            for (int i13 = 0; i13 < i12; i13++) {
                if (bArr[i13] == 0) {
                    i12 = i13;
                    break;
                }
            }
            String str = new String(bArr, 0, i12);
            GLES20.glGetAttribLocation(i10, str);
            return new a(str);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27441a;

        private b(String str) {
            this.f27441a = str;
        }

        public static b a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr, 0);
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveUniform(i10, i11, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            for (int i13 = 0; i13 < i12; i13++) {
                if (bArr[i13] == 0) {
                    i12 = i13;
                    break;
                }
            }
            String str = new String(bArr, 0, i12);
            GLES20.glGetUniformLocation(i10, str);
            return new b(str);
        }
    }

    public zx() {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f27435a = iGlCreateProgram;
        ay.a();
        a(iGlCreateProgram, 35633, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n");
        a(iGlCreateProgram, 35632, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            StringBuilder sbA = v60.a("Unable to link shader program: \n");
            sbA.append(GLES20.glGetProgramInfoLog(iGlCreateProgram));
            ay.a(sbA.toString());
        }
        GLES20.glUseProgram(iGlCreateProgram);
        this.f27438d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f27436b = new a[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            a aVarA = a.a(this.f27435a, i10);
            this.f27436b[i10] = aVarA;
            this.f27438d.put(aVarA.f27440a, aVarA);
        }
        this.f27439e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f27435a, 35718, iArr3, 0);
        this.f27437c = new b[iArr3[0]];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            b bVarA = b.a(this.f27435a, i11);
            this.f27437c[i11] = bVarA;
            this.f27439e.put(bVarA.f27441a, bVarA);
        }
        ay.a();
    }

    private static void a(int i10, int i11, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String str2 = GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str;
            int i12 = ay.f19074b;
            p90.b("GlUtil", str2);
        }
        GLES20.glAttachShader(i10, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        ay.a();
    }

    public final int a(String str) {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f27435a, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        ay.a();
        return iGlGetAttribLocation;
    }

    public final int b(String str) {
        return GLES20.glGetUniformLocation(this.f27435a, str);
    }
}
