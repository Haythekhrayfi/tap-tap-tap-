package com.applovin.exoplayer2.m;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class i extends GLSurfaceView implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f7828a;

    public static final class a implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final float[] f7829a = {1.164f, 1.164f, 1.164f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, -0.392f, 2.017f, 1.596f, -0.813f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final float[] f7830b = {1.164f, 1.164f, 1.164f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, -0.213f, 2.112f, 1.793f, -0.533f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final float[] f7831c = {1.168f, 1.168f, 1.168f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, -0.188f, 2.148f, 1.683f, -0.652f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String[] f7832d = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final FloatBuffer f7833e = com.applovin.exoplayer2.l.n.a(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final GLSurfaceView f7834f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int[] f7835g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int[] f7836h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int[] f7837i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int[] f7838j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final AtomicReference<j> f7839k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final FloatBuffer[] f7840l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f7841m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f7842n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private j f7843o;

        private void a() {
            GLES20.glGenTextures(3, this.f7835g, 0);
            for (int i10 = 0; i10 < 3; i10++) {
                GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f7841m, f7832d[i10]), i10);
                GLES20.glActiveTexture(33984 + i10);
                GLES20.glBindTexture(3553, this.f7835g[i10]);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
            }
            com.applovin.exoplayer2.l.n.b();
        }

        public void a(j jVar) {
            j andSet = this.f7839k.getAndSet(jVar);
            if (andSet != null) {
                andSet.f();
            }
            this.f7834f.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            j andSet = this.f7839k.getAndSet(null);
            if (andSet == null && this.f7843o == null) {
                return;
            }
            if (andSet != null) {
                j jVar = this.f7843o;
                if (jVar != null) {
                    jVar.f();
                }
                this.f7843o = andSet;
            }
            j jVar2 = (j) com.applovin.exoplayer2.l.a.b(this.f7843o);
            float[] fArr = f7830b;
            int i10 = jVar2.f7848g;
            if (i10 == 1) {
                fArr = f7829a;
            } else if (i10 == 3) {
                fArr = f7831c;
            }
            GLES20.glUniformMatrix3fv(this.f7842n, 1, false, fArr, 0);
            int[] iArr = (int[]) com.applovin.exoplayer2.l.a.b(jVar2.f7847f);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) com.applovin.exoplayer2.l.a.b(jVar2.f7846e);
            int i11 = 0;
            while (i11 < 3) {
                int i12 = i11 == 0 ? jVar2.f7845d : (jVar2.f7845d + 1) / 2;
                GLES20.glActiveTexture(33984 + i11);
                GLES20.glBindTexture(3553, this.f7835g[i11]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i11], i12, 0, 6409, 5121, byteBufferArr[i11]);
                i11++;
            }
            int i13 = (iArr[0] + 1) / 2;
            int[] iArr2 = {jVar2.f7844c, i13, i13};
            for (int i14 = 0; i14 < 3; i14++) {
                if (this.f7837i[i14] != iArr2[i14] || this.f7838j[i14] != iArr[i14]) {
                    com.applovin.exoplayer2.l.a.b(iArr[i14] != 0);
                    float f10 = iArr2[i14] / iArr[i14];
                    this.f7840l[i14] = com.applovin.exoplayer2.l.n.a(new float[]{StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f, f10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f10, 1.0f});
                    GLES20.glVertexAttribPointer(this.f7836h[i14], 2, 5126, false, 0, (Buffer) this.f7840l[i14]);
                    this.f7837i[i14] = iArr2[i14];
                    this.f7838j[i14] = iArr[i14];
                }
            }
            GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
            GLES20.glDrawArrays(5, 0, 4);
            com.applovin.exoplayer2.l.n.b();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int iA = com.applovin.exoplayer2.l.n.a("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f7841m = iA;
            GLES20.glUseProgram(iA);
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f7841m, "in_pos");
            GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
            GLES20.glVertexAttribPointer(iGlGetAttribLocation, 2, 5126, false, 0, (Buffer) f7833e);
            this.f7836h[0] = GLES20.glGetAttribLocation(this.f7841m, "in_tc_y");
            GLES20.glEnableVertexAttribArray(this.f7836h[0]);
            this.f7836h[1] = GLES20.glGetAttribLocation(this.f7841m, "in_tc_u");
            GLES20.glEnableVertexAttribArray(this.f7836h[1]);
            this.f7836h[2] = GLES20.glGetAttribLocation(this.f7841m, "in_tc_v");
            GLES20.glEnableVertexAttribArray(this.f7836h[2]);
            com.applovin.exoplayer2.l.n.b();
            this.f7842n = GLES20.glGetUniformLocation(this.f7841m, "mColorConversion");
            com.applovin.exoplayer2.l.n.b();
            a();
            com.applovin.exoplayer2.l.n.b();
        }
    }

    @Deprecated
    public k getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(j jVar) {
        this.f7828a.a(jVar);
    }
}
