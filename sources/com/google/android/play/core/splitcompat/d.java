package com.google.android.play.core.splitcompat;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f12343a;

    public d(e eVar) {
        this.f12343a = eVar;
    }

    @Override // com.google.android.play.core.splitcompat.i
    public final void a(j jVar, File file, boolean z10) throws IOException {
        this.f12343a.f12345b.add(file);
        if (z10) {
            return;
        }
        this.f12343a.f12346c.set(false);
    }
}
