package com.yandex.metrica.impl.ob;

import java.util.LinkedList;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1600e5 extends AbstractC1625f5<AbstractC1948s5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5 f16022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1601e6 f16023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2103y5 f16024c;

    public C1600e5(C1624f4 c1624f4) {
        this.f16022a = new C5(c1624f4);
        this.f16023b = new C1601e6(c1624f4);
        this.f16024c = new C2103y5(c1624f4);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1625f5
    public C1550c5<AbstractC1948s5> a(int i10) {
        AbstractC1948s5 abstractC1948s5;
        LinkedList linkedList = new LinkedList();
        int iOrdinal = EnumC1745k1.a(i10).ordinal();
        if (iOrdinal == 1) {
            abstractC1948s5 = this.f16022a;
            linkedList.add(abstractC1948s5);
        } else if (iOrdinal == 3) {
            abstractC1948s5 = this.f16024c;
            linkedList.add(abstractC1948s5);
        } else if (iOrdinal == 40) {
            linkedList.add(this.f16023b);
            abstractC1948s5 = this.f16022a;
            linkedList.add(abstractC1948s5);
        }
        return new C1550c5<>(linkedList);
    }
}
