package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
final class i<F, T> extends ai<F> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function<F, ? extends T> f4886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ai<T> f4887b;

    public i(Function<F, ? extends T> function, ai<T> aiVar) {
        this.f4886a = (Function) Preconditions.checkNotNull(function);
        this.f4887b = (ai) Preconditions.checkNotNull(aiVar);
    }

    @Override // com.applovin.exoplayer2.common.a.ai, java.util.Comparator
    public int compare(F f10, F f11) {
        return this.f4887b.compare(this.f4886a.apply(f10), this.f4886a.apply(f11));
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f4886a.equals(iVar.f4886a) && this.f4887b.equals(iVar.f4887b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f4886a, this.f4887b);
    }

    public String toString() {
        return this.f4887b + ".onResultOf(" + this.f4886a + ")";
    }
}
