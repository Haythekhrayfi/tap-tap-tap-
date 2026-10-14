package t6;

import android.database.Cursor;
import androidx.activity.i;
import androidx.room.g;
import com.google.gson.Gson;
import fd.j0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import jc.w;
import lb.m;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements t6.b {
    private final s6.b __converters = new s6.b();
    private final g __db;
    private final j1.b __insertionAdapterOfCombineSettings;
    private final j1.g __preparedStmtOfRemove;

    public class a extends j1.b<t6.a> {
        public a(g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "INSERT OR REPLACE INTO `combine_settings`(`name`,`recordings`,`updated`,`timeBetweenRepeat`,`orientation`,`repeatCount`) VALUES (?,?,?,?,?,?)";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // j1.b
        public void d(n1.g gVar, t6.a aVar) {
            String strG;
            t6.a aVar2 = aVar;
            if (aVar2.getName() == null) {
                ((o1.e) gVar).f33885c.bindNull(1);
            } else {
                ((o1.e) gVar).f33885c.bindString(1, aVar2.getName());
            }
            s6.b bVar = c.this.__converters;
            List<v6.a> listD = aVar2.d();
            Objects.requireNonNull(bVar);
            j0.i(listD, "list");
            try {
                strG = new Gson().g(listD);
                j0.h(strG, "gson.toJson(list)");
            } catch (Exception unused) {
                strG = "";
            }
            o1.e eVar = (o1.e) gVar;
            eVar.f33885c.bindString(2, strG);
            eVar.f33885c.bindLong(3, aVar2.g());
            eVar.f33885c.bindLong(4, aVar2.f());
            eVar.f33885c.bindLong(5, aVar2.c());
            eVar.f33885c.bindLong(6, aVar2.e());
        }
    }

    public class b extends j1.g {
        public b(g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "DELETE FROM combine_settings WHERE name = ?";
        }
    }

    /* JADX INFO: renamed from: t6.c$c, reason: collision with other inner class name */
    public class CallableC0417c implements Callable<w> {
        public final /* synthetic */ t6.a val$settings;

        public CallableC0417c(t6.a aVar) {
            this.val$settings = aVar;
        }

        @Override // java.util.concurrent.Callable
        public w call() throws Exception {
            c.this.__db.c();
            try {
                c.this.__insertionAdapterOfCombineSettings.e(this.val$settings);
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

    public class e implements Callable<List<t6.a>> {
        public final /* synthetic */ j1.f val$_statement;

        public e(j1.f fVar) {
            this.val$_statement = fVar;
        }

        @Override // java.util.concurrent.Callable
        public List<t6.a> call() throws Exception {
            Cursor cursorB = l1.b.b(c.this.__db, this.val$_statement, false);
            try {
                int iK = i.k(cursorB, "name");
                int iK2 = i.k(cursorB, "recordings");
                int iK3 = i.k(cursorB, "updated");
                int iK4 = i.k(cursorB, "timeBetweenRepeat");
                int iK5 = i.k(cursorB, "orientation");
                int iK6 = i.k(cursorB, "repeatCount");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    t6.a aVar = new t6.a();
                    aVar.h(cursorB.getString(iK));
                    aVar.j(c.this.__converters.c(cursorB.getString(iK2)));
                    aVar.m(cursorB.getLong(iK3));
                    aVar.l(cursorB.getLong(iK4));
                    aVar.i(cursorB.getInt(iK5));
                    aVar.k(cursorB.getLong(iK6));
                    arrayList.add(aVar);
                }
                cursorB.close();
                return arrayList;
            } catch (Throwable th) {
                cursorB.close();
                throw th;
            }
        }

        public void finalize() {
            this.val$_statement.release();
        }
    }

    public class f implements Callable<t6.a> {
        public final /* synthetic */ j1.f val$_statement;

        public f(j1.f fVar) {
            this.val$_statement = fVar;
        }

        @Override // java.util.concurrent.Callable
        public t6.a call() throws Exception {
            t6.a aVar;
            Cursor cursorB = l1.b.b(c.this.__db, this.val$_statement, false);
            try {
                int iK = i.k(cursorB, "name");
                int iK2 = i.k(cursorB, "recordings");
                int iK3 = i.k(cursorB, "updated");
                int iK4 = i.k(cursorB, "timeBetweenRepeat");
                int iK5 = i.k(cursorB, "orientation");
                int iK6 = i.k(cursorB, "repeatCount");
                if (cursorB.moveToFirst()) {
                    aVar = new t6.a();
                    aVar.h(cursorB.getString(iK));
                    aVar.j(c.this.__converters.c(cursorB.getString(iK2)));
                    aVar.m(cursorB.getLong(iK3));
                    aVar.l(cursorB.getLong(iK4));
                    aVar.i(cursorB.getInt(iK5));
                    aVar.k(cursorB.getLong(iK6));
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
        this.__insertionAdapterOfCombineSettings = new a(gVar);
        this.__preparedStmtOfRemove = new b(gVar);
    }

    @Override // t6.b
    public m<t6.a> a(String str) {
        j1.f fVarC = j1.f.c("SELECT * FROM combine_settings WHERE name = ?", 1);
        fVarC.h(1, str);
        return new wb.f(new f(fVarC));
    }

    @Override // t6.b
    public m<List<t6.a>> b() {
        return new wb.f(new e(j1.f.c("SELECT * FROM combine_settings", 0)));
    }

    @Override // t6.b
    public void c(t6.a aVar) {
        this.__db.b();
        this.__db.c();
        try {
            this.__insertionAdapterOfCombineSettings.e(aVar);
            this.__db.p();
        } finally {
            this.__db.g();
        }
    }

    @Override // t6.b
    public m<w> d(t6.a aVar) {
        return new wb.f(new CallableC0417c(aVar));
    }

    @Override // t6.b
    public m<w> remove(String str) {
        return new wb.f(new d(str));
    }
}
