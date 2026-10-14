package com.facebook.ads.redexgen.X;

import android.os.SystemClock;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class X8 implements AY {
    public static byte[] A01;
    public static String[] A02 = {"uFnK", "23brwyJGPu3ZknDoMNdw3hVXVLFEULQy", "FtMR8ROvDO4Zz8SuhvbrIDHAZ1hbcqSx", "4tDbtxEkY45WyXaQwFKWRvOHK17MthWz", "P3L0", "jQPyzSgXTRUrKPul", "L4bq6z2eevSU7Qg95t0o6YCr4fHdh5", "Io3idew6HPzrUVEIzO8xEfp6xkmYSMtW"};
    public final /* synthetic */ X7 A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[5].length() == 27) {
                throw new RuntimeException();
            }
            A02[5] = "3SKjhf7gYf6c2NzhB";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 109);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{109, 97, 92, 104, 121, 116, 114, 73, 111, 124, 126, 118, 18, 60, 53, 52, 41, 50, 53, 60, 123, 50, 54, 43, 52, 40, 40, 50, 57, 55, 34, 123, 55, 58, 41, 60, 62, 123, 58, 46, 63, 50, 52, 123, 55, 58, 47, 62, 53, 56, 34, 97, 123, 35, 0, 5, 2, Ascii.EM, Ascii.US, 5, 3, 80, 17, 5, 20, Ascii.EM, Ascii.US, 80, 4, Ascii.EM, Ascii.GS, 21, 3, 4, 17, Ascii.GS, 0, 80, 88, 22, 2, 17, Ascii.GS, 21, 80, 0, Ascii.US, 3, Ascii.EM, 4, Ascii.EM, Ascii.US, Ascii.RS, 80, Ascii.GS, Ascii.EM, 3, Ascii.GS, 17, 4, 19, Ascii.CAN, 89, 74, 80, 79, 108, 105, 110, 117, 115, 105, 111, 60, 125, 105, 120, 117, 115, 60, 104, 117, 113, 121, 111, 104, 125, 113, 108, 60, 52, 111, 101, 111, 104, 121, 113, 60, Ascii.DEL, 112, 115, Ascii.DEL, 119, 60, 113, 117, 111, 113, 125, 104, Ascii.DEL, 116, 53, 38, 60};
    }

    static {
        A01();
    }

    public X8(X7 x10) {
        this.A00 = x10;
    }

    public /* synthetic */ X8(X7 x10, C0749Ab c0749Ab) {
        this(x10);
    }

    @Override // com.facebook.ads.redexgen.X.AY
    public final void ABa(long j10) {
        Log.w(A00(2, 10, 112), A00(12, 41, 54) + j10);
    }

    @Override // com.facebook.ads.redexgen.X.AY
    public final void ACK(long j10, long j11, long j12, long j13) {
        StringBuilder sbAppend = new StringBuilder().append(A00(53, 52, 29)).append(j10);
        String strA00 = A00(0, 2, 44);
        String string = sbAppend.append(strA00).append(j11).append(strA00).append(j12).append(strA00).append(j13).append(strA00).append(this.A00.A03()).append(strA00).append(this.A00.A04()).toString();
        if (!X7.A0q) {
            String message = A00(2, 10, 112);
            Log.w(message, string);
            return;
        }
        throw new C0752Ae(string, null);
    }

    @Override // com.facebook.ads.redexgen.X.AY
    public final void ACw(long j10, long j11, long j12, long j13) {
        StringBuilder sbAppend = new StringBuilder().append(A00(105, 50, 113)).append(j10);
        String strA00 = A00(0, 2, 44);
        String string = sbAppend.append(strA00).append(j11).append(strA00).append(j12).append(strA00).append(j13).append(strA00).append(this.A00.A03()).append(strA00).append(this.A00.A04()).toString();
        if (X7.A0q) {
            throw new C0752Ae(string, null);
        }
        String[] strArr = A02;
        String str = strArr[4];
        String message = strArr[0];
        if (str.length() != message.length()) {
            throw new RuntimeException();
        }
        A02[3] = "q4b4TTgkvPPQBYTsQFxk23ASltXkXf65";
        String message2 = A00(2, 10, 112);
        Log.w(message2, string);
    }

    @Override // com.facebook.ads.redexgen.X.AY
    public final void AD5(int i10, long j10) {
        if (this.A00.A0R != null) {
            this.A00.A0R.AD6(i10, j10, SystemClock.elapsedRealtime() - this.A00.A0E);
        }
    }
}
