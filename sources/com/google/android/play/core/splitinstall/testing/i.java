package com.google.android.play.core.splitinstall.testing;

import android.content.Intent;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class i implements com.google.android.play.core.splitinstall.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f12503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f12504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f12505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f12506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f12507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FakeSplitInstallManager f12508f;

    public i(FakeSplitInstallManager fakeSplitInstallManager, List list, List list2, long j10, boolean z10, List list3) {
        this.f12508f = fakeSplitInstallManager;
        this.f12503a = list;
        this.f12504b = list2;
        this.f12505c = j10;
        this.f12506d = z10;
        this.f12507e = list3;
    }

    @Override // com.google.android.play.core.splitinstall.d
    public final void a() {
        this.f12508f.f12473l.addAll(this.f12503a);
        this.f12508f.f12474m.addAll(this.f12504b);
        this.f12508f.a(5, 0, Long.valueOf(this.f12505c), Long.valueOf(this.f12505c), null, null, null);
    }

    @Override // com.google.android.play.core.splitinstall.d
    public final void a(int i10) {
        this.f12508f.a(i10);
    }

    @Override // com.google.android.play.core.splitinstall.d
    public final void b() {
        if (this.f12506d) {
            return;
        }
        this.f12508f.a((List<Intent>) this.f12507e, (List<String>) this.f12503a, (List<String>) this.f12504b, this.f12505c, true);
    }
}
