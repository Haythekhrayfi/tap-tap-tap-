package com.google.android.play.core.assetpacks;

import java.io.File;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class dj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bb f12126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.core.internal.cj<w> f12127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cp f12128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.core.internal.cj<Executor> f12129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bz f12130e;

    public dj(bb bbVar, com.google.android.play.core.internal.cj<w> cjVar, cp cpVar, com.google.android.play.core.internal.cj<Executor> cjVar2, bz bzVar) {
        this.f12126a = bbVar;
        this.f12127b = cjVar;
        this.f12128c = cpVar;
        this.f12129d = cjVar2;
        this.f12130e = bzVar;
    }

    public final void a(dh dhVar) {
        File fileC = this.f12126a.c(dhVar.f12065k, dhVar.f12123a, dhVar.f12124b);
        File fileE = this.f12126a.e(dhVar.f12065k, dhVar.f12123a, dhVar.f12124b);
        if (!fileC.exists() || !fileE.exists()) {
            throw new bv(String.format("Cannot find pack files to move for pack %s.", dhVar.f12065k), dhVar.f12064j);
        }
        File fileA = this.f12126a.a(dhVar.f12065k, dhVar.f12123a, dhVar.f12124b);
        fileA.mkdirs();
        if (!fileC.renameTo(fileA)) {
            throw new bv("Cannot move merged pack files to final location.", dhVar.f12064j);
        }
        new File(this.f12126a.a(dhVar.f12065k, dhVar.f12123a, dhVar.f12124b), "merge.tmp").delete();
        File fileB = this.f12126a.b(dhVar.f12065k, dhVar.f12123a, dhVar.f12124b);
        fileB.mkdirs();
        if (!fileE.renameTo(fileB)) {
            throw new bv("Cannot move metadata files to final location.", dhVar.f12064j);
        }
        Executor executorA = this.f12129d.a();
        bb bbVar = this.f12126a;
        Objects.requireNonNull(bbVar);
        executorA.execute(di.a(bbVar));
        this.f12128c.a(dhVar.f12065k, dhVar.f12123a, dhVar.f12124b);
        this.f12130e.a(dhVar.f12065k);
        this.f12127b.a().a(dhVar.f12064j, dhVar.f12065k);
    }
}
