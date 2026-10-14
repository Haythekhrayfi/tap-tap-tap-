package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class E9 extends H9 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2112ye f13872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2112ye f13873d;

    public E9(InterfaceC2131z8 interfaceC2131z8) {
        super(interfaceC2131z8);
        this.f13872c = new C2112ye("init_event_pref_key");
        this.f13873d = new C2112ye("first_event_pref_key");
    }

    @Deprecated
    public boolean e() {
        return a(this.f13873d.a(), (String) null) != null;
    }

    @Deprecated
    public String f(String str) {
        return a(this.f13872c.a(), (String) null);
    }

    @Deprecated
    public boolean f() {
        return a(this.f13872c.a(), (String) null) != null;
    }

    @Deprecated
    public E9 g() {
        return (E9) e(this.f13873d.a());
    }

    @Deprecated
    public E9 h() {
        return (E9) e(this.f13872c.a());
    }

    @Deprecated
    public void i() {
        b(this.f13873d.a(), "DONE").c();
    }

    @Deprecated
    public void j() {
        b(this.f13872c.a(), "DONE").c();
    }
}
