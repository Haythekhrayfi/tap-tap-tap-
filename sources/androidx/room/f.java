package androidx.room;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class f {
    @Deprecated
    public f() {
    }

    public static <T extends g> g.a<T> a(Context context, Class<T> cls, String str) {
        if (str.trim().length() != 0) {
            return new g.a<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }
}
