package u3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<y3.h<?>> f36002a = Collections.newSetFromMap(new WeakHashMap());

    @Override // u3.g
    public void onDestroy() {
        Iterator it = ((ArrayList) b4.j.e(this.f36002a)).iterator();
        while (it.hasNext()) {
            ((y3.h) it.next()).onDestroy();
        }
    }

    @Override // u3.g
    public void onStart() {
        Iterator it = ((ArrayList) b4.j.e(this.f36002a)).iterator();
        while (it.hasNext()) {
            ((y3.h) it.next()).onStart();
        }
    }

    @Override // u3.g
    public void onStop() {
        Iterator it = ((ArrayList) b4.j.e(this.f36002a)).iterator();
        while (it.hasNext()) {
            ((y3.h) it.next()).onStop();
        }
    }
}
