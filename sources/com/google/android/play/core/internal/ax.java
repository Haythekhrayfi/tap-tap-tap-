package com.google.android.play.core.internal;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
final class ax implements ay {
    @Override // com.google.android.play.core.internal.ay
    public final boolean a(Object obj, File file, File file2) {
        return new File((String) bq.a(obj.getClass(), String.class, (Class<File>) File.class, file, (Class<File>) File.class, file2)).exists();
    }
}
