package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C1908qe extends AbstractC1932re {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f17169j = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2112ye f17170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C2112ye f17171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C2112ye f17172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C2112ye f17173i;

    public C1908qe(Context context, String str) {
        super(context, str);
        this.f17170f = new C2112ye("init_event_pref_key", c());
        this.f17171g = new C2112ye("init_event_pref_key");
        this.f17172h = new C2112ye("first_event_pref_key", c());
        this.f17173i = new C2112ye("fitst_event_description_key", c());
    }

    private void a(C2112ye c2112ye) {
        this.f17243b.edit().remove(c2112ye.a()).apply();
    }

    @Deprecated
    public String b(String str) {
        return this.f17243b.getString(this.f17171g.a(), null);
    }

    public String c(String str) {
        return this.f17243b.getString(this.f17172h.a(), null);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1932re
    public String d() {
        return "_initpreferences";
    }

    public String d(String str) {
        return this.f17243b.getString(this.f17170f.a(), null);
    }

    @Deprecated
    public void f() {
        a(this.f17171g);
    }

    public void g() {
        a(this.f17173i);
    }

    public void h() {
        a(this.f17172h);
    }

    public void i() {
        a(this.f17170f);
    }

    public void j() {
        a(this.f17170f.a(), "DONE").b();
    }
}
