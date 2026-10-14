package com.yandex.metrica.impl.ob;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class E7 implements InterfaceC1605ea<C1826n7, Qf> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B7 f13867a;

    public E7() {
        this(new B7());
    }

    public E7(B7 b10) {
        this.f13867a = b10;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Qf b(C1826n7 c1826n7) {
        Qf qf = new Qf();
        String strB = c1826n7.b();
        if (strB == null) {
            strB = "";
        }
        qf.f14781b = strB;
        String strC = c1826n7.c();
        qf.f14782c = strC != null ? strC : "";
        qf.f14783d = this.f13867a.b(c1826n7.d());
        if (c1826n7.a() != null) {
            qf.f14784e = b(c1826n7.a());
        }
        List<C1826n7> listE = c1826n7.e();
        int i10 = 0;
        if (listE == null) {
            qf.f14785f = new Qf[0];
        } else {
            qf.f14785f = new Qf[listE.size()];
            Iterator<C1826n7> it = listE.iterator();
            while (it.hasNext()) {
                qf.f14785f[i10] = b(it.next());
                i10++;
            }
        }
        return qf;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1826n7 a(Qf qf) {
        throw new UnsupportedOperationException();
    }
}
