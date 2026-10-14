package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2127z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G9 f17996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Om f17997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final R2 f17998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Ui f17999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f18000e;

    public C2127z4(Context context, C1549c4 c1549c4) {
        this(new G9(Qa.a(context).b(c1549c4)), new Nm(), new R2());
    }

    public C2127z4(G9 g10, Om om, R2 r10) {
        this.f17996a = g10;
        this.f17997b = om;
        this.f17998c = r10;
        this.f18000e = g10.j();
    }

    public void a() {
        long jA = this.f17997b.a();
        this.f18000e = jA;
        this.f17996a.d(jA).c();
    }

    public void a(Ui ui) {
        this.f17999d = ui;
    }

    public boolean a(Boolean bool) {
        Ui ui;
        return Boolean.FALSE.equals(bool) && (ui = this.f17999d) != null && this.f17998c.a(this.f18000e, ui.f15192a, "should report diagnostic");
    }
}
