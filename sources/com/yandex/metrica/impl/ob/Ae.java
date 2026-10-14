package com.yandex.metrica.impl.ob;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Ae implements T2<Be.a, Le> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f13649a;

    public Ae(Be be2) {
        List<Be.a> list = be2.f13722b;
        fd.j0.h(list, "stateFromDisk.candidates");
        boolean z10 = false;
        if (list.isEmpty()) {
            z10 = true;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Be.a) it.next()).f13725c == E0.APP) {
                }
            }
            z10 = true;
        }
        this.f13649a = z10;
    }

    @Override // com.yandex.metrica.impl.ob.T2, uc.p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<Be.a> invoke(List<? extends Be.a> list, Le le2) {
        Be.a aVar = new Be.a(le2.f14405a, le2.f14406b, le2.f14409e);
        boolean z10 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
            } while (!(((Be.a) it.next()).f13725c == le2.f14409e));
        } else {
            z10 = false;
            break;
        }
        if (!z10 || (aVar.f13725c == E0.APP && this.f13649a)) {
            return kc.t.A(list, aVar);
        }
        return null;
    }
}
