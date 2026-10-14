package com.inscode.autoclicker.ui.main;

import com.inscode.autoclicker.base.BaseViewModel;
import fd.j0;
import r6.k;

/* JADX INFO: loaded from: classes2.dex */
public final class MainViewModel extends BaseViewModel {
    private final q6.b rxEvents;
    private k selectedMode;
    private boolean stateEnabled;

    public MainViewModel(q6.b bVar) {
        j0.i(bVar, "rxEvents");
        this.rxEvents = bVar;
        this.selectedMode = k.NONE;
    }

    public final k[] getModes() {
        return k.values();
    }

    public final q6.b getRxEvents() {
        return this.rxEvents;
    }

    public final k getSelectedMode() {
        return this.selectedMode;
    }

    public final boolean getStateEnabled() {
        return this.stateEnabled;
    }

    public final void setSelectedMode(k kVar) {
        j0.i(kVar, "<set-?>");
        this.selectedMode = kVar;
    }

    public final void setStateEnabled(boolean z10) {
        this.stateEnabled = z10;
    }
}
