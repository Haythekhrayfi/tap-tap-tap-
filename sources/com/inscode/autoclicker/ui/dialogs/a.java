package com.inscode.autoclicker.ui.dialogs;

import android.app.AlertDialog;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlertDialog f13330d;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    public /* synthetic */ a(AlertDialog alertDialog, int i10) {
        this.f13329c = i10;
        switch (i10) {
        }
        this.f13330d = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f13329c) {
            case 0:
                ModeSettingsDialogs.Companion.showTapDurationDialog$lambda$21$lambda$20(this.f13330d, view);
                break;
            case 1:
                this.f13330d.dismiss();
                break;
            case 2:
                this.f13330d.dismiss();
                break;
            case 3:
                ModeSettingsDialogs.Companion.showRenameDialog$lambda$7$lambda$6(this.f13330d, view);
                break;
            case 4:
                this.f13330d.dismiss();
                break;
            case 5:
                this.f13330d.dismiss();
                break;
            case 6:
                this.f13330d.dismiss();
                break;
            case 7:
                this.f13330d.dismiss();
                break;
            case 8:
                ModeSettingsDialogs.Companion.showTimeBetweenSetDialog$lambda$16$lambda$15(this.f13330d, view);
                break;
            case 9:
                ModeSettingsDialogs.Companion.showSwipeDurationDialog$lambda$26$lambda$25(this.f13330d, view);
                break;
            case 10:
                this.f13330d.dismiss();
                break;
            case 11:
                this.f13330d.dismiss();
                break;
            case 12:
                this.f13330d.dismiss();
                break;
            case 13:
                this.f13330d.dismiss();
                break;
            default:
                this.f13330d.dismiss();
                break;
        }
    }
}
