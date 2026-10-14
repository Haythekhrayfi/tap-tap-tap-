package com.facebook.ads.internal.exoplayer2.thirdparty.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.redexgen.X.C0930Hv;
import com.facebook.ads.redexgen.X.HG;
import com.facebook.ads.redexgen.X.I1;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DummySurface extends Surface {
    public static int A03;
    public static boolean A04;
    public static byte[] A05;
    public boolean A00;
    public final boolean A01;
    public final I1 A02;

    static {
        A04();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{75, 73, 66, 81, 75, 86, 90, 81, 126, 124, 97, 122, 107, 109, 122, 107, 106, 81, 109, 97, 96, 122, 107, 96, 122, 9, 11, 0, 19, 7, 4, Ascii.RS, 19, 63, 57, 62, 42, 45, 47, 41, 32, 41, 63, 63, 19, 47, 35, 34, 56, 41, 52, 56, 46, 21, 8, 14, 11, 11, 20, 9, 15, Ascii.RS, Ascii.US, 91, 11, 9, 18, 20, 9, 91, 15, 20, 91, 58, 43, 50, 91, 23, Ascii.RS, 13, Ascii.RS, 23, 91, 74, 76, 51, 63, 90, 93, 94, 91, 19, Ascii.FS, 22, 0, Ascii.GS, Ascii.ESC, 22, 92, Ascii.SUB, 19, 0, 22, 5, 19, 0, 23, 92, 4, 0, 92, Ascii.SUB, Ascii.ESC, 21, Ascii.SUB, 45, 2, 23, 0, 20, Ascii.GS, 0, Ascii.US, 19, Ascii.FS, 17, 23, 117, 103, 107, 117, 115, 104, 97};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static synchronized boolean A05(Context context) {
        boolean z10;
        z10 = true;
        if (!A04) {
            A03 = C0930Hv.A02 < 24 ? 0 : A00(context);
            A04 = true;
        }
        if (A03 == 0) {
            z10 = false;
        }
        return z10;
    }

    public DummySurface(I1 i10, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.A02 = i10;
        this.A01 = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        if (A02(85, 6, 120).equals(com.facebook.ads.redexgen.X.C0930Hv.A06) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(android.content.Context r6) {
        /*
            int r0 = com.facebook.ads.redexgen.X.C0930Hv.A02
            r5 = 26
            r4 = 0
            if (r0 >= r5) goto L2a
            java.lang.String r3 = com.facebook.ads.redexgen.X.C0930Hv.A05
            r2 = 127(0x7f, float:1.78E-43)
            r1 = 7
            r0 = 21
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L29
            java.lang.String r3 = com.facebook.ads.redexgen.X.C0930Hv.A06
            r2 = 85
            r1 = 6
            r0 = 120(0x78, float:1.68E-43)
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L2a
        L29:
            return r4
        L2a:
            int r0 = com.facebook.ads.redexgen.X.C0930Hv.A02
            if (r0 >= r5) goto L43
            android.content.pm.PackageManager r3 = r6.getPackageManager()
            r2 = 91
            r1 = 36
            r0 = 97
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r3.hasSystemFeature(r0)
            if (r0 != 0) goto L43
            return r4
        L43:
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.eglGetDisplay(r4)
            r0 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r3 = android.opengl.EGL14.eglQueryString(r1, r0)
            if (r3 != 0) goto L50
            return r4
        L50:
            r2 = 0
            r1 = 25
            r0 = 29
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L60
            return r4
        L60:
            r2 = 25
            r1 = 27
            r0 = 95
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L72
            r0 = 1
        L71:
            return r0
        L72:
            r0 = 2
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface.A00(android.content.Context):int");
    }

    public static DummySurface A01(Context context, boolean z10) {
        A03();
        HG.A04(!z10 || A05(context));
        return new I1().A04(z10 ? A03 : 0);
    }

    public static void A03() {
        if (C0930Hv.A02 >= 17) {
        } else {
            throw new UnsupportedOperationException(A02(52, 33, 104));
        }
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.A02) {
            if (!this.A00) {
                this.A02.A05();
                this.A00 = true;
            }
        }
    }
}
