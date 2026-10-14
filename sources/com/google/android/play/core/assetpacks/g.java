package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.OnSuccessListener;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class g implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bb f12185a;

    private g(bb bbVar) {
        this.f12185a = bbVar;
    }

    public static OnSuccessListener a(bb bbVar) {
        return new g(bbVar);
    }

    @Override // com.google.android.play.core.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f12185a.a((List<String>) obj);
    }
}
