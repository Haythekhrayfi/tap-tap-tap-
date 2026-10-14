package com.yandex.metrica.impl.ob;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1890pl implements InterfaceC1692hm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f17143a;

    public C1890pl(Pattern pattern) {
        this.f17143a = pattern;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1692hm
    public Wl.b a() {
        return Wl.b.BAD_REGEXP_MATCHED;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1692hm
    public boolean a(Object obj) {
        return this.f17143a.matcher((String) obj).matches();
    }
}
