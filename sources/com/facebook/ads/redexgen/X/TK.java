package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TK implements InterfaceC0989Kg {
    public static byte[] A01;
    public static String[] A02 = {"XQ6pDaA1rZEM", "XoeGOYiSv0w2M1U1qXC2kK0WxpTFbq6C", "goNPtYs5sZFfNSJyOgs171oDuCl7t69H", "IBRmsKraW8ihcuaNuynFKjmRlH", "udOMyB", "k9bLdXox5SSCuqwZoRmzAy5kJm", "rLCACxpviKCtWgunDsmekf59Ef0kXw8R", "IiDilnQTvcIperbA6lCpmy3utrrmGEhT"};
    public final /* synthetic */ TI A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-32, -8, -22, -24, -8, -30};
    }

    static {
        A01();
    }

    public TK(TI ti) {
        this.A00 = ti;
    }

    public /* synthetic */ TK(TI ti, TQ tq) {
        this(ti);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0989Kg
    public final void AAk() {
        this.A00.A0Y.setToolbarActionMessage(A00(0, 0, 7));
        this.A00.A0J();
        if (this.A00.A0V && this.A00.A0Y()) {
            this.A00.A0Y.setToolbarActionMode(1);
        } else {
            this.A00.A0Y.setToolbarActionMode(0);
        }
        boolean z10 = this.A00.A0W;
        if (A02[4].length() != 6) {
            throw new RuntimeException();
        }
        A02[4] = "RNuzR8";
        if (!z10) {
            LO.A0U(this.A00, 500);
            if (this.A00.A06 != null) {
                LO.A0N(this.A00.A06, 0);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0989Kg
    public final void ACO(float f10) {
        float fA03;
        this.A00.A0Q((int) f10);
        if (!this.A00.A0X) {
            float percentage = 1.0f - (f10 / this.A00.A0H.A07());
            this.A00.A0Y.setProgress(100.0f * percentage);
            return;
        }
        if (this.A00.A0C) {
            fA03 = 1.0f - (f10 / this.A00.A0G.A0n().A0D().A02());
            if (this.A00.A0F || fA03 < 1.0f) {
                this.A00.A0F = false;
                String strA02 = this.A00.A0G.A0r().A02();
                String[] strArr = A02;
                if (strArr[1].charAt(20) != strArr[6].charAt(20)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "16sMGD3KF8iI";
                strArr2[5] = "yItCOMUcMHVXea4ql8lykvs7qx";
                String rewardMessage = strA02.replace(A00(0, 6, 65), String.valueOf((int) f10));
                this.A00.A0Y.setToolbarActionMessage(rewardMessage);
            } else {
                this.A00.A0F = true;
                this.A00.A0Y.setToolbarActionMessage(A00(0, 0, 7));
            }
        } else {
            fA03 = 1.0f - (f10 / this.A00.A0G.A0n().A0D().A03());
        }
        this.A00.A0Y.setProgress(100.0f * fA03);
        float fA02 = this.A00.A0G.A0n().A0D().A02() - f10;
        float percentageOfReward = this.A00.A0G.A0n().A0D().A03();
        boolean z10 = fA02 >= percentageOfReward;
        if (!this.A00.A0F && z10) {
            this.A00.A0Y.setToolbarActionMode(1);
        }
    }
}
