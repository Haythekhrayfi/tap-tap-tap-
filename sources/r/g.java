package r;

import com.android.billingclient.api.n;

/* JADX INFO: loaded from: classes.dex */
public class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f35008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35009b;

    public g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f35008a = new Object[i10];
    }

    public T a() {
        int i10 = this.f35009b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = this.f35008a;
        T t10 = (T) ((Object[]) obj)[i11];
        ((Object[]) obj)[i11] = null;
        this.f35009b = i10 - 1;
        return t10;
    }

    public boolean b(T t10) {
        int i10 = this.f35009b;
        Object[] objArr = (Object[]) this.f35008a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = t10;
        this.f35009b = i10 + 1;
        return true;
    }

    public g(n nVar, int i10) {
        this.f35008a = nVar;
        this.f35009b = i10;
    }
}
