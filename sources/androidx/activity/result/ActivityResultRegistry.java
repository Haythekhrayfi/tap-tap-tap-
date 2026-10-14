package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Random f503a = new Random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Integer, String> f504b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Integer> f505c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, d> f506d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<String> f507e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Map<String, c<?>> f508f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<String, Object> f509g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bundle f510h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class a<I> extends androidx.activity.result.b<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c.a f516b;

        public a(String str, c.a aVar) {
            this.f515a = str;
            this.f516b = aVar;
        }

        @Override // androidx.activity.result.b
        public void b(I i10, d0.d dVar) throws Exception {
            Integer num = ActivityResultRegistry.this.f505c.get(this.f515a);
            if (num != null) {
                ActivityResultRegistry.this.f507e.add(this.f515a);
                try {
                    ActivityResultRegistry.this.b(num.intValue(), this.f516b, i10, dVar);
                    return;
                } catch (Exception e10) {
                    ActivityResultRegistry.this.f507e.remove(this.f515a);
                    throw e10;
                }
            }
            StringBuilder sbA = defpackage.a.a("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            sbA.append(this.f516b);
            sbA.append(" and input ");
            sbA.append(i10);
            sbA.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
            throw new IllegalStateException(sbA.toString());
        }

        @Override // androidx.activity.result.b
        public void c() {
            ActivityResultRegistry.this.f(this.f515a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class b<I> extends androidx.activity.result.b<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c.a f519b;

        public b(String str, c.a aVar) {
            this.f518a = str;
            this.f519b = aVar;
        }

        @Override // androidx.activity.result.b
        public void b(I i10, d0.d dVar) throws Exception {
            Integer num = ActivityResultRegistry.this.f505c.get(this.f518a);
            if (num != null) {
                ActivityResultRegistry.this.f507e.add(this.f518a);
                try {
                    ActivityResultRegistry.this.b(num.intValue(), this.f519b, i10, dVar);
                    return;
                } catch (Exception e10) {
                    ActivityResultRegistry.this.f507e.remove(this.f518a);
                    throw e10;
                }
            }
            StringBuilder sbA = defpackage.a.a("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            sbA.append(this.f519b);
            sbA.append(" and input ");
            sbA.append(i10);
            sbA.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
            throw new IllegalStateException(sbA.toString());
        }

        @Override // androidx.activity.result.b
        public void c() {
            ActivityResultRegistry.this.f(this.f518a);
        }
    }

    public static class c<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.activity.result.a<O> f521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.a<?, O> f522b;

        public c(androidx.activity.result.a<O> aVar, c.a<?, O> aVar2) {
            this.f521a = aVar;
            this.f522b = aVar2;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<n> f524b = new ArrayList<>();

        public d(i iVar) {
            this.f523a = iVar;
        }
    }

    public final boolean a(int i10, int i11, Intent intent) {
        String str = this.f504b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        c<?> cVar = this.f508f.get(str);
        if (cVar == null || cVar.f521a == null || !this.f507e.contains(str)) {
            this.f509g.remove(str);
            this.f510h.putParcelable(str, new ActivityResult(i11, intent));
            return true;
        }
        cVar.f521a.a(cVar.f522b.c(i11, intent));
        this.f507e.remove(str);
        return true;
    }

    public abstract <I, O> void b(int i10, c.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i11, d0.d dVar);

    public final <I, O> androidx.activity.result.b<I> c(final String str, p pVar, final c.a<I, O> aVar, final androidx.activity.result.a<O> aVar2) {
        i lifecycle = pVar.getLifecycle();
        if (lifecycle.b().isAtLeast(i.c.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + pVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        e(str);
        d dVar = this.f506d.get(str);
        if (dVar == null) {
            dVar = new d(lifecycle);
        }
        n nVar = new n() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.n
            public void g(p pVar2, i.b bVar) {
                if (!i.b.ON_START.equals(bVar)) {
                    if (i.b.ON_STOP.equals(bVar)) {
                        ActivityResultRegistry.this.f508f.remove(str);
                        return;
                    } else {
                        if (i.b.ON_DESTROY.equals(bVar)) {
                            ActivityResultRegistry.this.f(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f508f.put(str, new c<>(aVar2, aVar));
                if (ActivityResultRegistry.this.f509g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f509g.get(str);
                    ActivityResultRegistry.this.f509g.remove(str);
                    aVar2.a(obj);
                }
                ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f510h.getParcelable(str);
                if (activityResult != null) {
                    ActivityResultRegistry.this.f510h.remove(str);
                    aVar2.a(aVar.c(activityResult.f501c, activityResult.f502d));
                }
            }
        };
        dVar.f523a.a(nVar);
        dVar.f524b.add(nVar);
        this.f506d.put(str, dVar);
        return new a(str, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> androidx.activity.result.b<I> d(String str, c.a<I, O> aVar, androidx.activity.result.a<O> aVar2) {
        e(str);
        this.f508f.put(str, new c<>(aVar2, aVar));
        if (this.f509g.containsKey(str)) {
            Object obj = this.f509g.get(str);
            this.f509g.remove(str);
            aVar2.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f510h.getParcelable(str);
        if (activityResult != null) {
            this.f510h.remove(str);
            aVar2.a(aVar.c(activityResult.f501c, activityResult.f502d));
        }
        return new b(str, aVar);
    }

    public final void e(String str) {
        if (this.f505c.get(str) != null) {
            return;
        }
        int iNextInt = this.f503a.nextInt(2147418112);
        while (true) {
            int i10 = iNextInt + 65536;
            if (!this.f504b.containsKey(Integer.valueOf(i10))) {
                this.f504b.put(Integer.valueOf(i10), str);
                this.f505c.put(str, Integer.valueOf(i10));
                return;
            }
            iNextInt = this.f503a.nextInt(2147418112);
        }
    }

    public final void f(String str) {
        Integer numRemove;
        if (!this.f507e.contains(str) && (numRemove = this.f505c.remove(str)) != null) {
            this.f504b.remove(numRemove);
        }
        this.f508f.remove(str);
        if (this.f509g.containsKey(str)) {
            StringBuilder sbA = androidx.activity.result.c.a("Dropping pending result for request ", str, ": ");
            sbA.append(this.f509g.get(str));
            Log.w("ActivityResultRegistry", sbA.toString());
            this.f509g.remove(str);
        }
        if (this.f510h.containsKey(str)) {
            StringBuilder sbA2 = androidx.activity.result.c.a("Dropping pending result for request ", str, ": ");
            sbA2.append(this.f510h.getParcelable(str));
            Log.w("ActivityResultRegistry", sbA2.toString());
            this.f510h.remove(str);
        }
        d dVar = this.f506d.get(str);
        if (dVar != null) {
            Iterator<n> it = dVar.f524b.iterator();
            while (it.hasNext()) {
                dVar.f523a.c(it.next());
            }
            dVar.f524b.clear();
            this.f506d.remove(str);
        }
    }
}
