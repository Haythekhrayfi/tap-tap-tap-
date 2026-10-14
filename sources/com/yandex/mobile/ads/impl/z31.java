package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class z31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ph f27208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f27209b;

    public static abstract class a extends f<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CharSequence f27210c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ph f27211d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f27212e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f27213f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f27214g;

        public a(z31 z31Var, CharSequence charSequence) {
            this.f27211d = z31Var.f27208a;
            this.f27212e = z31.b(z31Var);
            this.f27214g = z31.c(z31Var);
            this.f27210c = charSequence;
        }
    }

    public interface b {
    }

    private z31(y31 y31Var, ph phVar) {
        this.f27209b = y31Var;
        this.f27208a = phVar;
    }

    public static z31 a(char c10) {
        return new z31(new y31(new ph.b(c10)), ph.d.f24061b);
    }

    public static /* synthetic */ boolean b(z31 z31Var) {
        Objects.requireNonNull(z31Var);
        return false;
    }

    public static /* synthetic */ int c(z31 z31Var) {
        Objects.requireNonNull(z31Var);
        return Integer.MAX_VALUE;
    }

    public final List<String> a(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        y31 y31Var = (y31) this.f27209b;
        Objects.requireNonNull(y31Var);
        x31 x31Var = new x31(y31Var, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (x31Var.hasNext()) {
            arrayList.add(x31Var.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
