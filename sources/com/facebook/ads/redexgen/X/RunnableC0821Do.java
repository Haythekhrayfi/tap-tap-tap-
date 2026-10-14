package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Do, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0821Do implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ C0829Dw A00;
    public final /* synthetic */ DownloadAction[] A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{Ascii.RS, 53, 45, 52, 54, 53, 59, 62, 23, 59, 52, 59, 61, 63, 40, 105, 92, 75, 74, 80, 74, 77, 80, 87, 94, Ascii.EM, 88, 90, 77, 80, 86, 87, 74, Ascii.EM, 95, 88, 80, 85, 92, 93, 23};
    }

    public RunnableC0821Do(C0829Dw c0829Dw, DownloadAction[] downloadActionArr) {
        this.A00 = c0829Dw;
        this.A01 = downloadActionArr;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            try {
                this.A00.A09.A02(this.A01);
            } catch (IOException e10) {
                Log.e(A00(0, 15, 36), A00(15, 26, 71), e10);
            }
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
