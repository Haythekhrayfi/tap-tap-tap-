package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class T7 implements N7<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1848o4 f15073a;

    public T7(C1848o4 c1848o4) {
        this.f15073a = c1848o4;
    }

    @Override // com.yandex.metrica.impl.ob.N7
    public void a(String str) {
        this.f15073a.a(J0.b(str, Im.g()));
    }

    @Override // com.yandex.metrica.impl.ob.N7
    public void b(String str) {
        this.f15073a.a(J0.a(str, Im.g()));
    }
}
