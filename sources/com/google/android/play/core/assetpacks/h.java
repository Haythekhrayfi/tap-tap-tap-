package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.OnFailureListener;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class h implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OnFailureListener f12186a = new h();

    private h() {
    }

    @Override // com.google.android.play.core.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        j.f12189a.d(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
    }
}
