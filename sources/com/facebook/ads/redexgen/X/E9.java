package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class E9 extends C1346Yf {
    public static String[] A00 = {"ebBTtcDfrXbt7XUNv2xXXzukgR", "AfSrg72OINfokWlk8lEehE43rER54C5K", "DLWRAT6zkYb5ZQ4lVerhsjeXnJdmq546", "HcA6UXt4lgXnqoCqWVxSHZRcl", "xLJGdEWbtHtgosfXVcR1IwW", "KlZdBiYd7CYsgOQcQxjIKqODuE8wujbn", "gwTEk6Fa0GjLNEZ2sqovA8E7SRT86ppt", "mobLesdsIst7Z6gfBQK3QOgi9WAmLStS"};

    public E9(C5H c5h) {
        super(c5h, null);
    }

    public /* synthetic */ E9(C5H c5h, C5D c5d) {
        this(c5h);
    }

    @Override // com.facebook.ads.redexgen.X.C1346Yf, com.facebook.ads.redexgen.X.InterfaceC1019Lm
    public final void A3y(String str) {
        if (this.A00.get() == null) {
            return;
        }
        C5H c5h = this.A00.get();
        if (A00[1].charAt(12) != 'k') {
            throw new RuntimeException();
        }
        A00[0] = "wcnlDkVPCotGmNFV8gEH10X6";
        c5h.A0F(str);
        String strA02 = EnumC1113Pc.A08.A02();
        String rewardedVideoError = EnumC1113Pc.A09.A02();
        if (str.equals(strA02)) {
            this.A00.get().finish(11);
        } else if (str.equals(rewardedVideoError)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1346Yf, com.facebook.ads.redexgen.X.InterfaceC1019Lm
    public final void A3z(String str, C8W c8w) {
        super.A3z(str, c8w);
    }
}
