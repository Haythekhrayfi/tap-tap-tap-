package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
final class in0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe0 f21745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f21746b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f21747c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f21748d = a90.a().b();

    public class a implements fe0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f21749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f21750b;

        public a(ArrayList arrayList, CountDownLatch countDownLatch) {
            this.f21749a = arrayList;
            this.f21750b = countDownLatch;
        }
    }

    public interface b {
    }

    public in0(qd0 qd0Var) {
        this.f21745a = new fe0(qd0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CountDownLatch countDownLatch, List list, ve veVar, b bVar) {
        JSONArray jSONArray;
        try {
            if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                x60.c("Some of mediation networks didn't provide bidder token after timeout", new Object[0]);
            }
            veVar.b();
            synchronized (this.f21746b) {
                jSONArray = new JSONArray((Collection) list);
            }
            ((rr.a) bVar).a(jSONArray);
        } catch (InterruptedException e10) {
            x60.a(e10, "Networks bidding data collecting thread was interrupted", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(Context context, List<ce0> list, b bVar) {
        ArrayList arrayList = new ArrayList(list.size());
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        ve veVar = new ve();
        Iterator<ce0> it = list.iterator();
        while (it.hasNext()) {
            this.f21745a.a(context, it.next(), veVar, new a(arrayList, countDownLatch));
        }
        this.f21748d.execute(new jo1(this, countDownLatch, arrayList, veVar, bVar));
    }

    public final void b(Context context, List<ce0> list, b bVar) {
        this.f21747c.post(new io1(this, context, list, bVar));
    }
}
