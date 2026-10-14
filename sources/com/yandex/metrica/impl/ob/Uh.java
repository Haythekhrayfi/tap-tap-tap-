package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class Uh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L0 f15184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f15185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Qd f15186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Ph f15187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Om f15188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Ud f15189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C2047w f15190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f15191i;

    public Uh(Context context) {
        this(context, new L0(), new Qd(), new Nm(), new Rd(context), P0.i().s().h(), P0.i().u(), P0.i().a());
    }

    public Uh(Context context, L0 l10, Qd qd2, Om om, Ud ud2, InterfaceExecutorC1966sn interfaceExecutorC1966sn, Ph ph, C2047w c2047w) {
        this.f15191i = false;
        this.f15183a = context;
        this.f15184b = l10;
        this.f15186d = qd2;
        this.f15188f = om;
        this.f15189g = ud2;
        this.f15185c = interfaceExecutorC1966sn;
        this.f15187e = ph;
        this.f15190h = c2047w;
    }

    public static void a(Uh uh, long j10) {
        uh.f15187e.a(uh.f15188f.b() + j10);
    }

    public static void c(Uh uh) {
        synchronized (uh) {
            uh.f15191i = false;
        }
    }

    public synchronized void a(Qi qi, C1613ei c1613ei) {
        Ei eiM = qi.M();
        if (eiM == null) {
            return;
        }
        File fileA = this.f15184b.a(this.f15183a, "certificate.p12");
        boolean z10 = fileA != null && fileA.exists();
        if (z10) {
            c1613ei.a(fileA);
        }
        long jB = this.f15188f.b();
        long jA = this.f15187e.a();
        if ((!z10 || jB >= jA) && !this.f15191i) {
            String strE = qi.e();
            if (!TextUtils.isEmpty(strE) && this.f15189g.a()) {
                this.f15191i = true;
                this.f15190h.a(C2047w.f17740c, this.f15185c, new Sh(this, strE, fileA, c1613ei, eiM));
            }
        }
    }
}
