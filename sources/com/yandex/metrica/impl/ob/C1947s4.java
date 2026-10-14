package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.InterfaceC1723j4;
import com.yandex.metrica.impl.ob.InterfaceC1798m4;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.s4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1947s4<COMPONENT extends InterfaceC1798m4 & InterfaceC1723j4> implements InterfaceC1674h4<C1922r4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I4<COMPONENT> f17277a;

    public C1947s4(I4<COMPONENT> i10) {
        this.f17277a = i10;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1674h4
    public InterfaceC1773l4 a(Context context, C1549c4 c1549c4, X3 x10) {
        return new C1922r4(context, c1549c4, x10, new C2052w4(x10.f15447b), this.f17277a, new C1574d4(), Fi.a());
    }
}
