package com.inscode.autoclicker.ui.main;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e f13386d = new e(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e f13387e = new e(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13388c;

    public /* synthetic */ e(int i10) {
        this.f13388c = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f13388c) {
            case 0:
                dialogInterface.dismiss();
                break;
            default:
                MainActivity.initRestartApp$lambda$13$lambda$12(dialogInterface, i10);
                break;
        }
    }
}
