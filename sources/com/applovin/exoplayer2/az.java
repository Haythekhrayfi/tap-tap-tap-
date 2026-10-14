package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class az extends aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g.a<az> f4371a = com.applovin.exoplayer2.a.p.f3994j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f4372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f4373d;

    public az() {
        this.f4372c = false;
        this.f4373d = false;
    }

    public az(boolean z10) {
        this.f4372c = true;
        this.f4373d = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static az a(Bundle bundle) {
        com.applovin.exoplayer2.l.a.a(bundle.getInt(a(0), -1) == 3);
        return bundle.getBoolean(a(1), false) ? new az(bundle.getBoolean(a(2), false)) : new az();
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof az)) {
            return false;
        }
        az azVar = (az) obj;
        return this.f4373d == azVar.f4373d && this.f4372c == azVar.f4372c;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f4372c), Boolean.valueOf(this.f4373d));
    }
}
