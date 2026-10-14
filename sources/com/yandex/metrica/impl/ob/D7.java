package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class D7 implements InterfaceC1605ea<C1801m7, Pf> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B7 f13799a;

    public D7() {
        this(new B7());
    }

    public D7(B7 b10) {
        this.f13799a = b10;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Pf b(C1801m7 c1801m7) {
        Pf pf = new Pf();
        Integer num = c1801m7.f16882e;
        pf.f14726f = num == null ? -1 : num.intValue();
        pf.f14725e = c1801m7.f16881d;
        pf.f14723c = c1801m7.f16879b;
        pf.f14722b = c1801m7.f16878a;
        pf.f14724d = c1801m7.f16880c;
        B7 b10 = this.f13799a;
        List<StackTraceElement> list = c1801m7.f16883f;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C1776l7((StackTraceElement) it.next()));
        }
        pf.f14727g = b10.b((List<C1776l7>) arrayList);
        return pf;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1801m7 a(Pf pf) {
        throw new UnsupportedOperationException();
    }
}
