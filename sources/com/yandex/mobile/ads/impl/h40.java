package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.yandex.mobile.ads.instream.e f21304a;

    public static class a implements Comparator<rr0> {
        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        @Override // java.util.Comparator
        public final int compare(rr0 rr0Var, rr0 rr0Var2) {
            rr0 rr0Var3 = rr0Var;
            rr0 rr0Var4 = rr0Var2;
            if (rr0Var3.equals(rr0Var4)) {
                return 0;
            }
            String type = rr0Var3.a().getType();
            String type2 = rr0Var4.a().getType();
            return (!type.equals(InstreamAdBreakType.PREROLL) && (type2.equals(InstreamAdBreakType.PREROLL) || type.equals(InstreamAdBreakType.POSTROLL) || (!type2.equals(InstreamAdBreakType.POSTROLL) && rr0Var3.b() >= rr0Var4.b()))) ? 1 : -1;
        }
    }

    public h40(com.yandex.mobile.ads.instream.e eVar) {
        this.f21304a = eVar;
    }

    public final g40 a(List<w50> list) {
        w50 w50Var;
        w50 next;
        ArrayList arrayList = new ArrayList();
        ArrayList<w50> arrayList2 = new ArrayList();
        for (w50 w50Var2 : list) {
            if (InstreamAdBreakType.MIDROLL.equals(w50Var2.getType())) {
                arrayList2.add(w50Var2);
            }
        }
        for (w50 w50Var3 : arrayList2) {
            InstreamAdBreakPosition adBreakPosition = w50Var3.getAdBreakPosition();
            long value = adBreakPosition.getValue();
            if (InstreamAdBreakPosition.Type.PERCENTS.equals(adBreakPosition.getPositionType())) {
                value = (long) ((value / 100.0f) * this.f21304a.b());
            }
            arrayList.add(new rr0(w50Var3, value));
        }
        Collections.sort(arrayList, new a(0));
        Iterator<w50> it = list.iterator();
        do {
            w50Var = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!InstreamAdBreakType.PREROLL.equals(next.getType()));
        for (w50 w50Var4 : list) {
            if (InstreamAdBreakType.POSTROLL.equals(w50Var4.getType())) {
                w50Var = w50Var4;
                break;
            }
        }
        return new g40(arrayList, next, w50Var);
    }
}
