package com.inscode.autoclicker.ui.dialogs;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import java.util.List;
import uc.l;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlertDialog f13332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f13333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f13334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f13335g;

    public /* synthetic */ b(AlertDialog alertDialog, Context context, List list, l lVar, int i10) {
        this.f13331c = i10;
        this.f13332d = alertDialog;
        this.f13333e = context;
        this.f13334f = list;
        this.f13335g = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f13331c) {
            case 0:
                ModeSettingsDialogs.Companion.showSaveAsDialog$lambda$3$lambda$1(this.f13332d, this.f13333e, this.f13334f, this.f13335g, view);
                break;
            case 1:
                ModeSettingsDialogs.Companion.showRenameDialog$lambda$7$lambda$5(this.f13332d, this.f13333e, this.f13334f, this.f13335g, view);
                break;
            default:
                ModeSettingsDialogs.Companion.showAddCombinationDialog$lambda$11$lambda$9(this.f13332d, this.f13333e, this.f13334f, this.f13335g, view);
                break;
        }
    }
}
