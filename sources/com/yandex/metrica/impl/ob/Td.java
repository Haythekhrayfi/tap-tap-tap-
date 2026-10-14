package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Td {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I9 f15083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T1.a f15084b;

    public Td(I9 i10, T1.a aVar) {
        this.f15083a = i10;
        this.f15084b = aVar;
    }

    public long a() {
        return this.f15083a.a(this.f15084b, 0L);
    }

    public void a(int i10) {
        this.f15083a.b(this.f15084b, i10);
    }

    public void a(long j10) {
        this.f15083a.b(this.f15084b, j10);
    }

    public int b() {
        return this.f15083a.a(this.f15084b, 1);
    }
}
