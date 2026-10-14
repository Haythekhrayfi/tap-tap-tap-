package com.yandex.metrica.impl.ob;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class Q7 implements Vm<File, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K7 f14738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P7 f14739b;

    public Q7(K7 k10, P7 p10) {
        this.f14738a = k10;
        this.f14739b = p10;
    }

    @Override // com.yandex.metrica.impl.ob.Vm
    public String a(File file) {
        return this.f14739b.a(file, this.f14738a);
    }
}
