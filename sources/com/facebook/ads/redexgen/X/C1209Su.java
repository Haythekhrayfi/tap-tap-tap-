package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Su, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1209Su implements InterfaceC0989Kg {
    public static byte[] A0B;
    public static String[] A0C = {"yjxjfYdrUuNcQdEaAwocONv5EWPutnE0", "dRlwVer0DvGhJUYrc6Uo0NmXUudA179W", "0RnVmJRwwZudZEhL6bHsgo2zllxyZ4rb", "m0b7Xk04EuyV6HvP3aQ0qivYD5xsobzk", "0t24jhYDd0ZYm7OB5Pi8K72QIL3VEz", "lOzGJRW4wb6yqjR22F", "IF7HB2KmjMtnMILVYc8NomcIB26UEqSU", "4w4SFr7wcyEc7Fy4rwfiYpUJCop0r4V7"};
    public int A00;
    public int A01;
    public int A02;
    public AbstractC1018Ll A03;
    public String A04;
    public String A05;
    public ViewOnClickListenerC1207Ss A06;
    public boolean A0A = false;
    public boolean A09 = false;
    public boolean A08 = false;
    public Integer A07 = null;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-69, -45, -59, -61, -45, -67, -18, 2, 1, -4, -16, -7, -10, -16, -8};
        if (A0C[5].length() == 17) {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[7] = "4rqaLE5ZbqFcULNB9c87AdfXRmFVNOuy";
        strArr[0] = "UmGixQziu9kcJVx2wygXDh2bknYXJmsp";
        A0B = bArr;
    }

    static {
        A01();
    }

    public C1209Su(int i10, int i11, int i12, String str, String str2, AbstractC1018Ll abstractC1018Ll, ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss) {
        this.A01 = i10;
        this.A00 = i11;
        this.A02 = i12;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = abstractC1018Ll;
        this.A06 = viewOnClickListenerC1207Ss;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (this.A08) {
            A04();
        }
    }

    public final synchronized void A04() {
        AbstractC1018Ll abstractC1018Ll;
        if (this.A09) {
            return;
        }
        this.A09 = true;
        if (this.A01 == 1 && (abstractC1018Ll = this.A03) != null) {
            abstractC1018Ll.setProgressImage(null);
            this.A03.setProgressClickListener(null);
            this.A03.setToolbarActionMessage(A00(0, 0, 115));
            this.A03.A04();
            Integer num = this.A07;
            if (num != null) {
                this.A03.setToolbarActionMode(num.intValue());
            }
            if (this.A06.getColorInfo() != null) {
                this.A03.A06(this.A06.getColorInfo(), false);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0989Kg
    public final synchronized void AAk() {
        if (!this.A09) {
            this.A06.A09(A00(6, 9, 97));
        }
        A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0989Kg
    public final synchronized void ACO(float f10) {
        AbstractC1018Ll abstractC1018Ll;
        if (!this.A09 && (abstractC1018Ll = this.A03) != null) {
            if (this.A01 == 1) {
                if (!this.A0A) {
                    this.A07 = Integer.valueOf(abstractC1018Ll.getToolbarActionMode());
                    this.A03.setProgressClickListener(new NK(this));
                    this.A03.A05();
                    this.A03.setToolbarListener(new C1210Sv(this));
                    this.A0A = true;
                    Integer num = this.A07;
                    if (num == null || num.intValue() == 4) {
                        this.A03.setToolbarActionMode(5);
                    } else {
                        this.A03.setToolbarActionMode(6);
                    }
                }
                if (f10 <= this.A02) {
                    if (!this.A08) {
                        this.A08 = true;
                        Integer num2 = this.A07;
                        if (num2 == null || num2.intValue() == 4) {
                            this.A03.setToolbarActionMode(7);
                        } else {
                            this.A03.setProgressImage(LW.CROSS);
                            this.A03.setToolbarActionMode(6);
                        }
                    }
                    this.A03.setToolbarActionMessage(this.A04.replace(A00(0, 6, 52), String.valueOf((int) Math.ceil(f10))));
                } else {
                    this.A03.setToolbarActionMessage(this.A05);
                }
            }
        }
    }
}
