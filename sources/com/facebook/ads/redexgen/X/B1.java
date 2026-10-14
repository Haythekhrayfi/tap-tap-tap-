package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class B1 implements Runnable {
    public static String[] A03 = {"sDcLoG09GWCWYCahQPpTUylp9", "ZxBqMK1DCICEyNIlPwVLbJWcni1aAKYH", "ShXSarSfvvPI4GGBk7ldbg6DgX3AvNA2", "G9jT0KjuKOHKxFW7zmztJXurp6ft8Iew", "tWsnZRQ738EgHelN8w82d1XQPVgdbuqM", "bfEH2x8bkPgD1YcnPf", "78dR9FbzkCZt9pXqdWRiXavApJeMag5x", "ewkJf6EYJ8xAq"};
    public final /* synthetic */ B5 A00;
    public final /* synthetic */ B6 A01;
    public final /* synthetic */ Exception A02;

    public B1(B5 b10, B6 b11, Exception exc) {
        this.A00 = b10;
        this.A01 = b11;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A01.AB1(this.A02);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
            String[] strArr = A03;
            if (strArr[3].charAt(31) == strArr[6].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[0] = "JTjbQLaMYhZHgvDskMiTPaTFd";
            strArr2[5] = "3CN4wPIlTKQCQQpPOs";
        }
    }
}
