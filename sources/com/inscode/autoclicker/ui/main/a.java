package com.inscode.autoclicker.ui.main;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MainActivity f13380d;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    public /* synthetic */ a(MainActivity mainActivity, int i10) {
        this.f13379c = i10;
        switch (i10) {
        }
        this.f13380d = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f13379c) {
            case 0:
                MainActivity.initBuyButton$lambda$16(this.f13380d, view);
                break;
            case 1:
                MainActivity.initStateButton$lambda$20(this.f13380d, view);
                break;
            case 2:
                MainActivity.initDrawer$lambda$9(this.f13380d, view);
                break;
            case 3:
                MainActivity.initDrawer$lambda$10(this.f13380d, view);
                break;
            case 4:
                MainActivity.initSettings$lambda$19(this.f13380d, view);
                break;
            case 5:
                MainActivity.initRestartApp$lambda$13(this.f13380d, view);
                break;
            default:
                MainActivity.initTutorial$lambda$17(this.f13380d, view);
                break;
        }
    }
}
