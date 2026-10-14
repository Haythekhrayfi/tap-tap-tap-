package com.inscode.autoclicker.ui.dialogs;

import android.app.AlertDialog;
import android.view.View;
import uc.l;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlertDialog f13337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f13338e;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    public /* synthetic */ c(AlertDialog alertDialog, l lVar, int i10) {
        this.f13336c = i10;
        switch (i10) {
        }
        this.f13337d = alertDialog;
        this.f13338e = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f13336c) {
            case 0:
                ModeSettingsDialogs.Companion.showTapDurationDialog$lambda$21$lambda$19(this.f13337d, this.f13338e, view);
                break;
            case 1:
                ModeSettingsDialogs.Companion.showRepeatCountDialog$lambda$29$lambda$27(this.f13337d, this.f13338e, view);
                break;
            case 2:
                ModeSettingsDialogs.Companion.showTimeBetweenSetDialog$lambda$16$lambda$14(this.f13337d, this.f13338e, view);
                break;
            case 3:
                ModeSettingsDialogs.Companion.showSwipeDurationDialog$lambda$26$lambda$24(this.f13337d, this.f13338e, view);
                break;
            case 4:
                SettingsDialogs.Companion.showOrientationDialog$lambda$6$lambda$4(this.f13337d, this.f13338e, view);
                break;
            case 5:
                SettingsDialogs.Companion.showLayoutSizeDialog$lambda$9$lambda$7(this.f13337d, this.f13338e, view);
                break;
            default:
                SettingsDialogs.Companion.showPlaybackEngineDialog$lambda$12$lambda$10(this.f13337d, this.f13338e, view);
                break;
        }
    }
}
