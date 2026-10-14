package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.AbstractC1675h5;
import com.yandex.metrica.impl.ob.Z3;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1700i5<T extends AbstractC1675h5, C extends Z3> extends C1500a5<T, C> {

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.i5$a */
    public class a implements C1500a5.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ H4 f16324a;

        public a(C1700i5 c1700i5, H4 h10) {
            this.f16324a = h10;
        }

        @Override // com.yandex.metrica.impl.ob.C1500a5.a
        public boolean a(Object obj, C1744k0 c1744k0) {
            return ((AbstractC1675h5) obj).a(c1744k0, this.f16324a);
        }
    }

    public C1700i5(AbstractC1625f5<T> abstractC1625f5, C c10) {
        super(abstractC1625f5, c10);
    }

    public boolean a(C1744k0 c1744k0, H4 h10) {
        return a(c1744k0, new a(this, h10));
    }
}
