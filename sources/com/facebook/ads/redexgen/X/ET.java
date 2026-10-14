package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ET extends AbstractC1385Zu {
    public static byte[] A00;
    public static String[] A01 = {"QPajxPBXawZguZvIACdyFqOYUKJhGG1P", "5fhxQ1wmDDZwcYW6vVZtBFGAbpCppeaF", "0C8PIOmzvjBgpmOh8JUWA", "4kKOVZ4CcWBKVljagfvAN2XyBryastSO", "Oy7EzKzQwTS7e9udIDBq4FtqglrDvqBF", "BZaaKRqUw", "6zOS7wuF6dlGz7u6SsHniaRnv53e8kon", "jwUp8OtoUlvjJY1bP74aKb8UsU7a0Ko9"};

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[7].charAt(30) != strArr[6].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "Dg0tZg7IxBj4D2AEunqK4FRxjbaI0pzK";
            strArr2[4] = "5sVR5Q40j80Tm4EH72ZLdFDAQDj0jOHn";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 112);
            i13++;
        }
    }

    public static void A02() {
        A00 = new byte[]{-11, -13, 0, -78, 1, 0, -2, 11, -78, 5, -9, 6, -78, 1, 0, -78, 4, -9, 9, -13, 4, -10, -9, -10, -78, 8, -5, -10, -9, 1, -78, -13, -10, 5, -15, -14, -93, -28, -25, -28, -13, -9, -24, -11, -93, -11, -24, -28, -25, -4, -93, -9, -14, -93, -10, -24, -9, -93, -11, -24, -6, -28, -11, -25, -93, -14, -15};
    }

    static {
        A02();
    }

    public ET(C1337Xw c1337Xw, C05451q c05451q) {
        super(c1337Xw, c05451q);
    }

    private C1377Zm A00(Runnable runnable) {
        return new C1377Zm(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1385Zu
    public final void A0L() {
        AbstractC1408aH abstractC1408aH = (AbstractC1408aH) this.A01;
        abstractC1408aH.A00(this.A07.A00);
        abstractC1408aH.A01(this.A07.A01);
        abstractC1408aH.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1385Zu
    public final void A0N(InterfaceC05170o interfaceC05170o, C8D c8d, C8B c8b, C05461r c05461r) {
        F8 f10 = (F8) interfaceC05170o;
        C1378Zn c1378Zn = new C1378Zn(this, c05461r, f10);
        if (IN.A22(this.A0B)) {
            A0E().postDelayed(c1378Zn, c8d.A05().A05());
        }
        C1337Xw c1337Xw = this.A0B;
        C1377Zm c1377ZmA00 = A00(c1378Zn);
        boolean z10 = this.A07.A06;
        String str = this.A07.A04;
        C05451q c05451q = this.A07;
        String[] strArr = A01;
        if (strArr[3].charAt(31) == strArr[0].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "qv162d7nxdmOCgZ5HSNnY6lM4lD0tO4m";
        strArr2[0] = "JwvltbAvbK0MQjlZGmmyrgC4vpl52SAH";
        f10.A0J(c1337Xw, c1377ZmA00, c05461r, z10, str, c05451q.A05);
    }

    public final void A0V(RewardData rewardData) {
        if (this.A01 != null) {
            if (this.A01.A7V() == AdPlacementType.REWARDED_VIDEO) {
                AbstractC1408aH rewardedVideoAdapter = (AbstractC1408aH) this.A01;
                rewardedVideoAdapter.A02(rewardData);
                return;
            }
            throw new IllegalStateException(A01(0, 34, 34));
        }
        throw new IllegalStateException(A01(34, 33, 19));
    }
}
