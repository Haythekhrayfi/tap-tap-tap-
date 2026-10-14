package com.yandex.metrica.impl.ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Wh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I9 f15401c;

    public Wh(String str, String str2) {
        this(str, str2, P0.i().u());
    }

    public Wh(String str, String str2, I9 i10) {
        this.f15399a = str;
        this.f15400b = str2;
        this.f15401c = i10;
    }

    public String a() {
        I9 i10 = this.f15401c;
        String str = this.f15399a;
        String str2 = this.f15400b;
        Objects.requireNonNull(i10);
        return i10.a(new C2112ye(androidx.fragment.app.w.a("LAST_SOCKET_REPORT_TIMES_", str, "_", str2), null).a(), (String) null);
    }

    public void a(String str) {
        this.f15401c.a(this.f15399a, this.f15400b, str);
    }
}
