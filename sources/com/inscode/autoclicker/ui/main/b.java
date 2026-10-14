package com.inscode.autoclicker.ui.main;

import com.google.android.play.core.tasks.OnCompleteListener;
import com.google.android.play.core.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements jb.a.InterfaceC0327a, OnCompleteListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainActivity f13381c;

    public /* synthetic */ b(MainActivity mainActivity, int i10) {
        this.f13381c = mainActivity;
    }

    @Override // com.google.android.play.core.tasks.OnCompleteListener
    public void onComplete(Task task) {
        MainActivity.initRateApp$lambda$15$lambda$14(this.f13381c, task);
    }
}
