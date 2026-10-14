package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class d2 {

    public static class a implements Comparator<w50> {
        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        @Override // java.util.Comparator
        public final int compare(w50 w50Var, w50 w50Var2) {
            long value = w50Var.getAdBreakPosition().getValue() - w50Var2.getAdBreakPosition().getValue();
            if (value < 0) {
                return -1;
            }
            return value > 0 ? 1 : 0;
        }
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new a(0));
        return new ArrayList(arrayList);
    }
}
