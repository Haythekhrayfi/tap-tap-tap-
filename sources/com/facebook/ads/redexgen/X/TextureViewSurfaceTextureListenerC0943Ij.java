package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TextureViewSurfaceTextureListenerC0943Ij extends TextureView implements TextureView.SurfaceTextureListener, Q6, QM, Q8 {
    public static byte[] A0N;
    public static String[] A0O = {"5i34yksohRV8hSvEB2dTOBGqhO", "V2RNkeamXobpzSRVkM4sjlG", "1HR", "8SLqGCa2wxiVkGjIaPVK9LXerY", "SSmTkZgpl4jZsKBndOsNgmbhAq5FKejN", "hgMiihLf1lx1lIiVFZ8jC", "euSTtDnbG06q2RqThlQcyR1Es6oMHQDw", "iHXqYQoKvaPWKvo"};
    public static final String A0P;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public Uri A06;
    public Surface A07;
    public View A08;
    public MediaController A09;
    public C1337Xw A0A;
    public PZ A0B;
    public Q9 A0C;
    public QO A0D;
    public QO A0E;
    public QP A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0N, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0N = new byte[]{86, 126, 126, 118, 125, 116, 49, 112, 125, 102, 112, 104, 98, 49, 101, 121, 99, 126, 102, 49, 112, Ascii.DEL, 49, 116, 105, 114, 116, 97, 101, 120, 126, Ascii.DEL, 49, 102, 120, 101, 121, 49, 98, 116, 101, 83, 112, 114, 122, 118, 99, 126, 100, Ascii.DEL, 117, 85, 99, 112, 102, 112, 115, 125, 116, 49, 126, Ascii.DEL, 49, 95, 126, 100, 118, 112, 101, 49, 112, 115, 126, 103, 116, 63, 49, 98, 126, 49, 102, 116, 49, 98, 120, 125, 116, Ascii.DEL, 101, 125, 104, 49, 120, 118, Ascii.DEL, 126, 99, 116, 49, 120, 101, 63, 76, 100, 100, 108, 103, 110, 43, 106, 103, 124, 106, 114, 120, 43, Ascii.DEL, 99, 121, 100, 124, 43, 106, 101, 43, 110, 115, 104, 110, 123, Ascii.DEL, 98, 100, 101, 43, 124, 98, Ascii.DEL, 99, 43, 120, 110, Ascii.DEL, 77, 100, 121, 110, 108, 121, 100, 126, 101, 111, 43, 100, 101, 43, 69, 100, 126, 108, 106, Ascii.DEL, 43, 106, 105, 100, 125, 110, 37, 43, 120, 100, 43, 124, 110, 43, 120, 98, 103, 110, 101, Ascii.DEL, 103, 114, 43, 98, 108, 101, 100, 121, 110, 43, 98, Ascii.DEL, 37, 33, Ascii.RS, 19, 18, Ascii.CAN, 87, 4, 3, 22, 3, 18, 87, 20, Ascii.US, 22, Ascii.EM, 16, 18, 19, 87, 3, Ascii.CAN, 87, 95, 93, 86, 93, 74, 81, 91};
        String[] strArr = A0O;
        if (strArr[4].charAt(4) == strArr[6].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0O;
        strArr2[3] = "4Rjqxy3w03hT2rk3wOaPN94qCv";
        strArr2[0] = "J56YrdEaTg6GnpCj3tljjm9xxp";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (IN.A1X(this.A0A) && this.A0D != QO.A08) {
            long currentPosition = getCurrentPosition();
            long currentPosition2 = getCurrentPosition();
            long jCurrentTimeMillis = System.currentTimeMillis();
            float volume = getVolume();
            QP qp = this.A0F;
            if (qp != null) {
                qp.ABF(currentPosition, currentPosition2, jCurrentTimeMillis, volume);
            }
        }
    }

    static {
        A07();
        A0P = TextureViewSurfaceTextureListenerC0943Ij.class.getSimpleName();
    }

    public TextureViewSurfaceTextureListenerC0943Ij(C1337Xw c1337Xw) {
        super(c1337Xw);
        this.A0D = QO.A04;
        this.A0E = QO.A04;
        this.A0L = false;
        this.A0M = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = PZ.A03;
        this.A0K = false;
        this.A0A = c1337Xw;
    }

    public TextureViewSurfaceTextureListenerC0943Ij(C1337Xw c1337Xw, AttributeSet attributeSet) {
        super(c1337Xw, attributeSet);
        this.A0D = QO.A04;
        this.A0E = QO.A04;
        this.A0L = false;
        this.A0M = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = PZ.A03;
        this.A0K = false;
        this.A0A = c1337Xw;
    }

    public TextureViewSurfaceTextureListenerC0943Ij(C1337Xw c1337Xw, AttributeSet attributeSet, int i10) {
        super(c1337Xw, attributeSet, i10);
        this.A0D = QO.A04;
        this.A0E = QO.A04;
        this.A0L = false;
        this.A0M = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = PZ.A03;
        this.A0K = false;
        this.A0A = c1337Xw;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0083  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    private void A04() {
        Q9 q10 = new Q9(this.A0A);
        this.A0C = q10;
        q10.A0H(this);
        this.A0C.A0G(this);
        this.A0C.A0I(false);
        if (this.A0J && !this.A0I) {
            Activity activityA0D = this.A0A.A0D();
            if (A0O[5].length() != 21) {
                throw new RuntimeException();
            }
            String[] strArr = A0O;
            strArr[4] = "kOzpobq3cn2ENPvO1dz11rE9gYrdsM2t";
            strArr[6] = "XeC6T5eSgweGxN3AGx0qK1AhpVQau6BW";
            if (activityA0D != null) {
                MediaController mediaController = new MediaController(activityA0D);
                this.A09 = mediaController;
                View view = this.A08;
                if (view == null) {
                    view = this;
                }
                mediaController.setAnchorView(view);
                this.A09.setMediaPlayer(new QF(this));
                this.A09.setEnabled(true);
            } else {
                this.A09 = null;
            }
        }
        String str = this.A0G;
        String[] strArr2 = A0O;
        if (strArr2[4].charAt(4) != strArr2[6].charAt(4)) {
            A0O[1] = "7OzxCvlMe7OewOex";
            if (str != null) {
                if (str.length() != 0 || this.A0K) {
                }
            }
            setVideoState(QO.A08);
            if (isAvailable()) {
                onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
            }
        }
        String[] strArr3 = A0O;
        strArr3[4] = "NXAVCVHzJxAz58YH1UEgH4PHy83Kp8aQ";
        strArr3[6] = "f1ODdwAOeVqSGvJpvEMDUKedn4FgojKu";
        if (str != null) {
            if (str.length() != 0) {
            }
        }
        setVideoState(QO.A08);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
        this.A0C.A0F(this.A0A.A01(), this.A06);
        setVideoState(QO.A08);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    private void A05() {
        Q9 q10 = this.A0C;
        if (q10 == null) {
            return;
        }
        Q7 q7A08 = q10.A08();
        String[] strArr = A0O;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0O;
        strArr2[3] = "yniwio37QFCiL85s5GWvJngxgc";
        strArr2[0] = "95HbvmBBNGyB2bovEph22CE4vZ";
        if (q7A08 != null) {
            A08(q7A08.A01, q7A08.A00);
        }
    }

    private void A06() {
        Surface surface = this.A07;
        if (surface != null) {
            surface.release();
            this.A07 = null;
        }
        Q9 q10 = this.A0C;
        if (q10 != null) {
            q10.A09();
            if (A0O[5].length() != 21) {
                throw new RuntimeException();
            }
            String[] strArr = A0O;
            strArr[3] = "he0jjWxzFB8qDestWT3k7cDZmQ";
            strArr[0] = "YQusGxI3ZRGEiRLtvLIlZ3cCdg";
            this.A0C = null;
        }
        this.A09 = null;
        this.A0M = false;
        setVideoState(QO.A04);
    }

    private void A08(int i10, int i11) {
        if (i10 != this.A03 || i11 != this.A02) {
            this.A03 = i10;
            this.A02 = i11;
            if (i10 != 0 && i11 != 0) {
                requestLayout();
            }
        }
    }

    public static boolean A09() {
        return Q9.A03();
    }

    public final /* synthetic */ void A0A() {
        Activity activity = this.A0A.A0D();
        if (activity != null && activity.isInMultiWindowMode()) {
            return;
        }
        A8F();
        if (A0O[1].length() == 30) {
            throw new RuntimeException();
        }
        String[] strArr = A0O;
        strArr[3] = "ibP83lPIHp18E6DzSXuO582r7E";
        strArr[0] = "bqS8XhAkEDMP7WptTe4caNAUJi";
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final void A8F() {
        if (!this.A0H) {
            ADZ(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final boolean A8Q() {
        Q9 q10 = this.A0C;
        return q10 != null && q10.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final boolean A8R() {
        return this.A0M;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final boolean A8y() {
        return this.A0L;
    }

    @Override // com.facebook.ads.redexgen.X.Q6
    public final void ACG(String str, Exception exc) {
        this.A0A.A0E().A9w(str);
        this.A0A.A0E().A32(1);
        setVideoState(QO.A03);
        this.A0A.A07().A9K(A03(219, 7, 124), C06937v.A1N, new C06947w(exc));
    }

    @Override // com.facebook.ads.redexgen.X.Q6
    public final void ACH(boolean z10, int i10) {
        if (this.A0C == null) {
            return;
        }
        switch (i10) {
            case 1:
                setVideoState(QO.A04);
                return;
            case 2:
                A05();
                if (this.A01 < 0) {
                    return;
                }
                int i11 = this.A01;
                this.A01 = -1;
                QP qp = this.A0F;
                String[] strArr = A0O;
                String str = strArr[2];
                String str2 = strArr[7];
                int length = str.length();
                int seekFrom = str2.length();
                if (length == seekFrom) {
                    throw new RuntimeException();
                }
                A0O[1] = "rrPXv2FoHSgfFGcrQjG2fRVM";
                if (qp == null) {
                    return;
                }
                int seekFrom2 = getCurrentPosition();
                qp.ACh(i11, seekFrom2);
                return;
            case 3:
                A05();
                this.A04 = System.currentTimeMillis();
                setRequestedVolume(this.A00);
                long j10 = this.A05;
                if (j10 > 0 && j10 < this.A0C.A07()) {
                    this.A0C.A0D(this.A05);
                    this.A05 = 0L;
                }
                if (this.A0C.A06() != 0 && !z10 && this.A0M) {
                    setVideoState(QO.A05);
                    return;
                }
                if (z10 || this.A0D == QO.A06) {
                    return;
                }
                setVideoState(QO.A07);
                if (this.A0E != QO.A0A) {
                    return;
                }
                AFW(this.A0B, 8);
                this.A0E = QO.A04;
                return;
            case 4:
                if (z10) {
                    setVideoState(QO.A06);
                }
                Q9 q10 = this.A0C;
                if (q10 != null) {
                    q10.A0I(false);
                    if (!z10) {
                        this.A0C.A0A();
                    }
                }
                this.A0M = false;
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.Q8
    public final void ADK(int i10, int i11, int i12, float f10) {
        A08(i10, i11);
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final void ADZ(boolean z10, int i10) {
        this.A0A.A0E().A2y(i10);
        this.A0E = QO.A05;
        this.A0L = z10;
        Q9 q10 = this.A0C;
        if (q10 != null) {
            q10.A0I(false);
        } else {
            setVideoState(QO.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final void AFR(int i10) {
        this.A0A.A0E().A9x(i10);
        setVideoState(QO.A09);
        AFd(5);
        this.A05 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final void AFW(PZ pz, int i10) {
        this.A0A.A0E().A39(i10);
        this.A0L = false;
        this.A0E = QO.A0A;
        this.A0B = pz;
        if (this.A0C == null) {
            setup(this.A06);
        } else {
            if (this.A0D != QO.A07 && this.A0D != QO.A05 && this.A0D != QO.A06) {
                return;
            }
            this.A0C.A0I(true);
            setVideoState(QO.A0A);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final void AFd(int i10) {
        this.A0A.A0E().A3B(i10);
        this.A0E = QO.A04;
        Q9 q10 = this.A0C;
        if (q10 != null) {
            q10.A0B();
            this.A0C.A09();
            this.A0C = null;
        }
        setVideoState(QO.A04);
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final void destroy() {
        A06();
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public int getCurrentPosition() {
        Q9 q10 = this.A0C;
        if (q10 != null) {
            return (int) q10.A06();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public int getDuration() {
        Q9 q10 = this.A0C;
        if (q10 == null) {
            return 0;
        }
        return (int) q10.A07();
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public long getInitialBufferTime() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public PZ getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public QO getState() {
        return this.A0D;
    }

    public QO getTargetState() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public int getVideoHeight() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public int getVideoWidth() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (IN.A28(getContext()) && !isHardwareAccelerated()) {
            setVideoState(QO.A03);
            AFd(8);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        Surface surface = this.A07;
        if (surface != null) {
            surface.release();
        }
        Surface surface2 = new Surface(surfaceTexture);
        this.A07 = surface2;
        Q9 q10 = this.A0C;
        if (q10 == null) {
            return;
        }
        q10.A0E(surface2);
        if (this.A0D == QO.A05 && !this.A0L) {
            AFW(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.A07;
        if (surface != null) {
            surface.release();
            this.A07 = null;
            Q9 q10 = this.A0C;
            if (q10 != null) {
                q10.A0E(null);
            }
        }
        if (this.A0D == QO.A05) {
            return true;
        }
        if (A0O[5].length() != 21) {
            throw new RuntimeException();
        }
        A0O[5] = "TScQzo9LVHiM3saFvXTgi";
        ADZ(false, 5);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.A0C == null) {
            return;
        }
        MediaController mediaController = this.A09;
        if (mediaController != null && mediaController.isShowing()) {
            return;
        }
        if (!z10) {
            if (this.A0D != QO.A05) {
                if (IN.A1F(this.A0A) && Build.VERSION.SDK_INT >= 24) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.QE
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.A00.A0A();
                        }
                    }, 1000L);
                    return;
                } else {
                    A8F();
                    return;
                }
            }
            return;
        }
        if (this.A0D != QO.A05 || this.A0L) {
            return;
        }
        AFW(this.A0B, 9);
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final void seekTo(int i10) {
        if (this.A0C != null) {
            this.A01 = getCurrentPosition();
            this.A0C.A0D(i10);
            return;
        }
        long j10 = i10;
        String[] strArr = A0O;
        if (strArr[2].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0O[5] = "kfjJwAtkK1UY2s6fcoM3d";
        this.A05 = j10;
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        boolean zIsDebugBuild = AdInternalSettings.isDebugBuild();
        if (A0O[5].length() != 21) {
            throw new RuntimeException();
        }
        A0O[1] = "HF5JdwiOlRNKOfaOH";
        if (!zIsDebugBuild) {
            return;
        }
        Log.w(A0P, A03(0, 102, 85));
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public void setBackgroundPlaybackEnabled(boolean z10) {
        this.A0H = z10;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public void setControlsAnchorView(View view) {
        this.A08 = view;
        view.setOnTouchListener(new QH(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
            return;
        }
        if (!AdInternalSettings.isDebugBuild()) {
            return;
        }
        String str = A0P;
        String[] strArr = A0O;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0O;
        strArr2[4] = "adR4uJi1AjYNmamYU7fKdN8LPQzpuqJY";
        strArr2[6] = "LCKmfGi2Ka9VnYBnqFwdGZK0MZJmec2m";
        Log.w(str, A03(102, 94, 79));
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public void setFullScreen(boolean z10) {
        this.A0J = z10;
        if (z10 && !this.A0I) {
            setOnTouchListener(new QG(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public void setRequestedVolume(float f10) {
        this.A00 = f10;
        if (this.A0C != null && this.A0D != QO.A08 && this.A0D != QO.A04) {
            this.A0C.A0C(f10);
        }
    }

    public void setTestMode(boolean z10) {
        this.A0K = z10;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public void setVideoMPD(String str) {
        this.A0G = str;
    }

    private void setVideoState(QO qo) {
        if (qo != this.A0D) {
            if (this.A0A.A04().A8n()) {
                String str = A03(196, 23, 51) + qo;
            }
            this.A0D = qo;
            if (qo == QO.A0A) {
                this.A0M = true;
            }
            QP qp = this.A0F;
            if (qp != null) {
                qp.ADM(qo);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public void setVideoStateChangeListener(QP qp) {
        this.A0F = qp;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public void setup(Uri uri) {
        this.A0A.A0E().A31();
        if (this.A0C != null) {
            A06();
        }
        this.A06 = uri;
        setSurfaceTextureListener(this);
        A04();
    }
}
