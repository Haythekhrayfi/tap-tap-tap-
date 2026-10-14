package m7;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f33253f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m7.b f33255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f33256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f33257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference<c> f33258e;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final jc.e f33259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f33260b;

        public static final class a extends vc.l implements uc.a<d> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f33261c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar) {
                super(0);
                this.f33261c = kVar;
            }

            @Override // uc.a
            public d invoke() {
                k kVar = this.f33261c;
                return new d(kVar, kVar.f33254a, kVar.f33255b.f33238e);
            }
        }

        public b(k kVar) {
            j0.i(kVar, "this$0");
            this.f33260b = kVar;
            this.f33259a = jc.f.b(new a(kVar));
        }
    }

    public static final class c {
        public c(i.a aVar) {
            j0.i(aVar, "callback");
        }
    }

    public final class d implements Iterable<m7.a>, wc.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m7.c f33262c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Deque<m7.a> f33263d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ k f33264e;

        public static final class a implements Iterator<m7.a>, wc.a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public m7.a f33265c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Iterator<m7.a> f33266d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ d f33267e;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends m7.a> it, d dVar) {
                this.f33266d = it;
                this.f33267e = dVar;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f33266d.hasNext();
            }

            @Override // java.util.Iterator
            public m7.a next() {
                m7.a next = this.f33266d.next();
                this.f33265c = next;
                j0.h(next, "item");
                return next;
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f33266d.remove();
                m7.c cVar = this.f33267e.f33262c;
                m7.a aVar = this.f33265c;
                cVar.b(aVar == null ? null : aVar.a());
                this.f33267e.d();
            }
        }

        public d(k kVar, Context context, String str) {
            j0.i(kVar, "this$0");
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(str, "databaseName");
            this.f33264e = kVar;
            Objects.requireNonNull((m7.c.a) m7.c.f33240d);
            j0.i(context, "p0");
            j0.i(str, "p1");
            m7.c cVar = new m7.c(context, str);
            this.f33262c = cVar;
            Objects.requireNonNull(cVar);
            ArrayList arrayList = new ArrayList();
            SQLiteDatabase readableDatabase = cVar.getReadableDatabase();
            Cursor cursorQuery = null;
            try {
                cursorQuery = readableDatabase.query("items", m7.c.f33239c, null, null, null, null, null, null);
                if (cursorQuery != null) {
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(cVar.a(cursorQuery));
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                readableDatabase.close();
                ArrayDeque arrayDeque = new ArrayDeque(arrayList);
                this.f33263d = arrayDeque;
                j0.p("Reading from database, items count: ", Integer.valueOf(arrayDeque.size()));
                d();
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                readableDatabase.close();
                throw th;
            }
        }

        public final void d() {
            k kVar = this.f33264e;
            this.f33263d.isEmpty();
            int i10 = k.f33253f;
            Objects.requireNonNull(kVar);
        }

        @Override // java.lang.Iterable
        public Iterator<m7.a> iterator() {
            Iterator<m7.a> it = this.f33263d.iterator();
            j0.h(it, "itemCache.iterator()");
            return new a(it, this);
        }
    }

    public static final class e extends k9.h {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Executor executor) {
            super(executor, "SendBeacon");
            j0.i(executor, "executor");
        }

        @Override // k9.h
        public void a(RuntimeException runtimeException) {
        }
    }

    static {
        new a(null);
        TimeUnit.DAYS.toMillis(1L);
    }

    public k(Context context, m7.b bVar) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(bVar, "configuration");
        this.f33254a = context;
        this.f33255b = bVar;
        this.f33256c = new e(bVar.f33234a);
        this.f33257d = new b(this);
        this.f33258e = new AtomicReference<>(null);
    }
}
