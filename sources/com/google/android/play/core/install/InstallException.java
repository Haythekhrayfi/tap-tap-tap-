package com.google.android.play.core.install;

import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.tasks.j;

/* JADX INFO: loaded from: classes2.dex */
public class InstallException extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InstallErrorCode
    private final int f12232a;

    public InstallException(@InstallErrorCode int i10) {
        super(String.format("Install Error(%d): %s", Integer.valueOf(i10), com.google.android.play.core.install.model.a.a(i10)));
        if (i10 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
        this.f12232a = i10;
    }

    @Override // com.google.android.play.core.tasks.j
    @InstallErrorCode
    public int getErrorCode() {
        return this.f12232a;
    }
}
