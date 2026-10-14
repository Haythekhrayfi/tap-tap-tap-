package a5;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements d {
    @Override // a5.d
    public <T> T a(Class<T> cls) {
        x5.b<T> bVarB = b(cls);
        if (bVarB == null) {
            return null;
        }
        return bVarB.get();
    }

    @Override // a5.d
    public <T> Set<T> d(Class<T> cls) {
        return c(cls).get();
    }
}
