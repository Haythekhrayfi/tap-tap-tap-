package v1;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataSetObservable f36656a = new DataSetObservable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DataSetObserver f36657b;

    public void a(ViewGroup viewGroup, int i10, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public abstract int b();

    public int c(Object obj) {
        return -1;
    }

    public Object d(ViewGroup viewGroup, int i10) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public abstract boolean e(View view, Object obj);

    public void f(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable g() {
        return null;
    }
}
