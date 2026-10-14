package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C7Q extends ContextWrapper {
    public final C7S A00;
    public final AtomicReference<String> A01;

    public C7Q(Context context, C7S c7s) {
        super(context.getApplicationContext());
        this.A01 = new AtomicReference<>();
        this.A00 = c7s;
    }

    public final C6S A00() {
        return this.A00.A6F();
    }

    public final C1336Xv A01() {
        return this.A00.A7i(this);
    }

    public final C7R A02() {
        return this.A00.A64(this);
    }

    public final C7T A03() {
        return this.A00.A6n(this);
    }

    public final C7V A04() {
        return this.A00.A7h(this);
    }

    public final C7W A05() {
        return this.A00.A7x();
    }

    public final C7h A06() {
        return this.A00.A6c(this);
    }

    public final InterfaceC06927u A07() {
        return this.A00.A6d(this);
    }

    public final C8L A08() {
        return this.A00.A7p();
    }

    public final InterfaceC0937Id A09() {
        return this.A00.A5p(A01());
    }

    public final InterfaceC0949Ip A0A() {
        return this.A00.A7j(A01());
    }

    public final String A0B() {
        return this.A01.get();
    }

    public final void A0C(String str) {
        this.A01.set(str);
    }
}
