package d0;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements Iterable<Intent> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<Intent> f28535c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f28536d;

    public interface a {
        Intent getSupportParentActivityIntent();
    }

    public h0(Context context) {
        this.f28536d = context;
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f28535c.iterator();
    }
}
