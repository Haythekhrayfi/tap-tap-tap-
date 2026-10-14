package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.model.AssetPackErrorCode;

/* JADX INFO: loaded from: classes2.dex */
public class AssetPackException extends com.google.android.play.core.tasks.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @AssetPackErrorCode
    private final int f11807a;

    public AssetPackException(@AssetPackErrorCode int i10) {
        super(String.format("Asset Pack Download Error(%d): %s", Integer.valueOf(i10), com.google.android.play.core.assetpacks.model.a.a(i10)));
        if (i10 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
        this.f11807a = i10;
    }

    @Override // com.google.android.play.core.tasks.j
    @AssetPackErrorCode
    public int getErrorCode() {
        return this.f11807a;
    }
}
