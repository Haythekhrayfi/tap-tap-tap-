package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f12348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f12349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f12350c;

    public f(k kVar, Set set, q qVar) {
        this.f12350c = kVar;
        this.f12348a = set;
        this.f12349b = qVar;
    }

    @Override // com.google.android.play.core.splitcompat.h
    public final void a(ZipFile zipFile, Set<j> set) throws IOException {
        this.f12348a.addAll(k.a(this.f12350c, set, this.f12349b, zipFile));
    }
}
