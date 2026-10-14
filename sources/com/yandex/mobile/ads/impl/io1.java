package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.ImageView;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class io1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21767c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f21769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f21770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f21771g;

    public /* synthetic */ io1(in0 in0Var, Context context, List list, in0.b bVar) {
        this.f21768d = in0Var;
        this.f21769e = context;
        this.f21770f = list;
        this.f21771g = bVar;
    }

    public /* synthetic */ io1(w60 w60Var, bh1 bh1Var, wg1 wg1Var, k2 k2Var) {
        this.f21768d = w60Var;
        this.f21769e = bh1Var;
        this.f21770f = wg1Var;
        this.f21771g = k2Var;
    }

    public /* synthetic */ io1(vc.a0 a0Var, sp spVar, String str, ImageView imageView) {
        this.f21768d = a0Var;
        this.f21769e = spVar;
        this.f21770f = str;
        this.f21771g = imageView;
    }

    public /* synthetic */ io1(vc.a0 a0Var, sp spVar, String str, z7.c cVar) {
        this.f21768d = a0Var;
        this.f21769e = spVar;
        this.f21770f = str;
        this.f21771g = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21767c) {
            case 0:
                ((in0) this.f21768d).a((Context) this.f21769e, (List) this.f21770f, (in0.b) this.f21771g);
                break;
            case 1:
                sp.a((vc.a0) this.f21768d, (sp) this.f21769e, (String) this.f21770f, (z7.c) this.f21771g);
                break;
            case 2:
                sp.a((vc.a0) this.f21768d, (sp) this.f21769e, (String) this.f21770f, (ImageView) this.f21771g);
                break;
            default:
                w60.a((w60) this.f21768d, (bh1) this.f21769e, (wg1) this.f21770f, (k2) this.f21771g);
                break;
        }
    }
}
