package com.inscode.autoclicker.base;

import androidx.lifecycle.l0;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseViewModel extends l0 {
    private final nb.a disposables = new nb.a();

    public void dispose() {
        this.disposables.d();
    }

    public final nb.a getDisposables() {
        return this.disposables;
    }

    public final void launch(uc.a<? extends nb.b> aVar) {
        j0.i(aVar, "job");
        this.disposables.a(aVar.invoke());
    }

    @Override // androidx.lifecycle.l0
    public void onCleared() {
        super.onCleared();
        this.disposables.d();
    }
}
