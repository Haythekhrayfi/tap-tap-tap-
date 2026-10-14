package u3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<g> f35970a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f35971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35972c;

    @Override // u3.f
    public void a(g gVar) {
        this.f35970a.add(gVar);
        if (this.f35972c) {
            gVar.onDestroy();
        } else if (this.f35971b) {
            gVar.onStart();
        } else {
            gVar.onStop();
        }
    }

    @Override // u3.f
    public void b(g gVar) {
        this.f35970a.remove(gVar);
    }

    public void c() {
        this.f35972c = true;
        Iterator it = ((ArrayList) b4.j.e(this.f35970a)).iterator();
        while (it.hasNext()) {
            ((g) it.next()).onDestroy();
        }
    }

    public void d() {
        this.f35971b = true;
        Iterator it = ((ArrayList) b4.j.e(this.f35970a)).iterator();
        while (it.hasNext()) {
            ((g) it.next()).onStart();
        }
    }

    public void e() {
        this.f35971b = false;
        Iterator it = ((ArrayList) b4.j.e(this.f35970a)).iterator();
        while (it.hasNext()) {
            ((g) it.next()).onStop();
        }
    }
}
