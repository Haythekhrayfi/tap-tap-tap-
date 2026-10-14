package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class R3 implements Runnable {
    public static String[] A01 = {"3bEhPYYzc5fVBItk4bGa", "Ce", "GmWtX09iNNzDLnDjdoFJEBRcRzFAcDBf", "N44QKPTSg6wcEQXW53eH2RsqUllmXQk2", "RFs4NAiy8zVcoINu9nJPhYOk9dbkWxsY", "g8LIsrvQi", "JD", "dbppRoUaCvn2Y"};
    public final /* synthetic */ C0890Gg A00;

    public R3(C0890Gg c0890Gg) {
        this.A00 = c0890Gg;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
        } catch (Throwable th) {
            String[] strArr = A01;
            if (strArr[2].charAt(0) == strArr[4].charAt(0)) {
                throw new RuntimeException();
            }
            A01[3] = "AtJfA1XgCSxMZtT9btYZ3nyK8xLmcUYA";
            C0979Jw.A00(th, this);
        }
    }
}
