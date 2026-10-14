package u6;

import android.database.Cursor;
import androidx.activity.i;
import androidx.room.g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import jc.w;
import lb.m;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements u6.b {
    private final s6.b __converters = new s6.b();
    private final g __db;
    private final j1.b __insertionAdapterOfManualSettings;
    private final j1.g __preparedStmtOfRemove;

    public class a extends j1.b<u6.a> {
        public a(g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "INSERT OR REPLACE INTO `manual_settings`(`name`,`repeatInterval`,`tapDuration`,`swipeDuration`,`randomizeActions`,`repeatCount`,`actionSets`,`updated`,`oneFingerMode`,`orientation`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // j1.b
        public void d(n1.g gVar, u6.a aVar) {
            u6.a aVar2 = aVar;
            if (aVar2.getName() == null) {
                ((o1.e) gVar).f33885c.bindNull(1);
            } else {
                ((o1.e) gVar).f33885c.bindString(1, aVar2.getName());
            }
            o1.e eVar = (o1.e) gVar;
            eVar.f33885c.bindLong(2, aVar2.f());
            eVar.f33885c.bindLong(3, aVar2.h());
            eVar.f33885c.bindLong(4, aVar2.g());
            eVar.f33885c.bindLong(5, aVar2.d() ? 1L : 0L);
            eVar.f33885c.bindLong(6, aVar2.e());
            eVar.f33885c.bindString(7, c.this.__converters.a(aVar2.a()));
            eVar.f33885c.bindLong(8, aVar2.i());
            eVar.f33885c.bindLong(9, aVar2.b() ? 1L : 0L);
            eVar.f33885c.bindLong(10, aVar2.c());
        }
    }

    public class b extends j1.g {
        public b(g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "DELETE FROM manual_settings WHERE name = ?";
        }
    }

    /* JADX INFO: renamed from: u6.c$c, reason: collision with other inner class name */
    public class CallableC0425c implements Callable<w> {
        public final /* synthetic */ u6.a val$settings;

        public CallableC0425c(u6.a aVar) {
            this.val$settings = aVar;
        }

        @Override // java.util.concurrent.Callable
        public w call() throws Exception {
            c.this.__db.c();
            try {
                c.this.__insertionAdapterOfManualSettings.e(this.val$settings);
                c.this.__db.p();
                return w.f31842a;
            } finally {
                c.this.__db.g();
            }
        }
    }

    public class d implements Callable<w> {
        public final /* synthetic */ String val$name;

        public d(String str) {
            this.val$name = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public w call() throws Exception {
            n1.g gVarA = c.this.__preparedStmtOfRemove.a();
            String str = this.val$name;
            if (str == null) {
                ((o1.e) gVarA).f33885c.bindNull(1);
            } else {
                ((o1.e) gVarA).f33885c.bindString(1, str);
            }
            c.this.__db.c();
            try {
                o1.f fVar = (o1.f) gVarA;
                fVar.a();
                c.this.__db.p();
                w wVar = w.f31842a;
                c.this.__db.g();
                c.this.__preparedStmtOfRemove.c(fVar);
                return wVar;
            } catch (Throwable th) {
                c.this.__db.g();
                c.this.__preparedStmtOfRemove.c(gVarA);
                throw th;
            }
        }
    }

    public class e implements Callable<List<u6.a>> {
        public final /* synthetic */ j1.f val$_statement;

        public e(j1.f fVar) {
            this.val$_statement = fVar;
        }

        @Override // java.util.concurrent.Callable
        public List<u6.a> call() throws Exception {
            boolean z10 = false;
            Cursor cursorB = l1.b.b(c.this.__db, this.val$_statement, false);
            try {
                int iK = i.k(cursorB, "name");
                int iK2 = i.k(cursorB, "repeatInterval");
                int iK3 = i.k(cursorB, "tapDuration");
                int iK4 = i.k(cursorB, "swipeDuration");
                int iK5 = i.k(cursorB, "randomizeActions");
                int iK6 = i.k(cursorB, "repeatCount");
                int iK7 = i.k(cursorB, "actionSets");
                int iK8 = i.k(cursorB, "updated");
                int iK9 = i.k(cursorB, "oneFingerMode");
                int iK10 = i.k(cursorB, "orientation");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    u6.a aVar = new u6.a();
                    aVar.k(cursorB.getString(iK));
                    int i10 = iK10;
                    ArrayList arrayList2 = arrayList;
                    aVar.p(cursorB.getLong(iK2));
                    aVar.r(cursorB.getLong(iK3));
                    aVar.q(cursorB.getLong(iK4));
                    boolean z11 = true;
                    aVar.n(cursorB.getInt(iK5) != 0 ? true : z10);
                    int i11 = iK2;
                    aVar.o(cursorB.getLong(iK6));
                    aVar.j(c.this.__converters.b(cursorB.getString(iK7)));
                    aVar.s(cursorB.getLong(iK8));
                    if (cursorB.getInt(iK9) == 0) {
                        z11 = false;
                    }
                    aVar.l(z11);
                    aVar.m(cursorB.getInt(i10));
                    arrayList2.add(aVar);
                    iK10 = i10;
                    arrayList = arrayList2;
                    iK2 = i11;
                    z10 = false;
                }
                ArrayList arrayList3 = arrayList;
                cursorB.close();
                return arrayList3;
            } catch (Throwable th) {
                cursorB.close();
                throw th;
            }
        }

        public void finalize() {
            this.val$_statement.release();
        }
    }

    public class f implements Callable<u6.a> {
        public final /* synthetic */ j1.f val$_statement;

        public f(j1.f fVar) {
            this.val$_statement = fVar;
        }

        @Override // java.util.concurrent.Callable
        public u6.a call() throws Exception {
            u6.a aVar;
            Cursor cursorB = l1.b.b(c.this.__db, this.val$_statement, false);
            try {
                int iK = i.k(cursorB, "name");
                int iK2 = i.k(cursorB, "repeatInterval");
                int iK3 = i.k(cursorB, "tapDuration");
                int iK4 = i.k(cursorB, "swipeDuration");
                int iK5 = i.k(cursorB, "randomizeActions");
                int iK6 = i.k(cursorB, "repeatCount");
                int iK7 = i.k(cursorB, "actionSets");
                int iK8 = i.k(cursorB, "updated");
                int iK9 = i.k(cursorB, "oneFingerMode");
                int iK10 = i.k(cursorB, "orientation");
                if (cursorB.moveToFirst()) {
                    aVar = new u6.a();
                    aVar.k(cursorB.getString(iK));
                    aVar.p(cursorB.getLong(iK2));
                    aVar.r(cursorB.getLong(iK3));
                    aVar.q(cursorB.getLong(iK4));
                    aVar.n(cursorB.getInt(iK5) != 0);
                    aVar.o(cursorB.getLong(iK6));
                    aVar.j(c.this.__converters.b(cursorB.getString(iK7)));
                    aVar.s(cursorB.getLong(iK8));
                    aVar.l(cursorB.getInt(iK9) != 0);
                    aVar.m(cursorB.getInt(iK10));
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    cursorB.close();
                    return aVar;
                }
                throw new j1.a("Query returned empty result set: " + this.val$_statement.f31682c);
            } catch (Throwable th) {
                cursorB.close();
                throw th;
            }
        }

        public void finalize() {
            this.val$_statement.release();
        }
    }

    public c(g gVar) {
        this.__db = gVar;
        this.__insertionAdapterOfManualSettings = new a(gVar);
        this.__preparedStmtOfRemove = new b(gVar);
    }

    @Override // u6.b
    public m<u6.a> a(String str) {
        j1.f fVarC = j1.f.c("SELECT * FROM manual_settings WHERE name = ?", 1);
        fVarC.h(1, str);
        return new wb.f(new f(fVarC));
    }

    @Override // u6.b
    public m<List<u6.a>> b() {
        return new wb.f(new e(j1.f.c("SELECT * FROM manual_settings", 0)));
    }

    @Override // u6.b
    public void c(u6.a aVar) {
        this.__db.b();
        this.__db.c();
        try {
            this.__insertionAdapterOfManualSettings.e(aVar);
            this.__db.p();
        } finally {
            this.__db.g();
        }
    }

    @Override // u6.b
    public m<w> d(u6.a aVar) {
        return new wb.f(new CallableC0425c(aVar));
    }

    @Override // u6.b
    public m<w> remove(String str) {
        return new wb.f(new d(str));
    }
}
