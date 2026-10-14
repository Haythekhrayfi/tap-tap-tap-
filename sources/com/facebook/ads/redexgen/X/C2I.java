package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2I, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2I implements Serializable {
    public static final long serialVersionUID = -3209129042070173126L;
    public C2I A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final List<C2I> A04;

    public C2I(int i10, String str, String str2) {
        this.A04 = new ArrayList();
        this.A01 = i10;
        this.A03 = str;
        this.A02 = str2;
    }

    public C2I(String str) {
        this(0, null, str);
    }

    private void A00(C2I c2i) {
        this.A00 = c2i;
    }

    public final int A01() {
        return this.A01;
    }

    public final C2I A02() {
        return this.A00;
    }

    public final String A03() {
        return this.A02;
    }

    public final String A04() {
        return this.A03;
    }

    public final List<C2I> A05() {
        return this.A04;
    }

    public final void A06(C2I c2i) {
        c2i.A00(this);
        this.A04.add(c2i);
    }
}
