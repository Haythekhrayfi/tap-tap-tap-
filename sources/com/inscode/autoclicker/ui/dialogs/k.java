package com.inscode.autoclicker.ui.dialogs;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import fd.j0;
import java.util.List;
import uc.r;
import y9.q;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13374c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f13378g;

    public /* synthetic */ k(AlertDialog alertDialog, Context context, r6.e eVar, r rVar) {
        this.f13375d = alertDialog;
        this.f13376e = context;
        this.f13377f = eVar;
        this.f13378g = rVar;
    }

    public /* synthetic */ k(l8.j jVar, i8.k kVar, View view, List list) {
        this.f13375d = jVar;
        this.f13376e = kVar;
        this.f13377f = view;
        this.f13378g = list;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f13374c) {
            case 0:
                SettingsDialogs.Companion.showCreateShortcutDialog$lambda$3$lambda$1((AlertDialog) this.f13375d, (Context) this.f13376e, (r6.e) this.f13377f, (r) this.f13378g, view);
                break;
            default:
                l8.j jVar = (l8.j) this.f13375d;
                i8.k kVar = (i8.k) this.f13376e;
                View view2 = (View) this.f13377f;
                List<? extends q> list = (List) this.f13378g;
                j0.i(jVar, "this$0");
                j0.i(kVar, "$divView");
                j0.i(view2, "$target");
                jVar.c(kVar, view2, list, "click");
                break;
        }
    }
}
