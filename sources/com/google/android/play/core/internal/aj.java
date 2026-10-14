package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
final class aj extends ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ap f12247a;

    public aj(ap apVar) {
        this.f12247a = apVar;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        if (this.f12247a.f12263l != null) {
            this.f12247a.f12254c.c("Unbind from service.", new Object[0]);
            this.f12247a.f12253b.unbindService(this.f12247a.f12262k);
            this.f12247a.f12257f = false;
            this.f12247a.f12263l = null;
            this.f12247a.f12262k = null;
        }
    }
}
