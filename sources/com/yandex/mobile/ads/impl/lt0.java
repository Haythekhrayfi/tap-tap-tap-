package com.yandex.mobile.ads.impl;

import android.opengl.GLES20;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class lt0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float[] f22779i = {1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, -1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f, 1.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f22780j = {1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, -0.5f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float[] f22781k = {0.5f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, -1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f22783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private zx f22784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22789h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f22790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final FloatBuffer f22791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final FloatBuffer f22792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f22793d;

        public a(jt0.b bVar) {
            this.f22790a = bVar.a();
            this.f22791b = ay.a(bVar.f22150c);
            this.f22792c = ay.a(bVar.f22151d);
            int i10 = bVar.f22149b;
            this.f22793d = i10 != 1 ? i10 != 2 ? 4 : 6 : 5;
        }
    }

    public final void a() {
        zx zxVar = new zx();
        this.f22784c = zxVar;
        this.f22785d = zxVar.b("uMvpMatrix");
        this.f22786e = this.f22784c.b("uTexMatrix");
        this.f22787f = this.f22784c.a("aPosition");
        this.f22788g = this.f22784c.a("aTexCoords");
        this.f22789h = this.f22784c.b("uTexture");
    }

    public final void a(int i10, float[] fArr) {
        float[] fArr2;
        a aVar = this.f22783b;
        if (aVar == null) {
            return;
        }
        int i11 = this.f22782a;
        if (i11 == 1) {
            fArr2 = f22780j;
        } else {
            fArr2 = i11 == 2 ? f22781k : f22779i;
        }
        GLES20.glUniformMatrix3fv(this.f22786e, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f22785d, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f22789h, 0);
        ay.a();
        GLES20.glVertexAttribPointer(this.f22787f, 3, 5126, false, 12, (Buffer) aVar.f22791b);
        ay.a();
        GLES20.glVertexAttribPointer(this.f22788g, 2, 5126, false, 8, (Buffer) aVar.f22792c);
        ay.a();
        GLES20.glDrawArrays(aVar.f22793d, 0, aVar.f22790a);
        ay.a();
    }

    public final void a(jt0 jt0Var) {
        jt0.a aVar = jt0Var.f22143a;
        jt0.a aVar2 = jt0Var.f22144b;
        if (aVar.b() == 1 && aVar.a().f22148a == 0 && aVar2.b() == 1 && aVar2.a().f22148a == 0) {
            this.f22782a = jt0Var.f22145c;
            this.f22783b = new a(jt0Var.f22143a.a());
            if (jt0Var.f22146d) {
                return;
            }
            new a(jt0Var.f22144b.a());
        }
    }
}
