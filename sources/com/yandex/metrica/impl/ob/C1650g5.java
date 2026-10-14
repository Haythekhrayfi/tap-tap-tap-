package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C1624f4;
import com.yandex.metrica.impl.ob.InterfaceC1824n5;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.g5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1650g5<T extends InterfaceC1824n5, C extends C1624f4> extends C1500a5<T, C> {

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.g5$a */
    public class a implements C1500a5.a<T> {
        public a(C1650g5 c1650g5) {
        }

        @Override // com.yandex.metrica.impl.ob.C1500a5.a
        public boolean a(Object obj, C1744k0 c1744k0) {
            return ((InterfaceC1824n5) obj).a(c1744k0);
        }
    }

    public C1650g5(AbstractC1625f5<T> abstractC1625f5, C c10) {
        super(abstractC1625f5, c10);
    }

    public boolean a(C1744k0 c1744k0) {
        return a(c1744k0, new a(this));
    }
}
