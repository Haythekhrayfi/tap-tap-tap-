package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: classes2.dex */
public class SplitInstallException extends com.google.android.play.core.tasks.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SplitInstallErrorCode
    private final int f12367a;

    public SplitInstallException(@SplitInstallErrorCode int i10) {
        super(String.format("Split Install Error(%d): %s", Integer.valueOf(i10), com.google.android.play.core.splitinstall.model.a.a(i10)));
        if (i10 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
        this.f12367a = i10;
    }

    @Override // com.google.android.play.core.tasks.j
    @SplitInstallErrorCode
    public int getErrorCode() {
        return this.f12367a;
    }
}
