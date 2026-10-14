package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.InterfaceC1723j4;
import java.util.Iterator;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1500a5<T, C extends InterfaceC1723j4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1625f5<T> f15733a;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.a5$a */
    public interface a<T> {
        boolean a(T t10, C1744k0 c1744k0);
    }

    public C1500a5(AbstractC1625f5<T> abstractC1625f5, C c10) {
        this.f15733a = abstractC1625f5;
    }

    public boolean a(C1744k0 c1744k0, a<T> aVar) {
        Iterator<? extends T> it = this.f15733a.a(c1744k0.n()).a().iterator();
        while (it.hasNext()) {
            if (aVar.a(it.next(), c1744k0)) {
                return true;
            }
        }
        return false;
    }
}
