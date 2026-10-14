package com.yandex.mobile.ads.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w7 implements a00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<t7> f26194a = a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y7 f26195b;

    public class a implements Runnable {
        private a() {
        }

        public /* synthetic */ a(w7 w7Var, int i10) {
            this();
        }

        @Override // java.lang.Runnable
        public final void run() {
            w7.b(w7.this);
        }
    }

    public class b implements Runnable {
        private b() {
        }

        public /* synthetic */ b(w7 w7Var, int i10) {
            this();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (w7.this.f26195b != null) {
                o7.c(o7.this);
            }
        }
    }

    private List<t7> a() {
        int i10 = 0;
        return Arrays.asList(new z7("adtuneRendered", new b(this, i10)), new z7("adtuneClosed", new a(this, i10)));
    }

    public static void b(w7 w7Var) {
        y7 y7Var = w7Var.f26195b;
        if (y7Var != null) {
            o7.a aVar = (o7.a) y7Var;
            o7.this.f23710d.a();
            o7.this.f23708b.dismiss();
        }
    }

    public final void a(int i10) {
        y7 y7Var;
        if (!new x7().a(i10) || (y7Var = this.f26195b) == null) {
            return;
        }
        o7.a aVar = (o7.a) y7Var;
        o7.this.f23710d.a();
        o7.this.f23708b.dismiss();
    }

    public final void a(y7 y7Var) {
        this.f26195b = y7Var;
    }

    public final void a(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            for (t7 t7Var : this.f26194a) {
                if (t7Var.a(scheme, host)) {
                    t7Var.a();
                    return;
                }
            }
            y7 y7Var = this.f26195b;
            if (y7Var != null) {
                o7.this.f23711e.a(str);
            }
        } catch (URISyntaxException unused) {
            x60.f(fn1.a("Invalid URL: ", str), new Object[0]);
            y7 y7Var2 = this.f26195b;
            if (y7Var2 != null) {
                o7.a aVar = (o7.a) y7Var2;
                o7.this.f23710d.a();
                o7.this.f23708b.dismiss();
            }
        }
    }
}
