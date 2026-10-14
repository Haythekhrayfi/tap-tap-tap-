package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class xc0 {
    public static HashSet a(qh0 qh0Var) {
        HashSet hashSet = new HashSet();
        Iterator<qa<?>> it = qh0Var.b().iterator();
        while (it.hasNext()) {
            Object objD = it.next().d();
            if (objD instanceof vc0) {
                hashSet.add((vc0) objD);
            }
        }
        return hashSet;
    }
}
