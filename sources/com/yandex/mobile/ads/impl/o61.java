package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class o61 extends hu0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wf.a<o61> f23703d = dp1.f19965x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f23704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f23705c;

    public o61() {
        this.f23704b = false;
        this.f23705c = false;
    }

    public o61(boolean z10) {
        this.f23704b = true;
        this.f23705c = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static o61 b(Bundle bundle) {
        pa.a(bundle.getInt(Integer.toString(0, 36), -1) == 3);
        return bundle.getBoolean(Integer.toString(1, 36), false) ? new o61(bundle.getBoolean(Integer.toString(2, 36), false)) : new o61();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o61)) {
            return false;
        }
        o61 o61Var = (o61) obj;
        return this.f23705c == o61Var.f23705c && this.f23704b == o61Var.f23704b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f23704b), Boolean.valueOf(this.f23705c)});
    }
}
