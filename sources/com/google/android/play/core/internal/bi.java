package com.google.android.play.core.internal;

import java.io.File;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class bi implements be {
    @Override // com.google.android.play.core.internal.be
    public final Object[] a(Object obj, List<File> list, List<IOException> list2) {
        return (Object[]) bq.a(obj, "makePathElements", Object[].class, (Class<List<File>>) List.class, list);
    }
}
