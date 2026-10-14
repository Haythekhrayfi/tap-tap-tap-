package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uj<T extends View> implements k9<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<k9<T>> f25668a;

    public uj(List<k9<T>> list) {
        this.f25668a = list;
    }

    @Override // com.yandex.mobile.ads.impl.k9
    public final void a(T t10) {
        Iterator<k9<T>> it = this.f25668a.iterator();
        while (it.hasNext()) {
            it.next().a(t10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.k9
    public final void cancel() {
        Iterator<k9<T>> it = this.f25668a.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
