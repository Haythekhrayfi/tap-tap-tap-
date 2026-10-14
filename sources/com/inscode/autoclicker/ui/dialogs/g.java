package com.inscode.autoclicker.ui.dialogs;

import android.app.AlertDialog;
import android.view.MenuItem;
import android.widget.PopupMenu;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements PopupMenu.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertDialog f13358b;

    public /* synthetic */ g(AlertDialog alertDialog, int i10) {
        this.f13357a = i10;
        if (i10 != 1) {
        }
        this.f13358b = alertDialog;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f13357a) {
            case 0:
                return ModeSettingsDialogs.Companion.showSwipeDurationDialog$lambda$26$lambda$23$lambda$22(this.f13358b, menuItem);
            case 1:
                return ModeSettingsDialogs.Companion.showTapDurationDialog$lambda$21$lambda$18$lambda$17(this.f13358b, menuItem);
            case 2:
                return ModeSettingsDialogs.Companion.showTimeBetweenSetDialog$lambda$16$lambda$13$lambda$12(this.f13358b, menuItem);
            default:
                return ModeSettingsDialogs.Companion.showPauseBeforeRepeatDialog$lambda$34$lambda$31$lambda$30(this.f13358b, menuItem);
        }
    }
}
