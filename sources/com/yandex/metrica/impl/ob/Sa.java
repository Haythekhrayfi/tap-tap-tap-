package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class Sa implements InterfaceC2131z8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2131z8 f14995a;

    public Sa(Context context, D8 d10, InterfaceC2131z8 interfaceC2131z8) {
        this.f14995a = interfaceC2131z8;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public int a(String str, int i10) {
        return this.f14995a.a(str, i10);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public long a(String str, long j10) {
        return this.f14995a.a(str, j10);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public InterfaceC2131z8 a(String str, String str2) {
        this.f14995a.a(str, str2);
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public InterfaceC2131z8 a(String str, boolean z10) {
        this.f14995a.a(str, z10);
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public Set<String> a() {
        return this.f14995a.a();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public boolean a(String str) {
        return this.f14995a.a(str);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public InterfaceC2131z8 b(String str) {
        this.f14995a.b(str);
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public InterfaceC2131z8 b(String str, int i10) {
        this.f14995a.b(str, i10);
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public InterfaceC2131z8 b(String str, long j10) {
        this.f14995a.b(str, j10);
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public String b(String str, String str2) {
        return this.f14995a.b(str, str2);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public void b() {
        this.f14995a.b();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public boolean b(String str, boolean z10) {
        return this.f14995a.b(str, z10);
    }
}
