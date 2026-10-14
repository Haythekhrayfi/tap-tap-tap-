package com.yandex.metrica.impl.ob;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class E3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f13864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Tm<Thread, StackTraceElement[], C1801m7> f13865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Hm f13866c;

    public class a implements c {
    }

    public class b implements Comparator<Thread> {
        public b(E3 e10) {
        }

        @Override // java.util.Comparator
        public int compare(Thread thread, Thread thread2) {
            Thread thread3 = thread;
            Thread thread4 = thread2;
            if (thread3 != thread4) {
                String name = thread3.getName();
                String name2 = thread4.getName();
                int i10 = O2.f14603a;
                if (name != null) {
                    if (name2 == null) {
                        return 1;
                    }
                    return name.compareTo(name2);
                }
                if (name2 != null) {
                    return -1;
                }
            }
            return 0;
        }
    }

    public interface c {
    }

    public E3() {
        this(new a(), new D3(), Y.g().j());
    }

    public E3(c cVar, Tm<Thread, StackTraceElement[], C1801m7> tm, Hm hm2) {
        this.f13864a = cVar;
        this.f13865b = tm;
        this.f13866c = hm2;
    }

    private List<C1801m7> a(Thread thread, Thread thread2) {
        Map<Thread, StackTraceElement[]> allStackTraces;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new b(this));
        try {
            Objects.requireNonNull((a) this.f13864a);
            allStackTraces = Thread.getAllStackTraces();
        } catch (SecurityException unused) {
            allStackTraces = null;
        }
        if (allStackTraces != null) {
            treeMap.putAll(allStackTraces);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread3 = (Thread) entry.getKey();
            if (thread3 != thread && thread3 != thread2) {
                arrayList.add(this.f13865b.a(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }

    public C1602e7 a() {
        StackTraceElement[] stackTrace;
        Objects.requireNonNull((a) this.f13864a);
        Thread thread = Looper.getMainLooper().getThread();
        try {
            stackTrace = thread.getStackTrace();
        } catch (SecurityException unused) {
            stackTrace = null;
        }
        return new C1602e7(this.f13865b.a(thread, stackTrace), a(thread, null), ((Dm) this.f13866c).b());
    }

    public List<C1801m7> a(Thread thread) {
        Objects.requireNonNull((a) this.f13864a);
        Thread thread2 = Looper.getMainLooper().getThread();
        List<C1801m7> listA = a(thread2, thread);
        if (thread != thread2) {
            StackTraceElement[] stackTrace = null;
            try {
                stackTrace = thread2.getStackTrace();
            } catch (SecurityException unused) {
            }
            ((ArrayList) listA).add(0, this.f13865b.a(thread2, stackTrace));
        }
        return listA;
    }
}
