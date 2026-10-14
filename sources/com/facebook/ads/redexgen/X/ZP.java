package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZP implements C2J {
    public final SharedPreferences.Editor A00;

    public ZP(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    public final ZP A00(String str, long j10) {
        this.A00.putLong(str, j10);
        return this;
    }

    public final ZP A01(String str, String str2) {
        this.A00.putString(str, str2);
        return this;
    }

    public final void A02() {
        this.A00.apply();
    }
}
