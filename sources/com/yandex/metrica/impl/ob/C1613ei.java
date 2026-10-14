package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.File;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ei, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1613ei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1812mi f16064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uh f16065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RunnableC1737ji f16066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RunnableC1737ji f16067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Qi f16068f;

    public C1613ei(Context context) {
        this(context, new C1812mi(), new Uh(context));
    }

    public C1613ei(Context context, C1812mi c1812mi, Uh uh) {
        this.f16063a = context;
        this.f16064b = c1812mi;
        this.f16065c = uh;
    }

    public synchronized void a() {
        RunnableC1737ji runnableC1737ji = this.f16066d;
        if (runnableC1737ji != null) {
            runnableC1737ji.a();
        }
        RunnableC1737ji runnableC1737ji2 = this.f16067e;
        if (runnableC1737ji2 != null) {
            runnableC1737ji2.a();
        }
    }

    public synchronized void a(Qi qi) {
        this.f16068f = qi;
        RunnableC1737ji runnableC1737ji = this.f16066d;
        if (runnableC1737ji == null) {
            C1812mi c1812mi = this.f16064b;
            Context context = this.f16063a;
            Objects.requireNonNull(c1812mi);
            this.f16066d = new RunnableC1737ji(context, qi, new Rh(), new C1762ki(c1812mi), new Wh("open", "http"), new Wh("port_already_in_use", "http"), "Http");
        } else {
            runnableC1737ji.a(qi);
        }
        this.f16065c.a(qi, this);
    }

    public synchronized void a(File file) {
        RunnableC1737ji runnableC1737ji = this.f16067e;
        if (runnableC1737ji == null) {
            C1812mi c1812mi = this.f16064b;
            Context context = this.f16063a;
            Qi qi = this.f16068f;
            Objects.requireNonNull(c1812mi);
            this.f16067e = new RunnableC1737ji(context, qi, new Vh(file), new C1787li(c1812mi), new Wh("open", "https"), new Wh("port_already_in_use", "https"), "Https");
        } else {
            runnableC1737ji.a(this.f16068f);
        }
    }

    public synchronized void b() {
        RunnableC1737ji runnableC1737ji = this.f16066d;
        if (runnableC1737ji != null) {
            runnableC1737ji.b();
        }
        RunnableC1737ji runnableC1737ji2 = this.f16067e;
        if (runnableC1737ji2 != null) {
            runnableC1737ji2.b();
        }
    }

    public synchronized void b(Qi qi) {
        this.f16068f = qi;
        this.f16065c.a(qi, this);
        RunnableC1737ji runnableC1737ji = this.f16066d;
        if (runnableC1737ji != null) {
            runnableC1737ji.b(qi);
        }
        RunnableC1737ji runnableC1737ji2 = this.f16067e;
        if (runnableC1737ji2 != null) {
            runnableC1737ji2.b(qi);
        }
    }
}
