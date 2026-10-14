package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YJ implements InterfaceC05481t {
    public static byte[] A03;
    public C5Y A00;
    public C1337Xw A01;
    public final NativeAdBase.MediaCacheFlag A02;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{59, 52, 33, 60, 35, 48, 100, Ascii.DEL, 122, Ascii.DEL, 126, 102, Ascii.DEL};
    }

    public YJ(C5Y c5y, C1337Xw c1337Xw, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c5y;
        this.A01 = c1337Xw;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05481t
    public final void AB6(JD jd2) {
        C0978Jv.A00(new YM(this, jd2));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05481t
    public final void AC2(List<C1419aS> list) {
        C6O manager = new C6O(this.A01);
        String firstRequestId = A02(6, 7, 70);
        for (C1419aS c1419aS : list) {
            if (A02(6, 7, 70).equals(firstRequestId)) {
                firstRequestId = c1419aS.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c1419aS.A0E().A0G() != null) {
                    manager.A0b(new C6M(c1419aS.A0E().A0G().getUrl(), c1419aS.A0E().A0G().getHeight(), c1419aS.A0E().A0G().getWidth(), c1419aS.A0G(), A02(0, 6, 2)));
                }
                if (c1419aS.A0E().A0F() != null) {
                    manager.A0b(new C6M(c1419aS.A0E().A0F().getUrl(), c1419aS.A0E().A0F().getHeight(), c1419aS.A0E().A0F().getWidth(), c1419aS.A0G(), A02(0, 6, 2)));
                }
                if (!TextUtils.isEmpty(c1419aS.A0E().A0d())) {
                    manager.A0a(new C6K(c1419aS.A0E().A0d(), c1419aS.A0G(), A02(0, 6, 2), c1419aS.A0E().A0A()));
                }
            }
        }
        manager.A0W(new YK(this, list), new C6H(firstRequestId, A02(0, 6, 2)));
    }
}
