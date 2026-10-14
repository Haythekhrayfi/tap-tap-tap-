package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.base.SizeInfo;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jo1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22113c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f22116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f22117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f22118h;

    public /* synthetic */ jo1(ViewGroup viewGroup, View view, Context context, SizeInfo sizeInfo, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.f22114d = viewGroup;
        this.f22115e = view;
        this.f22116f = context;
        this.f22117g = sizeInfo;
        this.f22118h = onPreDrawListener;
    }

    public /* synthetic */ jo1(in0 in0Var, CountDownLatch countDownLatch, List list, ve veVar, in0.b bVar) {
        this.f22114d = in0Var;
        this.f22115e = countDownLatch;
        this.f22116f = list;
        this.f22117g = veVar;
        this.f22118h = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22113c) {
            case 0:
                ((in0) this.f22114d).a((CountDownLatch) this.f22115e, (List) this.f22116f, (ve) this.f22117g, (in0.b) this.f22118h);
                break;
            default:
                sg1.b((ViewGroup) this.f22114d, (View) this.f22115e, (Context) this.f22116f, (SizeInfo) this.f22117g, (ViewTreeObserver.OnPreDrawListener) this.f22118h);
                break;
        }
    }
}
