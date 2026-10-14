package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
final class ai extends ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ag f12245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ap f12246b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(ap apVar, com.google.android.play.core.tasks.i iVar, ag agVar) {
        super(iVar);
        this.f12246b = apVar;
        this.f12245a = agVar;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        ap.a(this.f12246b, this.f12245a);
    }
}
