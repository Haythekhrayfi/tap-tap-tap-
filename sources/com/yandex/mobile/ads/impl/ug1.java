package com.yandex.mobile.ads.impl;

import android.view.View;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class ug1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25633b;

    public ug1(int i10, int i11) {
        this.f25632a = i10;
        this.f25633b = i11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ug1(View view) {
        this(view.getWidth(), view.getHeight());
        fd.j0.i(view, "view");
    }

    public final int a() {
        return this.f25633b;
    }

    public final int b() {
        return this.f25632a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug1)) {
            return false;
        }
        ug1 ug1Var = (ug1) obj;
        return this.f25632a == ug1Var.f25632a && this.f25633b == ug1Var.f25633b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25633b) + (Integer.hashCode(this.f25632a) * 31);
    }

    public final String toString() {
        StringBuilder sbA = v60.a("ViewSize(width=");
        sbA.append(this.f25632a);
        sbA.append(", height=");
        return h0.f.a(sbA, this.f25633b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
