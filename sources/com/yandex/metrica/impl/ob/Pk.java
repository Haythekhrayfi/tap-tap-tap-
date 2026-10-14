package com.yandex.metrica.impl.ob;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class Pk implements InterfaceC1692hm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f14730a;

    public Pk(Pattern pattern) {
        this.f14730a = pattern;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1692hm
    public Wl.b a() {
        return Wl.b.REGEXP_NOT_MATCHED;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1692hm
    public boolean a(Object obj) {
        return !this.f14730a.matcher((String) obj).matches();
    }
}
