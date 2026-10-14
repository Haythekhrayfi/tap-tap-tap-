package com.inscode.autoclicker.ui.dialogs;

import android.app.AlertDialog;
import android.view.View;
import com.inscode.autoclicker.base.BaseAdapter;
import fd.j0;
import java.util.List;
import vc.a0;
import y9.q;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13351c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f13355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f13356h;

    public /* synthetic */ f(l8.j jVar, i8.k kVar, View view, q qVar, q9.b bVar) {
        this.f13352d = jVar;
        this.f13354f = kVar;
        this.f13353e = view;
        this.f13355g = qVar;
        this.f13356h = bVar;
    }

    public /* synthetic */ f(a0 a0Var, AlertDialog alertDialog, a0 a0Var2, List list, BaseAdapter baseAdapter) {
        this.f13352d = a0Var;
        this.f13353e = alertDialog;
        this.f13354f = a0Var2;
        this.f13355g = list;
        this.f13356h = baseAdapter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f13351c) {
            case 0:
                ModeSettingsDialogs.Companion.showLoadRecordingsDialog$lambda$57$lambda$51((a0) this.f13352d, (AlertDialog) this.f13353e, (a0) this.f13354f, (List) this.f13355g, (BaseAdapter) this.f13356h, view);
                break;
            default:
                l8.j jVar = (l8.j) this.f13352d;
                i8.k kVar = (i8.k) this.f13354f;
                View view2 = (View) this.f13353e;
                q qVar = (q) this.f13355g;
                q9.b bVar = (q9.b) this.f13356h;
                j0.i(jVar, "this$0");
                j0.i(kVar, "$divView");
                j0.i(view2, "$target");
                j0.i(bVar, "$overflowMenuWrapper");
                jVar.f32461b.j(kVar, view2, qVar);
                jVar.f32462c.a(qVar, kVar.getExpressionResolver());
                new y6.d(bVar).onClick(view2);
                break;
        }
    }
}
