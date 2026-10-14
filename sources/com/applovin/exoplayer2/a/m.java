package com.applovin.exoplayer2.a;

import com.google.android.play.core.tasks.OnCompleteListener;
import com.google.android.play.core.tasks.Task;
import com.yandex.mobile.ads.impl.r80;
import com.yandex.mobile.ads.impl.x8;
import fd.j0;
import java.util.Objects;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements com.applovin.exoplayer2.l.p.a, r80.a, OnCompleteListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3978c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f3980e;

    public /* synthetic */ m(long j10, com.zipoapps.premiumhelper.ui.rate.c.a aVar) {
        this.f3980e = j10;
        this.f3979d = aVar;
    }

    public /* synthetic */ m(b.a aVar, long j10) {
        this.f3979d = aVar;
        this.f3980e = j10;
    }

    public /* synthetic */ m(x8.a aVar, long j10) {
        this.f3979d = aVar;
        this.f3980e = j10;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public void invoke(Object obj) {
        switch (this.f3978c) {
            case 0:
                ((b) obj).a((b.a) this.f3979d, this.f3980e);
                break;
            default:
                long j10 = this.f3980e;
                Objects.requireNonNull((x8) obj);
                break;
        }
    }

    @Override // com.google.android.play.core.tasks.OnCompleteListener
    public void onComplete(Task task) {
        long j10 = this.f3980e;
        com.zipoapps.premiumhelper.ui.rate.c.a aVar = (com.zipoapps.premiumhelper.ui.rate.c.a) this.f3979d;
        KProperty<Object>[] kPropertyArr = com.zipoapps.premiumhelper.ui.rate.c.f28360d;
        j0.i(task, "it");
        com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c enumC0239c = System.currentTimeMillis() - j10 > 2000 ? com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.IN_APP_REVIEW : com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.NONE;
        if (aVar != null) {
            aVar.a(enumC0239c, false);
        }
    }
}
