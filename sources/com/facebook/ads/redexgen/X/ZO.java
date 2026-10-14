package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZO implements C2K {
    public final SharedPreferences A00;

    public ZO(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.X.C2K
    public final ZP A5M() {
        return new ZP(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.X.C2K
    public final long A7B(String str, long j10) {
        return this.A00.getLong(str, j10);
    }

    @Override // com.facebook.ads.redexgen.X.C2K
    public final String A7w(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
