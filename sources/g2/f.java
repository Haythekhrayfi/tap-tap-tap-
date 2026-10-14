package g2;

import android.database.Cursor;

/* JADX INFO: loaded from: classes.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.room.g f29722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1.b<d> f29723b;

    public class a extends j1.b<d> {
        public a(f fVar, androidx.room.g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // j1.b
        public void d(n1.g gVar, d dVar) {
            d dVar2 = dVar;
            String str = dVar2.f29720a;
            if (str == null) {
                ((o1.e) gVar).f33885c.bindNull(1);
            } else {
                ((o1.e) gVar).f33885c.bindString(1, str);
            }
            Long l10 = dVar2.f29721b;
            if (l10 == null) {
                ((o1.e) gVar).f33885c.bindNull(2);
            } else {
                ((o1.e) gVar).f33885c.bindLong(2, l10.longValue());
            }
        }
    }

    public f(androidx.room.g gVar) {
        this.f29722a = gVar;
        this.f29723b = new a(this, gVar);
    }

    public Long a(String str) {
        j1.f fVarC = j1.f.c("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            fVarC.g(1);
        } else {
            fVarC.h(1, str);
        }
        this.f29722a.b();
        Long lValueOf = null;
        Cursor cursorC = l1.b.c(this.f29722a, fVarC, false, null);
        try {
            if (cursorC.moveToFirst() && !cursorC.isNull(0)) {
                lValueOf = Long.valueOf(cursorC.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorC.close();
            fVarC.release();
        }
    }

    public void b(d dVar) {
        this.f29722a.b();
        this.f29722a.c();
        try {
            this.f29723b.e(dVar);
            this.f29722a.p();
        } finally {
            this.f29722a.g();
        }
    }
}
