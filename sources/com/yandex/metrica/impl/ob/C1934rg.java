package com.yandex.metrica.impl.ob;

import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.rg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1934rg implements uo<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1984tg f17246a;

    public C1934rg(C1984tg c1984tg) {
        this.f17246a = c1984tg;
    }

    public so a() {
        Objects.requireNonNull(this.f17246a);
        return C1772l3.h() ? so.a(this) : so.a(this, "YandexMetrica isn't initialized. Use YandexMetrica#activate(android.content.Context, String) method to activate.");
    }

    @Override // com.yandex.metrica.impl.ob.uo
    public so a(Void r10) {
        Objects.requireNonNull(this.f17246a);
        return C1772l3.h() ? so.a(this) : so.a(this, "YandexMetrica isn't initialized. Use YandexMetrica#activate(android.content.Context, String) method to activate.");
    }
}
