package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.R;

/* JADX INFO: loaded from: classes3.dex */
public final class q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n7 f24330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p7 f24331b = new p7();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f24332c;

    public q7(Context context, v7 v7Var) {
        this.f24332c = context;
        this.f24330a = new n7(context, v7Var);
    }

    public final Dialog a() {
        Dialog dialog = new Dialog(this.f24332c, R.style.YandexAdsInternal_BottomAdtuneDialog);
        ViewGroup viewGroupA = this.f24330a.a();
        this.f24331b.a(viewGroupA, dialog);
        dialog.setContentView(viewGroupA);
        dialog.getWindow().setGravity(80);
        return dialog;
    }
}
