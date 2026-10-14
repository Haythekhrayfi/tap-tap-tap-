package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class TR extends RelativeLayout implements InterfaceC1020Ln {
    public static byte[] A0F;
    public static String[] A0G = {"fqT9snXDZkE2N6bIU2twhbCcrvrF5wQR", "W8MK3buqarkLhDixdfnbfGeXuw3i87xB", "M5iWaw3OwwKxChS5bTa9KUrj63pwu1Od", "QKu8TlGQ3D7NsDDaY", "OUnrWL6BanKvWJF", "644mHU9zQQHAcSiNB", "MqQzuM0GD0HqxOL2854PPJvoiao7nama", "mSpdOD621tCilusEUOf234Jx9LR3KzyX"};
    public View A00;
    public C0990Kh A01;
    public C1104Ot A02;
    public boolean A03;
    public boolean A04;
    public AnonymousClass19 A05;
    public PK A06;
    public boolean A07;
    public final LB A08;
    public final InterfaceC1019Lm A09;
    public final AbstractC1404aD A0A;
    public final C1337Xw A0B;
    public final InterfaceC0937Id A0C;
    public final C0945Il A0D;
    public final AbstractC1018Ll A0E;

    public static String A0M(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0P() {
        A0F = new byte[]{88, 84, 86, 21, 93, 90, 88, 94, 89, 84, 84, 80, 21, 90, 95, 72, 21, 82, 85, 79, 94, 73, 72, 79, 82, 79, 82, 90, 87, 21, 82, 86, 75, 73, 94, 72, 72, 82, 84, 85, 21, 87, 84, 92, 92, 94, 95};
    }

    public abstract boolean A0b();

    public abstract int getCloseButtonStyle();

    static {
        A0P();
    }

    public TR(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, InterfaceC1019Lm interfaceC1019Lm, AbstractC1404aD abstractC1404aD) {
        super(c1337Xw);
        this.A07 = false;
        this.A04 = false;
        this.A03 = false;
        this.A0B = c1337Xw;
        this.A0C = interfaceC0937Id;
        this.A09 = interfaceC1019Lm;
        this.A08 = new LB(this);
        this.A0A = abstractC1404aD;
        C0945Il c0945Il = new C0945Il(abstractC1404aD.A0s(), interfaceC0937Id);
        this.A0D = c0945Il;
        this.A0E = new FullScreenAdToolbar(c1337Xw, getAudienceNetworkListener(), c0945Il, 0, abstractC1404aD.A0h());
    }

    private C1M A0K(int i10) {
        if (i10 == 1) {
            return this.A05.A01();
        }
        AnonymousClass19 anonymousClass19 = this.A05;
        if (A0G[2].charAt(7) != 'O') {
            throw new RuntimeException();
        }
        A0G[0] = "MYlveE6g4wScBr3MsnlZwbj0w3RA4Q0m";
        return anonymousClass19.A00();
    }

    private void A0N() {
        removeAllViews();
        LO.A0J(this);
    }

    private void A0O() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (A0Y() && this.A02 == null) {
            this.A04 = true;
            C1104Ot c1104OtA0B = new C1102Or(this.A0B, this.A0A.A0n().A0E(), this.A0A.A0q()).A08(this.A0A.A0m().A01()).A0B();
            this.A02 = c1104OtA0B;
            C0947In.A04(c1104OtA0B, this.A0D, EnumC0944Ik.A0V);
            this.A09.A3O(this, 0, layoutParams);
            this.A09.A3O(this.A02, 1, layoutParams);
            this.A02.A04(new TT(this));
            return;
        }
        this.A09.A3O(this, 0, layoutParams);
    }

    private void A0Q(C1M c1m, boolean z10) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0E.getToolbarHeight());
        layoutParams.addRule(10);
        this.A0E.A06(c1m, ViewOnClickListenerC1207Ss.A08(this.A0A));
        addView(this.A0E, layoutParams);
    }

    public final void A0T() {
        View view = this.A00;
        if (view == null || !(view instanceof AbstractC1072Nn)) {
            return;
        }
        if (A0Z()) {
            ((AbstractC1072Nn) this.A00).A0s();
        } else {
            ((AbstractC1072Nn) this.A00).A0r();
        }
    }

    public final void A0U(int i10) {
        this.A01 = new C0990Kh(i10, new TS(this, i10));
        this.A03 = true;
        A0T();
        this.A01.A08();
    }

    public final void A0V(View view, boolean z10, int i10) {
        this.A0E.setFullscreen(z10);
        this.A00 = view;
        this.A08.A05(LA.A03);
        A0N();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, z10 ? 0 : this.A0E.getToolbarHeight(), 0, 0);
        layoutParams.addRule(12);
        addView(view, layoutParams);
        C1M c1mA0K = A0K(i10);
        A0Q(c1mA0K, z10);
        LO.A0M(this, c1mA0K.A07(false));
        if (this.A09 != null) {
            A0O();
            String[] strArr = A0G;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0G[0] = "NsWlVTe7e8AxmZfep9MsD1WsEVvEb3lR";
            if (z10 && Build.VERSION.SDK_INT >= 19) {
                LB lb2 = this.A08;
                if (A0G[0].charAt(10) == 'o') {
                    throw new RuntimeException();
                }
                A0G[2] = "LlUUcmlOaTawHlOzciUSj9DhXPbTXBAe";
                lb2.A05(LA.A04);
            }
        }
    }

    public final void A0W(C5H c5h) {
        this.A08.A04(c5h.A0J().getWindow());
        this.A05 = this.A0A.A0m();
        C1D c1dA0n = null;
        C1D adInfo = this.A0A.A0n();
        if (adInfo != null) {
            C1D adInfo2 = this.A0A.A0n();
            if (adInfo2 != null) {
                c1dA0n = this.A0A.A0n();
            }
        }
        this.A0E.setPageDetails(this.A0A.A0q(), this.A0A.A0s(), c1dA0n != null ? c1dA0n.A0D().A03() : 0, this.A0A.A0r());
        this.A0E.setToolbarListener(new TV(this, c5h));
    }

    public final void A0X(C5H c5h) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new AnimationAnimationListenerC1027Lu(this, this, c5h));
        startAnimation(alphaAnimation);
    }

    public final boolean A0Y() {
        if (!this.A0A.A0u().isEmpty()) {
            boolean zA0P = this.A0A.A0n().A0P();
            if (A0G[6].charAt(3) != 'z') {
                throw new RuntimeException();
            }
            A0G[2] = "rwsNokIOLx9Fj0KMvDMbhHWjcozH5rOe";
            if (zA0P) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0Z() {
        return this.A03;
    }

    public final boolean A0a() {
        return this.A04;
    }

    public void AC8(boolean z10) {
        C0990Kh c0990Kh = this.A01;
        if (c0990Kh != null && c0990Kh.A06()) {
            this.A01.A07();
        }
    }

    public void ACY(boolean z10) {
        C0990Kh c0990Kh = this.A01;
        if (c0990Kh != null && !c0990Kh.A05()) {
            this.A01.A08();
        }
    }

    public InterfaceC0937Id getAdEventManager() {
        return this.A0C;
    }

    public InterfaceC1019Lm getAudienceNetworkListener() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public String getCurrentClientToken() {
        return this.A0A.A0s();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A08.A03();
        this.A0E.setToolbarListener(null);
        A0N();
    }

    public void setImpressionRecordingFlag(LG lg) {
        lg.A05();
        if (getAudienceNetworkListener() != null) {
            if (this.A07) {
                getAudienceNetworkListener().A3y(new TE().A73());
            } else {
                getAudienceNetworkListener().A3y(A0M(0, 47, 106));
            }
        }
    }

    public void setListener(InterfaceC1019Lm interfaceC1019Lm) {
    }

    public void setServerSideRewardHandler(PK pk) {
        this.A06 = pk;
    }
}
