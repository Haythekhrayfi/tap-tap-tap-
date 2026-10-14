package com.inscode.autoclicker.ui.dialogs;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f13340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AlertDialog f13341e;

    public /* synthetic */ d(Context context, AlertDialog alertDialog, int i10) {
        this.f13339c = i10;
        if (i10 != 1) {
        }
        this.f13340d = context;
        this.f13341e = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f13339c) {
            case 0:
                ModeSettingsDialogs.Companion.showTapDurationDialog$lambda$21$lambda$18(this.f13340d, this.f13341e, view);
                break;
            case 1:
                ModeSettingsDialogs.Companion.showPauseBeforeRepeatDialog$lambda$34$lambda$31(this.f13340d, this.f13341e, view);
                break;
            case 2:
                ModeSettingsDialogs.Companion.showTimeBetweenSetDialog$lambda$16$lambda$13(this.f13340d, this.f13341e, view);
                break;
            default:
                ModeSettingsDialogs.Companion.showSwipeDurationDialog$lambda$26$lambda$23(this.f13340d, this.f13341e, view);
                break;
        }
    }
}
