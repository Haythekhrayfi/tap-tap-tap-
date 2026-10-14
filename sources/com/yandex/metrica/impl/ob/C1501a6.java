package com.yandex.metrica.impl.ob;

import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1501a6 extends R5<AbstractC1948s5> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC1948s5 f15734b;

    public C1501a6(Y5 y10, AbstractC1948s5 abstractC1948s5) {
        super(y10);
        this.f15734b = abstractC1948s5;
    }

    @Override // com.yandex.metrica.impl.ob.R5
    public void a(List<AbstractC1948s5> list) {
        list.add(this.f15734b);
    }
}
