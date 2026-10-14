package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2125z2 implements C2072x.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C2125z2 f17989g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C2050w2 f17991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<Activity> f17992c = new WeakReference<>(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F9 f17993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2075x2 f17994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f17995f;

    public C2125z2(Context context, F9 f10, C2075x2 c2075x2) {
        this.f17990a = context;
        this.f17993d = f10;
        this.f17994e = c2075x2;
        this.f17991b = f10.r();
        this.f17995f = f10.w();
        Y.g().a().a(this);
    }

    public static C2125z2 a(Context context) {
        if (f17989g == null) {
            synchronized (C2125z2.class) {
                if (f17989g == null) {
                    f17989g = new C2125z2(context, new F9(Qa.a(context).c()), new C2075x2());
                }
            }
        }
        return f17989g;
    }

    private void b(Context context) {
        C2050w2 c2050w2A;
        if (context == null || (c2050w2A = this.f17994e.a(context)) == null || c2050w2A.equals(this.f17991b)) {
            return;
        }
        this.f17991b = c2050w2A;
        this.f17993d.a(c2050w2A);
    }

    public synchronized C2050w2 a() {
        b(this.f17992c.get());
        if (this.f17991b == null) {
            if (!U2.a(30)) {
                b(this.f17990a);
            } else if (!this.f17995f) {
                b(this.f17990a);
                this.f17995f = true;
                this.f17993d.y();
            }
        }
        return this.f17991b;
    }

    @Override // com.yandex.metrica.impl.ob.C2072x.b
    public synchronized void a(Activity activity) {
        this.f17992c = new WeakReference<>(activity);
        if (this.f17991b == null) {
            b(activity);
        }
    }
}
