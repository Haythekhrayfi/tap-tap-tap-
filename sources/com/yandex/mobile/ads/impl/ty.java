package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ty extends hu0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wf.a<ty> f25515d = dp1.C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f25516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25517c;

    public ty() {
        this.f25516b = false;
        this.f25517c = false;
    }

    public ty(boolean z10) {
        this.f25516b = true;
        this.f25517c = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ty b(Bundle bundle) {
        pa.a(bundle.getInt(Integer.toString(0, 36), -1) == 0);
        return bundle.getBoolean(Integer.toString(1, 36), false) ? new ty(bundle.getBoolean(Integer.toString(2, 36), false)) : new ty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ty)) {
            return false;
        }
        ty tyVar = (ty) obj;
        return this.f25517c == tyVar.f25517c && this.f25516b == tyVar.f25516b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f25516b), Boolean.valueOf(this.f25517c)});
    }
}
