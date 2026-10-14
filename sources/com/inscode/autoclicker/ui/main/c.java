package com.inscode.autoclicker.ui.main;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SettingsActivity f13383d;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    public /* synthetic */ c(SettingsActivity settingsActivity, int i10) {
        this.f13382c = i10;
        switch (i10) {
        }
        this.f13383d = settingsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f13382c) {
            case 0:
                SettingsActivity.initTurnOffWhenScreenOffSwitch$lambda$2(this.f13383d, view);
                break;
            case 1:
                SettingsActivity.updateUi$lambda$13(this.f13383d, view);
                break;
            case 2:
                SettingsActivity.updateUi$lambda$14(this.f13383d, view);
                break;
            case 3:
                SettingsActivity.updateUi$lambda$15(this.f13383d, view);
                break;
            case 4:
                SettingsActivity.updateUi$lambda$16(this.f13383d, view);
                break;
            case 5:
                SettingsActivity.initVolumeUpSwitch$lambda$10(this.f13383d, view);
                break;
            case 6:
                SettingsActivity.initBackgroundServiceSwitch$lambda$4(this.f13383d, view);
                break;
            case 7:
                SettingsActivity.initMainThreadSwitch$lambda$12(this.f13383d, view);
                break;
            case 8:
                SettingsActivity.initExperimentalState$lambda$7(this.f13383d, view);
                break;
            case 9:
                SettingsActivity.onCreate$lambda$0(this.f13383d, view);
                break;
            case 10:
                SettingsActivity.initModeSettingsOpen$lambda$9(this.f13383d, view);
                break;
            case 11:
                SettingsActivity.initRecordingLabel$lambda$8(this.f13383d, view);
                break;
            case 12:
                SettingsActivity.initRecordingPopupSwitch$lambda$11(this.f13383d, view);
                break;
            case 13:
                SettingsActivity.initNotifyWhenFinishedSwitch$lambda$3(this.f13383d, view);
                break;
            default:
                SettingsActivity.initTimeLeftSwitch$lambda$1(this.f13383d, view);
                break;
        }
    }
}
