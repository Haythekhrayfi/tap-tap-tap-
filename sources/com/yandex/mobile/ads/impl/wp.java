package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.yandex.mobile.ads.R;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class wp implements cj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.u f26334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uk f26335b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Dialog f26339f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qp f26337d = new qp();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final mq f26338e = new mq();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final eq f26336c = new eq();

    public wp(com.yandex.mobile.ads.nativeads.u uVar, uk ukVar) {
        this.f26334a = uVar;
        this.f26335b = ukVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DialogInterface dialogInterface) {
        this.f26339f = null;
    }

    @Override // com.yandex.mobile.ads.impl.cj
    public final void a() {
        Dialog dialog = this.f26339f;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // com.yandex.mobile.ads.impl.cj
    public final void a(Context context) {
        eq eqVar = this.f26336c;
        com.yandex.mobile.ads.nativeads.u uVar = this.f26334a;
        Objects.requireNonNull(eqVar);
        yp ypVarA = eq.a(uVar);
        if (ypVarA != null) {
            Objects.requireNonNull(this.f26337d);
            y9.l1 l1VarA = qp.a(ypVarA);
            if (l1VarA != null) {
                Dialog dialog = new Dialog(context, R.style.YandexAdsInternal_FullscreenDialog);
                dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.yandex.mobile.ads.impl.hq1
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.f21489c.a(dialogInterface);
                    }
                });
                bj bjVar = new bj(new aj(dialog, this.f26335b));
                Objects.requireNonNull(this.f26338e);
                i8.k kVarA = mq.a(context);
                kVarA.setActionHandler(bjVar);
                kVarA.y(l1VarA, new o7.a(UUID.randomUUID().toString()));
                dialog.setContentView(kVarA);
                this.f26339f = dialog;
                dialog.show();
                return;
            }
        }
        this.f26335b.e();
    }
}
