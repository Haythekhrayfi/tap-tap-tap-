package com.facebook.ads.redexgen.X;

import android.os.Handler;
import ch.qos.logback.core.spi.ComponentTracker;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1379Zo implements Jf {
    public static byte[] A0E;
    public static String[] A0F = {"Um", "5O6Pi5UhekEiJBNtL2", "ByBiFstlzS", "VNZICTTmM6bBZ", "I3ykA2cHAONkN", "xnUs6VMzToWHuFoC", "Qkjm3fg24P6DD7pmZ7L4neN1zLjqdukp", "LFB8Dcv49A6aPeUL"};
    public InterfaceC05481t A00;
    public C8D A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;
    public final AdSize A06;
    public final C05220t A07;
    public final C1337Xw A08;
    public final InterfaceC0937Id A09;
    public final JI A0A;
    public final C0964Jg A0B;
    public final Runnable A0C;
    public final String A0D;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0F[2].length() != 10) {
                throw new RuntimeException();
            }
            A0F[1] = "uoxYJqIRleds8fPMMv";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 87);
            i13++;
        }
    }

    public static void A05() {
        byte[] bArr = {64, 65, -14, 66, 62, 51, 53, 55, 63, 55, 64, 70, -14, 59, 64, -14, 68, 55, 69, 66, 65, 64, 69, 55};
        if (A0F[0].length() != 2) {
            throw new RuntimeException();
        }
        A0F[1] = "dKV76OJFyRmVPWeRzZ";
        A0E = bArr;
    }

    static {
        A05();
        LQ.A02();
    }

    public C1379Zo(C1337Xw c1337Xw, String str, JI ji, AdSize adSize, int i10) {
        this.A08 = c1337Xw;
        this.A0D = str;
        this.A0A = ji;
        this.A06 = adSize;
        this.A04 = i10;
        C0964Jg c0964Jg = new C0964Jg(c1337Xw);
        this.A0B = c0964Jg;
        c0964Jg.A0P(this);
        this.A07 = new C05220t();
        this.A03 = true;
        this.A05 = new Handler();
        this.A0C = new C0837Ee(this);
        this.A09 = c1337Xw.A09();
        DynamicLoaderFactory.makeLoader(c1337Xw).getInitApi().onAdLoadInvoked(c1337Xw);
    }

    private List<C1419aS> A04() {
        C8D c8d = this.A01;
        ArrayList arrayList = new ArrayList(c8d.A02());
        for (C8B c8bA04 = c8d.A04(); c8bA04 != null; c8bA04 = c8d.A04()) {
            InterfaceC05170o interfaceC05170oA00 = this.A07.A00(this.A08, AdPlacementType.NATIVE);
            if (interfaceC05170oA00 != null && interfaceC05170oA00.A7V() == AdPlacementType.NATIVE) {
                C1419aS nativeAdapter = (C1419aS) interfaceC05170oA00;
                nativeAdapter.A0L(this.A08, new C0844El(this, arrayList, nativeAdapter), this.A09, new C05461r(c8bA04.A04(), c8d.A05(), this.A0D, c8d.A05().A0C()), U7.A0K());
            }
        }
        return arrayList;
    }

    public final void A06() {
        this.A03 = false;
        this.A05.removeCallbacks(this.A0C);
    }

    public final void A07() {
        try {
            JN jn = new JN(this.A08, null, null, null);
            C1337Xw c1337Xw = this.A08;
            String str = this.A0D;
            AdSize adSize = this.A06;
            this.A0B.A0O(new C0962Jd(c1337Xw, str, adSize != null ? new L0(adSize.getWidth(), this.A06.getHeight()) : null, this.A0A, null, this.A04, AdSettings.isTestMode(this.A08), AdSettings.isMixedAudience(), jn, L6.A01(IN.A0J(this.A08)), this.A02, null));
        } catch (JE e10) {
            AB6(JD.A02(e10));
        }
    }

    public final void A08(InterfaceC05481t interfaceC05481t) {
        this.A00 = interfaceC05481t;
    }

    public final void A09(String str) {
        this.A02 = str;
    }

    public final boolean A0A() {
        C8D c8d = this.A01;
        return c8d == null || c8d.A0C();
    }

    @Override // com.facebook.ads.redexgen.X.Jf
    public final void AB6(JD jd2) {
        if (this.A03) {
            this.A05.postDelayed(this.A0C, ComponentTracker.DEFAULT_TIMEOUT);
        }
        InterfaceC05481t interfaceC05481t = this.A00;
        if (A0F[2].length() != 10) {
            throw new RuntimeException();
        }
        A0F[2] = "yGn7NPCZVX";
        if (interfaceC05481t != null) {
            interfaceC05481t.AB6(jd2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.Jf
    public final void ACu(C1235Tu c1235Tu) {
        C8D c8dA00 = c1235Tu.A00();
        if (c8dA00 != null) {
            if (this.A03) {
                long jA0A = c8dA00.A05().A0A();
                if (jA0A == 0) {
                    jA0A = ComponentTracker.DEFAULT_TIMEOUT;
                }
                this.A05.postDelayed(this.A0C, jA0A);
            }
            this.A01 = c8dA00;
            List<C1419aS> listA04 = A04();
            if (this.A00 != null) {
                if (listA04.isEmpty()) {
                    this.A00.AB6(JD.A01(AdErrorType.NO_FILL, A03(0, 0, 68)));
                    return;
                } else {
                    this.A00.AC2(listA04);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException(A03(0, 24, 123));
    }
}
