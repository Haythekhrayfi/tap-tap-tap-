package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ImagesContract;
import com.yandex.mobile.ads.exo.offline.DownloadRequest;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ll0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.yandex.mobile.ads.exo.offline.c f22726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<String> f22727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList<me1> f22728c;

    public ll0(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Context applicationContext = context.getApplicationContext();
        int i10 = te1.f25351c;
        fd.j0.h(applicationContext, "appContext");
        this.f22726a = te1.b(applicationContext);
        this.f22727b = new CopyOnWriteArrayList<>();
        this.f22728c = new CopyOnWriteArrayList<>();
    }

    public final void a() {
        Iterator<String> it = this.f22727b.iterator();
        while (it.hasNext()) {
            this.f22726a.a(it.next());
        }
        this.f22728c.clear();
    }

    public final void a(String str, me1 me1Var) {
        fd.j0.i(str, ImagesContract.URL);
        fd.j0.i(me1Var, "videoCacheListener");
        Uri uri = Uri.parse(str);
        String strValueOf = String.valueOf(q10.a());
        DownloadRequest downloadRequestA = new DownloadRequest.b(uri, strValueOf).a();
        this.f22728c.add(me1Var);
        this.f22727b.add(strValueOf);
        this.f22726a.a(new vi1(strValueOf, me1Var));
        this.f22726a.a(downloadRequestA);
        this.f22726a.a();
    }
}
