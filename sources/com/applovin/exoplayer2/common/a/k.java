package com.applovin.exoplayer2.common.a;

import ch.qos.logback.core.util.FileSize;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static StringBuilder a(int i10) {
        j.a(i10, "size");
        return new StringBuilder((int) Math.min(((long) i10) * 8, FileSize.GB_COEFFICIENT));
    }

    public static boolean a(Collection<?> collection, @NullableDecl Object obj) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
