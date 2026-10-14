package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class RN extends RelativeLayout implements QP, PS, QN {
    public static byte[] A0E;
    public static String[] A0F = {"bTF0mPynjITMPKd7AWnGFE0wjuUHqGk", "NLuteA0O4hImypGMVaagZ7KROvpQko", "vHIsSgA1dNPe0TxNLDw8T5r", "Tu3OEd7", "fTm", "FLX2LFKD3Z9kyRG7iyj3Ajj18EKg1", "ES7oyLysdjBWPeOJZDQ9P8Sn", "e8"};
    public static final OA A0G;
    public static final MC A0H;
    public static final M6 A0I;
    public static final LM A0J;
    public static final LH A0K;
    public static final C0988Kf A0L;
    public static final KF A0M;
    public static final KC A0N;
    public int A00;
    public C0945Il A01;
    public PW A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final Handler A08;
    public final View.OnTouchListener A09;
    public final C1337Xw A0A;
    public final C8X<C8Y, C8W> A0B;
    public final List<InterfaceC1111Pa> A0C;
    public final QM A0D;

    public static String A0F(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 103);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0I() {
        byte[] bArr = {4, 87, 73, 71, 4, 88, 83, 88, 69, 80, 4, 91, 69, 88, 71, 76, 4, 88, 77, 81, 73, 38, 88, 85, 85, 72, 81, 87, 79, 92, 3, 68, 87, 3};
        if (A0F[6].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[5] = "dnbQEbQJ0095hjHrUlDt4BBpkj0Wp";
        strArr[7] = "GI";
        A0E = bArr;
    }

    static {
        A0I();
        A0I = new M6();
        A0G = new OA();
        A0J = new LM();
        A0K = new LH();
        A0H = new MC();
        A0L = new C0988Kf();
        A0N = new KC();
        A0M = new KF();
    }

    public RN(C1337Xw c1337Xw) {
        super(c1337Xw);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C8X<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new PR(this);
        this.A0A = c1337Xw;
        if (A0S(c1337Xw)) {
            this.A0D = new TextureViewSurfaceTextureListenerC0943Ij(c1337Xw);
        } else {
            this.A0D = new TextureViewSurfaceTextureListenerC0941Ih(c1337Xw);
        }
        A0G();
    }

    public RN(C1337Xw c1337Xw, AttributeSet attributeSet) {
        super(c1337Xw, attributeSet);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C8X<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new PR(this);
        this.A0A = c1337Xw;
        if (A0S(c1337Xw)) {
            this.A0D = new TextureViewSurfaceTextureListenerC0943Ij(c1337Xw, attributeSet);
        } else {
            this.A0D = new TextureViewSurfaceTextureListenerC0941Ih(c1337Xw, attributeSet);
        }
        A0G();
    }

    public RN(C1337Xw c1337Xw, AttributeSet attributeSet, int i10) {
        super(c1337Xw, attributeSet, i10);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C8X<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new PR(this);
        this.A0A = c1337Xw;
        if (A0S(c1337Xw)) {
            this.A0D = new TextureViewSurfaceTextureListenerC0943Ij(c1337Xw, attributeSet, i10);
        } else {
            this.A0D = new TextureViewSurfaceTextureListenerC0941Ih(c1337Xw, attributeSet, i10);
        }
        A0G();
    }

    public static /* synthetic */ M6 A0C() {
        M6 m10 = A0I;
        if (A0F[0].length() != 31) {
            throw new RuntimeException();
        }
        A0F[6] = "XnBln0F0zo0j2g49JSScdoR2";
        return m10;
    }

    private void A0G() {
        this.A06 = IN.A0p(this.A0A);
        this.A0A.A0E().A2x();
        this.A0D.setRequestedVolume(1.0f);
        this.A0D.setVideoStateChangeListener(this);
        this.A02 = new PW(this.A0A, this.A0D);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
        setOnTouchListener(this.A09);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H() {
        this.A07.postDelayed(new RR(this), this.A00);
    }

    private final void A0J() {
        for (InterfaceC1111Pa plugin : this.A0C) {
            if (plugin instanceof PN) {
                A0Q((PN) plugin);
            }
            plugin.A9B(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(int i10) {
        if (IN.A0t(this.A0A)) {
            Toast.makeText(this.A0A, A0F(21, 13, 124) + (i10 / 1000.0f) + A0F(0, 21, 125), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(EnumC0944Ik enumC0944Ik) {
        C0945Il c0945Il = this.A01;
        if (c0945Il == null) {
            return;
        }
        c0945Il.A04(enumC0944Ik, null);
    }

    private void A0P(InterfaceC1111Pa interfaceC1111Pa) {
        if (interfaceC1111Pa instanceof PN) {
            A0R((PN) interfaceC1111Pa);
        }
        interfaceC1111Pa.AFp(this);
    }

    private void A0Q(PN pn) {
        if (pn.getParent() == null) {
            if (pn instanceof C06606h) {
                this.A02.A00(pn);
            } else {
                addView(pn);
            }
        }
    }

    private void A0R(PN pn) {
        if (pn instanceof C06606h) {
            this.A02.A01(pn);
        } else {
            LO.A0J(pn);
        }
    }

    private boolean A0S(C1337Xw c1337Xw) {
        return IN.A2N(c1337Xw, Q9.A03());
    }

    public final void A0V() {
        this.A0D.setVideoStateChangeListener(null);
        this.A0D.destroy();
    }

    public final void A0W() {
        if (A0i()) {
            return;
        }
        this.A0D.A8F();
    }

    public final void A0X() {
        Iterator<InterfaceC1111Pa> it = this.A0C.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A0F[0].length() != 31) {
                throw new RuntimeException();
            }
            A0F[0] = "GYUlZXdJo7nruMh2UHaMalRUd7rYm0D";
            if (zHasNext) {
                A0P(it.next());
            } else {
                this.A0C.clear();
                String[] strArr = A0F;
                if (strArr[4].length() != strArr[3].length()) {
                    String[] strArr2 = A0F;
                    strArr2[4] = "dBG";
                    strArr2[3] = "pEPub8w";
                    return;
                }
                return;
            }
        }
    }

    public final void A0Y(int i10) {
        this.A07.removeCallbacksAndMessages(null);
        this.A0D.seekTo(i10);
    }

    public final void A0Z(int i10) {
        this.A0D.AFd(i10);
    }

    public final void A0a(PU pu) {
        RO ro = new RO(this);
        if (this.A06) {
            LI.A00(ro);
        } else {
            Handler handler = this.A08;
            if (A0F[6].length() != 24) {
                throw new RuntimeException();
            }
            A0F[6] = "kK0l9LoMdPIpLA2D0gOeof4W";
            handler.post(ro);
        }
        this.A0D.AFR(pu.A02());
    }

    public final void A0b(PZ pz, int i10) {
        if (this.A03 && this.A0D.getState() == QO.A06) {
            this.A03 = false;
        }
        this.A0D.AFW(pz, i10);
    }

    public final void A0c(InterfaceC1111Pa interfaceC1111Pa) {
        this.A0C.add(interfaceC1111Pa);
    }

    public final void A0d(InterfaceC1111Pa interfaceC1111Pa) {
        this.A0C.remove(interfaceC1111Pa);
        A0P(interfaceC1111Pa);
    }

    public final void A0e(boolean z10, int i10) {
        if (A0i()) {
            return;
        }
        this.A0D.ADZ(z10, i10);
    }

    public final void A0f(boolean z10, boolean z11, int i10) {
        this.A05 = z11;
        A0e(z10, i10);
    }

    public final boolean A0g() {
        return this.A0D.A8Q();
    }

    public final boolean A0h() {
        return getVolume() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    public final boolean A0i() {
        return getState() == QO.A05;
    }

    public final boolean A0j() {
        return A0i() && this.A0D.A8y();
    }

    public final boolean A0k() {
        return getState() == QO.A0A;
    }

    public final boolean A0l() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.PS
    public final boolean A8q() {
        return A0S(this.A0A);
    }

    @Override // com.facebook.ads.redexgen.X.PS
    public final boolean A8t() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.QP
    public final void ABF(final long j10, final long j11, final long j12, final float f10) {
        if (!IN.A1X(this.A0A)) {
            return;
        }
        this.A0B.A02(new AbstractC1109Oy(j10, j11, j12, f10) { // from class: com.facebook.ads.redexgen.X.71
        });
    }

    @Override // com.facebook.ads.redexgen.X.QP
    public final void ABq() {
        A0e(true, 4);
    }

    @Override // com.facebook.ads.redexgen.X.QP
    public final void ABr() {
        A0b(PZ.A04, 6);
    }

    @Override // com.facebook.ads.redexgen.X.QP
    public final void ACh(int i10, int i11) {
        RP rp = new RP(this, i10, i11);
        if (this.A06) {
            LI.A00(rp);
        } else {
            this.A08.post(rp);
        }
        A0H();
    }

    @Override // com.facebook.ads.redexgen.X.QP
    public final void ADM(QO qo) {
        int currentPositionInMillis = getCurrentPositionInMillis();
        int currentPositionMS = getDuration();
        RQ rq = new RQ(this, qo, currentPositionInMillis, currentPositionMS);
        if (this.A06) {
            LI.A00(rq);
        } else {
            this.A08.post(rq);
        }
    }

    @Override // com.facebook.ads.redexgen.X.PS
    public int getCurrentPositionInMillis() {
        return this.A0D.getCurrentPosition();
    }

    public int getDuration() {
        return this.A0D.getDuration();
    }

    public C8X<C8Y, C8W> getEventBus() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.PS
    public long getInitialBufferTime() {
        return this.A0D.getInitialBufferTime();
    }

    public QO getState() {
        return this.A0D.getState();
    }

    public Handler getStateHandler() {
        return this.A08;
    }

    public TextureView getTextureView() {
        return (TextureView) this.A0D;
    }

    public int getVideoHeight() {
        return this.A0D.getVideoHeight();
    }

    public View getVideoImplView() {
        return this.A0D.getView();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.PS
    public PZ getVideoStartReason() {
        return this.A0D.getStartReason();
    }

    public View getVideoView() {
        return this.A02;
    }

    public int getVideoWidth() {
        return this.A0D.getVideoWidth();
    }

    @Override // com.facebook.ads.redexgen.X.PS
    public float getVolume() {
        return this.A0D.getVolume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.A0B.A02(A0M);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.A0B.A02(A0N);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        QM qm = this.A0D;
        if (qm != null) {
            qm.setControlsAnchorView(view);
        }
    }

    public void setFunnelLoggingHandler(C0945Il c0945Il) {
        this.A01 = c0945Il;
    }

    public void setIsFullScreen(boolean z10) {
        this.A04 = z10;
        this.A0D.setFullScreen(z10);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVideoMPD(String str) {
        this.A0D.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i10) {
        this.A00 = i10;
    }

    public void setVideoURI(Uri uri) {
        if (uri == null) {
            A0X();
        } else {
            A0J();
            this.A0D.setup(uri);
        }
        this.A03 = false;
    }

    public void setVideoURI(String str) {
        this.A0A.A0E().A34(str);
        setVideoURI(str != null ? KW.A00(str) : null);
    }

    public void setVolume(float f10) {
        if (f10 == 1.0f) {
            A0L(EnumC0944Ik.A0g);
            this.A0A.A0E().A38();
        } else {
            A0L(EnumC0944Ik.A0f);
            this.A0A.A0E().A37();
        }
        this.A0D.setRequestedVolume(f10);
        C8X<C8Y, C8W> eventBus = getEventBus();
        if (A0F[2].length() == 19) {
            throw new RuntimeException();
        }
        A0F[2] = "etD2zaPMct9y2wbR2YehsJmmTem";
        eventBus.A02(A0L);
    }
}
