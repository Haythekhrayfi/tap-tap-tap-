package com.inscode.autoclicker.ui.main;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.inscode.autoclicker.R;
import com.jakewharton.processphoenix.ProcessPhoenix;
import fd.j0;
import java.util.Objects;
import jc.w;
import k7.g;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class SettingsActivity$updateUi$3$1 extends l implements uc.l<r6.l, w> {
    public final /* synthetic */ SettingsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsActivity$updateUi$3$1(SettingsActivity settingsActivity) {
        super(1);
        this.this$0 = settingsActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(SettingsActivity settingsActivity, r6.l lVar, DialogInterface dialogInterface, int i10) {
        j0.i(settingsActivity, "this$0");
        j0.i(lVar, "$playbackEngine");
        Objects.requireNonNull(settingsActivity.getAppSettings());
        j0.i(lVar, "value");
        g.b("playback_engine", lVar);
        ProcessPhoenix.a(settingsActivity);
    }

    @Override // uc.l
    public /* bridge */ /* synthetic */ w invoke(r6.l lVar) {
        invoke2(lVar);
        return w.f31842a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final r6.l lVar) {
        j0.i(lVar, "playbackEngine");
        AlertDialog.Builder message = new AlertDialog.Builder(this.this$0).setMessage(this.this$0.getString(R.string.playback_change_desc));
        String string = this.this$0.getString(R.string.restart);
        final SettingsActivity settingsActivity = this.this$0;
        message.setPositiveButton(string, new DialogInterface.OnClickListener() { // from class: com.inscode.autoclicker.ui.main.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SettingsActivity$updateUi$3$1.invoke$lambda$0(settingsActivity, lVar, dialogInterface, i10);
            }
        }).setNegativeButton(this.this$0.getString(R.string.later), e.f13386d).create().show();
    }
}
