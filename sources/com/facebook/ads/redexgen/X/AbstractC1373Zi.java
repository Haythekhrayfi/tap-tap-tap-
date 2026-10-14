package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1373Zi implements AnonymousClass28 {
    public static byte[] A05;
    public final InterfaceC05511w A00;
    public final C1337Xw A01;
    public final String A02 = UUID.randomUUID().toString();
    public final Handler A03;
    public final AnonymousClass23 A04;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 36);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-65, -46, -53, -63, -55, -62, -36, -62, -43, -47, -49, -66, -48, -36, -56, -62, -42, -46, -41, -35, -24, -50, -37, -37, -40, -37, -24, -52, -40, -51, -50, -24, -44, -50, -30, -83, -82, -84, -71, -101, -98, -71, -93, -98, -71, -91, -97, -77, -24, -23, -25, -12, -38, -25, -25, -28, -25, -12, -30, -38, -24, -24, -42, -36, -38, -12, -32, -38, -18};
    }

    public abstract void A05();

    public AbstractC1373Zi(C1337Xw c1337Xw, AnonymousClass24 anonymousClass24) {
        this.A01 = c1337Xw;
        DynamicLoaderFactory.makeLoader(c1337Xw).getInitApi().onAdLoadInvoked(c1337Xw);
        C1376Zl c1376Zl = new C1376Zl(c1337Xw, this);
        this.A00 = c1376Zl;
        this.A03 = new Handler(Looper.getMainLooper());
        this.A04 = anonymousClass24.A4b(c1376Zl, this);
    }

    public final void A04() {
        if (!IN.A0q(this.A01)) {
            return;
        }
        LI.A00(new C1374Zj(this));
    }

    public final void A06(int i10, AdErrorType adErrorType, String str) {
        Bundle bundle = new Bundle();
        String strA02 = A02(48, 21, 113);
        if (str != null) {
            bundle.putString(strA02, str);
        } else {
            bundle.putString(strA02, adErrorType.getDefaultErrorMessage());
        }
        bundle.putInt(A02(17, 18, 101), adErrorType.getErrorCode());
        ABw(i10, this.A02, bundle);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass28
    public final void ABw(int i10, String str, Bundle bundle) {
        Message messageObtain = Message.obtain((Handler) null, i10);
        messageObtain.getData().putString(A02(35, 13, 54), str);
        if (bundle != null) {
            messageObtain.getData().putBundle(A02(0, 17, 89), bundle);
        }
        Runnable callbackApiRunnable = new C1375Zk(this, messageObtain);
        this.A03.post(callbackApiRunnable);
    }
}
