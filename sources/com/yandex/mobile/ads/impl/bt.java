package com.yandex.mobile.ads.impl;

import android.util.LruCache;

/* JADX INFO: loaded from: classes3.dex */
public final class bt extends LruCache<sc1, ft> {
    public bt(int i10) {
        super(i10);
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z10, sc1 sc1Var, ft ftVar, ft ftVar2) {
        ft ftVar3 = ftVar;
        if (ftVar3 != null) {
            ftVar3.l();
        }
    }
}
