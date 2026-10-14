package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.model.AssetPackStatus;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
final class bs extends cr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @AssetPackStatus
    public final int f11979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InputStream f11980i;

    public bs(int i10, String str, int i11, long j10, String str2, int i12, int i13, int i14, long j11, @AssetPackStatus int i15, InputStream inputStream) {
        super(i10, str);
        this.f11972a = i11;
        this.f11973b = j10;
        this.f11974c = str2;
        this.f11975d = i12;
        this.f11976e = i13;
        this.f11977f = i14;
        this.f11978g = j11;
        this.f11979h = i15;
        this.f11980i = inputStream;
    }

    public final boolean a() {
        return this.f11976e + 1 == this.f11977f;
    }
}
