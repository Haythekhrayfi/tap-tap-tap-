package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
abstract class Zk<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Object> f15701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Wk f15702b;

    public Zk(T t10, Wk wk) {
        this.f15701a = c(t10);
        this.f15702b = wk;
    }

    private List<Object> c(T t10) {
        Pattern patternCompile;
        Pattern patternCompile2;
        ArrayList arrayList = new ArrayList();
        if (t10 == null) {
            return arrayList;
        }
        int iB = b(t10);
        List<C1617em> listA = a(t10);
        arrayList.add(new Cl(iB));
        for (C1617em c1617em : listA) {
            int iOrdinal = c1617em.f16072a.ordinal();
            InterfaceC1692hm uk = null;
            if (iOrdinal == 0) {
                uk = new Uk(c1617em.f16073b);
            } else if (iOrdinal == 1) {
                uk = new Kk(c1617em.f16073b);
            } else if (iOrdinal == 2) {
                try {
                    patternCompile = Pattern.compile(c1617em.f16073b);
                } catch (Throwable unused) {
                    patternCompile = null;
                }
                if (patternCompile != null) {
                    uk = new C1890pl(patternCompile);
                }
            } else if (iOrdinal == 3) {
                try {
                    patternCompile2 = Pattern.compile(c1617em.f16073b);
                } catch (Throwable unused2) {
                    patternCompile2 = null;
                }
                if (patternCompile2 != null) {
                    uk = new Pk(patternCompile2);
                }
            }
            if (uk != null) {
                arrayList.add(uk);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Wk a() {
        return this.f15702b;
    }

    public abstract List<C1617em> a(T t10);

    public abstract int b(T t10);

    public List<Object> b() {
        return this.f15701a;
    }

    public void d(T t10) {
        this.f15702b.a();
        this.f15701a = c(t10);
    }
}
