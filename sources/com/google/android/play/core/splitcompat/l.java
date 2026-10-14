package com.google.android.play.core.splitcompat;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class l implements com.google.android.play.core.splitinstall.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SplitCompat f12359a;

    public l(SplitCompat splitCompat) {
        this.f12359a = splitCompat;
    }

    @Override // com.google.android.play.core.splitinstall.n
    public final Set<String> a() {
        return this.f12359a.c();
    }
}
