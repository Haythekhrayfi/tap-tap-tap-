package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.parser.offset.VastTimeOffset;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class u71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final VastTimeOffset f25568c;

    public u71(String str, String str2, @Nullable VastTimeOffset vastTimeOffset) {
        this.f25566a = str;
        this.f25567b = str2;
        this.f25568c = vastTimeOffset;
    }

    public final String a() {
        return this.f25566a;
    }

    @Nullable
    public final VastTimeOffset b() {
        return this.f25568c;
    }

    public final String c() {
        return this.f25567b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u71.class != obj.getClass()) {
            return false;
        }
        u71 u71Var = (u71) obj;
        if (!this.f25566a.equals(u71Var.f25566a) || !this.f25567b.equals(u71Var.f25567b)) {
            return false;
        }
        VastTimeOffset vastTimeOffset = this.f25568c;
        VastTimeOffset vastTimeOffset2 = u71Var.f25568c;
        return vastTimeOffset == null ? vastTimeOffset2 == null : vastTimeOffset.equals(vastTimeOffset2);
    }

    public final int hashCode() {
        int iA = z11.a(this.f25567b, this.f25566a.hashCode() * 31, 31);
        VastTimeOffset vastTimeOffset = this.f25568c;
        return iA + (vastTimeOffset != null ? vastTimeOffset.hashCode() : 0);
    }
}
