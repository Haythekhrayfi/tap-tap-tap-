package com.yandex.metrica.rtm.wrapper;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.rtm.service.EventToReporterProxy;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class f implements ea.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EventToReporterProxy f18126a;

    public f(ea.d dVar, Context context, Executor executor, ea.e eVar) {
        this.f18126a = new EventToReporterProxy(new a(dVar), context, executor, new c());
    }

    @Override // ea.c
    public void reportData(Bundle bundle) {
        try {
            this.f18126a.reportData(bundle);
        } catch (Throwable unused) {
        }
    }
}
