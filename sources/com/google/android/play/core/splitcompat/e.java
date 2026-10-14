package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f12344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f12345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f12346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f12347d;

    public e(k kVar, q qVar, Set set, AtomicBoolean atomicBoolean) {
        this.f12347d = kVar;
        this.f12344a = qVar;
        this.f12345b = set;
        this.f12346c = atomicBoolean;
    }

    @Override // com.google.android.play.core.splitcompat.h
    public final void a(ZipFile zipFile, Set<j> set) throws IOException {
        this.f12347d.a(this.f12344a, set, new d(this));
    }
}
