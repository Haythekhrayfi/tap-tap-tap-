package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1721j2 extends U1<C1911qh> {
    private final Pn<byte[]> A;
    private final Im B;
    private C1736jh C;
    private final I8 D;
    private final W0 E;
    private int F;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C1624f4 f16371r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Map<String, String> f16372s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private C1687hh f16373t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Vf f16374u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C1976t8 f16375v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List<Long> f16376w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f16377x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f16378y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private b f16379z;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.j2$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Vf.d f16380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final A.a f16381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f16382c;

        public a(Vf.d dVar, A.a aVar, boolean z10) {
            this.f16380a = dVar;
            this.f16381b = aVar;
            this.f16382c = z10;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.j2$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Vf.d> f16383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<Long> f16384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final JSONObject f16385c;

        public b(List<Vf.d> list, List<Long> list2, JSONObject jSONObject) {
            this.f16383a = list;
            this.f16384b = list2;
            this.f16385c = jSONObject;
        }
    }

    public C1721j2(C1624f4 c1624f4) {
        this(c1624f4, c1624f4.i(), c1624f4.q(), c1624f4.w());
    }

    public C1721j2(C1624f4 c1624f4, Im im, C1976t8 c1976t8, C1911qh c1911qh, I8 i10, Dn dn, W0 w10) {
        super(c1911qh);
        this.f16372s = new LinkedHashMap();
        this.f16377x = 0;
        this.f16378y = -1;
        this.f16371r = c1624f4;
        this.f16375v = c1976t8;
        this.B = im;
        this.A = dn;
        this.D = i10;
        this.E = w10;
    }

    private C1721j2(C1624f4 c1624f4, C1976t8 c1976t8, Im im, I8 i10) {
        this(c1624f4, im, c1976t8, new C1911qh(), i10, new Dn(1024000, "event value in ReportTask", im), Oh.a());
    }

    private void a(boolean z10) {
        this.D.c(this.F);
        Vf.d[] dVarArr = this.f16374u.f15235b;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            try {
                Vf.d dVar = dVarArr[i10];
                this.f16375v.a(this.f16376w.get(i10).longValue(), C1572d2.a(dVar.f15270c.f15305d).a(), dVar.f15271d.length, z10);
                int i11 = C1572d2.f15904e;
            } catch (Throwable unused) {
            }
        }
        this.f16375v.a(this.f16371r.u().a());
    }

    private Vf.a[] a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        Vf.a[] aVarArr = new Vf.a[length];
        Iterator<String> itKeys = jSONObject.keys();
        int i10 = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Vf.a aVar = new Vf.a();
                aVar.f15241b = next;
                aVar.f15242c = jSONObject.getString(next);
                aVarArr[i10] = aVar;
            } catch (Throwable unused) {
            }
            i10++;
        }
        return aVarArr;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean A() {
        return super.A() & (!m());
    }

    @Override // com.yandex.metrica.impl.ob.U1
    public void C() {
        a(false);
    }

    @Override // com.yandex.metrica.impl.ob.U1
    public void D() {
        a(true);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00ee  */
    public a a(long j10, Vf.d.b bVar, C1736jh c1736jh, List<Throwable> list, int i10) {
        Cursor cursorB;
        a aVar;
        boolean z10;
        Vf.d.a aVarA;
        int iA;
        Vf.d dVar = new Vf.d();
        dVar.f15269b = j10;
        dVar.f15270c = bVar;
        try {
            cursorB = this.f16375v.b(j10, C1572d2.a(bVar.f15305d));
            try {
                if (cursorB != null) {
                    ArrayList arrayList = new ArrayList();
                    A.a aVar2 = null;
                    while (true) {
                        z10 = true;
                        if (cursorB.moveToNext()) {
                            ContentValues contentValues = new ContentValues();
                            try {
                                C1694i.a(cursorB, contentValues);
                            } catch (Throwable unused) {
                            }
                            try {
                                Xe xe2 = new Xe(contentValues);
                                try {
                                    aVarA = C1572d2.a(xe2.f15493j).a(xe2, c1736jh);
                                } catch (Throwable th) {
                                    th = th;
                                    list.add(th);
                                    aVarA = null;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            if (aVarA != null) {
                                String asString = contentValues.getAsString("app_environment");
                                if (asString == null) {
                                    asString = "";
                                }
                                Long asLong = contentValues.getAsLong("app_environment_revision");
                                if (asLong == null) {
                                    asLong = 0L;
                                }
                                A.a aVar3 = new A.a(asString, asLong.longValue());
                                if (aVar2 != null) {
                                    if (!aVar2.equals(aVar3)) {
                                        break;
                                    }
                                    break;
                                }
                                if (this.f16378y < 0) {
                                    try {
                                        Vf.a[] aVarArrA = a(new JSONObject(aVar3.f13617a));
                                        if (aVarArrA != null) {
                                            iA = 0;
                                            for (Vf.a aVar4 : aVarArrA) {
                                                iA += C1519b.a(7, aVar4);
                                            }
                                        } else {
                                            iA = 0;
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                    this.f16378y = iA;
                                    this.f16377x += iA;
                                }
                                aVar2 = aVar3;
                                byte[] bArrA = this.A.a(aVarA.f15277f);
                                byte[] bArr = aVarA.f15277f;
                                if (bArr != bArrA) {
                                    aVarA.f15282k = ((bArr == null ? 0 : bArr.length) - (bArrA == null ? 0 : bArrA.length)) + aVarA.f15282k;
                                    aVarA.f15277f = bArrA;
                                }
                                this.f16377x += C1519b.a(3, aVarA);
                                if (arrayList.isEmpty() && i10 == 0) {
                                    if (this.f16377x < 1048576) {
                                        z10 = false;
                                    }
                                } else if (this.f16377x < 250880) {
                                    z10 = false;
                                }
                                if (z10) {
                                }
                            }
                            arrayList.add(aVarA);
                        }
                        z10 = false;
                        break;
                    }
                    if (arrayList.size() > 0) {
                        dVar.f15271d = (Vf.d.a[]) arrayList.toArray(new Vf.d.a[arrayList.size()]);
                        aVar = new a(dVar, aVar2, z10);
                    }
                    U2.a(cursorB);
                    return aVar;
                }
                this.E.d("protobuf_serialization_error", "no reports cursor for session: " + dVar);
                aVar = null;
                U2.a(cursorB);
                return aVar;
            } catch (Throwable th3) {
                th = th3;
                try {
                    list.add(th);
                    return null;
                } finally {
                    U2.a(cursorB);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            cursorB = null;
        }
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public String a() {
        return C1721j2.class.getName() + "_" + this.f16371r.e().a();
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void a(Uri.Builder builder) {
        ((C1911qh) this.f15044j).a(builder, this.C);
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public T1.a b() {
        return T1.a.REPORT;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void b(Throwable th) {
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public Ci j() {
        return this.f16371r.m().r();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0237  */
    /* JADX WARN: Code duplicated, block: B:18:0x008d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x008e  */
    /* JADX WARN: Code duplicated, block: B:90:0x01db A[LOOP:2: B:88:0x01d5->B:90:0x01db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x01f4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:95:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:97:0x0224  */
    @Override // com.yandex.metrica.impl.ob.T1
    public boolean o() throws Throwable {
        C1687hh c1687hh;
        List<String> listE;
        JSONObject jSONObject;
        Iterator it;
        String str;
        String strX;
        String str2;
        String strG;
        Cursor cursor;
        Cursor cursor2;
        int iIntValue;
        List<ContentValues> listB = this.f16371r.i().b();
        if (listB.isEmpty()) {
            return false;
        }
        ContentValues contentValues = listB.get(0);
        this.f16372s.clear();
        for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
            this.f16372s.put(entry.getKey(), entry.getValue().toString());
        }
        String asString = contentValues.getAsString("report_request_parameters");
        if (!TextUtils.isEmpty(asString)) {
            try {
                C1687hh c1687hh2 = new C1687hh(new C2120ym.a(asString));
                this.f16373t = c1687hh2;
                ((C1911qh) this.f15044j).a(c1687hh2);
            } catch (Throwable unused) {
                c1687hh = new C1687hh();
                this.f16373t = c1687hh;
                ((C1911qh) this.f15044j).a(c1687hh);
            }
            C1736jh c1736jhM = this.f16371r.m();
            this.C = c1736jhM;
            listE = c1736jhM.E();
            if (U2.b(listE)) {
                return false;
            }
            a(this.C.N());
            if (this.C.T() || U2.b(c())) {
                return false;
            }
            Cursor cursor3 = null;
            this.f16376w = null;
            C1736jh c1736jh = this.C;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONObject jSONObject2 = new JSONObject();
            ArrayList arrayList3 = new ArrayList();
            int i10 = 1;
            try {
                Cursor cursorA = this.f16375v.a(this.f16372s);
                if (cursorA != null) {
                    A.a aVar = null;
                    jSONObject = jSONObject2;
                    while (true) {
                        try {
                            if (cursorA.moveToNext()) {
                                ContentValues contentValues2 = new ContentValues();
                                try {
                                    C1694i.a(cursorA, contentValues2);
                                } catch (Throwable unused2) {
                                }
                                Long asLong = contentValues2.getAsLong(FacebookMediationAdapter.KEY_ID);
                                if (asLong == null) {
                                    try {
                                        this.E.d("protobuf_serialization_error", "no session_id in values: " + contentValues2.toString());
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor3 = cursorA;
                                        jSONObject2 = jSONObject;
                                        cursor = cursor3;
                                        jSONObject = jSONObject2;
                                        try {
                                            arrayList3.add(th);
                                            U2.a(cursor);
                                            JSONObject jSONObject3 = jSONObject;
                                            it = arrayList3.iterator();
                                            while (it.hasNext()) {
                                                this.E.reportError("protobuf_serialization_error", (Throwable) it.next());
                                            }
                                            this.f16379z = new b(arrayList, arrayList2, jSONObject3);
                                            if (arrayList.isEmpty()) {
                                                return false;
                                            }
                                            int i11 = this.D.i() + 1;
                                            this.F = i11;
                                            ((C1911qh) this.f15044j).a(i11);
                                            b bVar = this.f16379z;
                                            Vf vf = new Vf();
                                            Vf.c cVar = new Vf.c();
                                            str = this.f16373t.f16287b;
                                            strX = this.C.x();
                                            if (TextUtils.isEmpty(str)) {
                                                str = strX;
                                            }
                                            cVar.f15252b = str;
                                            str2 = this.f16373t.f16286a;
                                            strG = this.C.g();
                                            if (TextUtils.isEmpty(str2)) {
                                                str2 = strG;
                                            }
                                            cVar.f15253c = str2;
                                            this.f16377x = C1519b.a(4, cVar) + this.f16377x;
                                            vf.f15236c = cVar;
                                            P0.i().w().a(new C1697i2(this, vf));
                                            List<Vf.d> list = bVar.f16383a;
                                            vf.f15235b = (Vf.d[]) list.toArray(new Vf.d[list.size()]);
                                            vf.f15237d = a(bVar.f16385c);
                                            vf.f15239f = (String[]) listE.toArray(new String[listE.size()]);
                                            this.f16377x = C1519b.c(8) + this.f16377x;
                                            this.f16374u = vf;
                                            this.f16376w = this.f16379z.f16384b;
                                            c(AbstractC1594e.a(vf));
                                            return true;
                                        } catch (Throwable th2) {
                                            U2.a(cursor);
                                            throw th2;
                                        }
                                    }
                                } else {
                                    Integer asInteger = contentValues2.getAsInteger("type");
                                    EnumC2129z6 enumC2129z6 = EnumC2129z6.FOREGROUND;
                                    if (asInteger != null && (iIntValue = asInteger.intValue()) != 0 && iIntValue == i10) {
                                        enumC2129z6 = EnumC2129z6.BACKGROUND;
                                    }
                                    Vf.f fVarA = C1572d2.a(contentValues2);
                                    int iA = C1572d2.a(enumC2129z6);
                                    String strL = c1736jh.l();
                                    Vf.d.b bVar2 = new Vf.d.b();
                                    bVar2.f15303b = fVarA;
                                    bVar2.f15304c = strL;
                                    bVar2.f15305d = iA;
                                    int iB = this.f16377x + C1519b.b(i10, RecyclerView.FOREVER_NS);
                                    this.f16377x = iB;
                                    int iA2 = iB + C1519b.a(2, bVar2);
                                    this.f16377x = iA2;
                                    if (iA2 < 250880) {
                                        A.a aVar2 = aVar;
                                        cursor2 = cursorA;
                                        try {
                                            a aVarA = a(asLong.longValue(), bVar2, c1736jh, arrayList3, arrayList.size());
                                            if (aVarA != null) {
                                                if (aVar2 == null) {
                                                    aVar = aVarA.f16381b;
                                                } else if (aVar2.equals(aVarA.f16381b)) {
                                                    aVar = aVar2;
                                                } else {
                                                    jSONObject2 = jSONObject;
                                                    jSONObject = jSONObject2;
                                                }
                                                arrayList2.add(asLong);
                                                arrayList.add(aVarA.f16380a);
                                                if (!TextUtils.isEmpty(aVarA.f16381b.f13617a)) {
                                                    jSONObject = new JSONObject(aVarA.f16381b.f13617a);
                                                }
                                                try {
                                                    if (aVarA.f16382c) {
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    cursor = cursor2;
                                                    arrayList3.add(th);
                                                    U2.a(cursor);
                                                }
                                            } else {
                                                aVar = aVar2;
                                            }
                                            cursorA = cursor2;
                                            i10 = 1;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            jSONObject2 = jSONObject;
                                            cursor3 = cursor2;
                                            cursor = cursor3;
                                            jSONObject = jSONObject2;
                                            arrayList3.add(th);
                                            U2.a(cursor);
                                            JSONObject jSONObject4 = jSONObject;
                                            it = arrayList3.iterator();
                                            while (it.hasNext()) {
                                                this.E.reportError("protobuf_serialization_error", (Throwable) it.next());
                                            }
                                            this.f16379z = new b(arrayList, arrayList2, jSONObject4);
                                            if (arrayList.isEmpty()) {
                                                return false;
                                            }
                                            int i12 = this.D.i() + 1;
                                            this.F = i12;
                                            ((C1911qh) this.f15044j).a(i12);
                                            b bVar3 = this.f16379z;
                                            Vf vf2 = new Vf();
                                            Vf.c cVar2 = new Vf.c();
                                            str = this.f16373t.f16287b;
                                            strX = this.C.x();
                                            if (TextUtils.isEmpty(str)) {
                                                str = strX;
                                            }
                                            cVar2.f15252b = str;
                                            str2 = this.f16373t.f16286a;
                                            strG = this.C.g();
                                            if (TextUtils.isEmpty(str2)) {
                                                str2 = strG;
                                            }
                                            cVar2.f15253c = str2;
                                            this.f16377x = C1519b.a(4, cVar2) + this.f16377x;
                                            vf2.f15236c = cVar2;
                                            P0.i().w().a(new C1697i2(this, vf2));
                                            List<Vf.d> list2 = bVar3.f16383a;
                                            vf2.f15235b = (Vf.d[]) list2.toArray(new Vf.d[list2.size()]);
                                            vf2.f15237d = a(bVar3.f16385c);
                                            vf2.f15239f = (String[]) listE.toArray(new String[listE.size()]);
                                            this.f16377x = C1519b.c(8) + this.f16377x;
                                            this.f16374u = vf2;
                                            this.f16376w = this.f16379z.f16384b;
                                            c(AbstractC1594e.a(vf2));
                                            return true;
                                        }
                                    }
                                    U2.a(cursor2);
                                }
                            }
                            cursor2 = cursorA;
                            jSONObject2 = jSONObject;
                            jSONObject = jSONObject2;
                            U2.a(cursor2);
                        } catch (Throwable th5) {
                            th = th5;
                            cursor2 = cursorA;
                        }
                    }
                } else {
                    cursor2 = cursorA;
                    try {
                        this.E.d("protobuf_serialization_error", "no sessions cursor");
                        jSONObject = jSONObject2;
                        U2.a(cursor2);
                    } catch (Throwable th6) {
                        th = th6;
                        cursor3 = cursor2;
                        cursor = cursor3;
                        jSONObject = jSONObject2;
                        arrayList3.add(th);
                        U2.a(cursor);
                    }
                }
            } catch (Throwable th7) {
                th = th7;
            }
            JSONObject jSONObject5 = jSONObject;
            it = arrayList3.iterator();
            while (it.hasNext()) {
                this.E.reportError("protobuf_serialization_error", (Throwable) it.next());
            }
            this.f16379z = new b(arrayList, arrayList2, jSONObject5);
            if (arrayList.isEmpty()) {
                return false;
            }
            int i13 = this.D.i() + 1;
            this.F = i13;
            ((C1911qh) this.f15044j).a(i13);
            b bVar4 = this.f16379z;
            Vf vf3 = new Vf();
            Vf.c cVar3 = new Vf.c();
            str = this.f16373t.f16287b;
            strX = this.C.x();
            if (TextUtils.isEmpty(str)) {
                str = strX;
            }
            cVar3.f15252b = str;
            str2 = this.f16373t.f16286a;
            strG = this.C.g();
            if (TextUtils.isEmpty(str2)) {
                str2 = strG;
            }
            cVar3.f15253c = str2;
            this.f16377x = C1519b.a(4, cVar3) + this.f16377x;
            vf3.f15236c = cVar3;
            P0.i().w().a(new C1697i2(this, vf3));
            List<Vf.d> list3 = bVar4.f16383a;
            vf3.f15235b = (Vf.d[]) list3.toArray(new Vf.d[list3.size()]);
            vf3.f15237d = a(bVar4.f16385c);
            vf3.f15239f = (String[]) listE.toArray(new String[listE.size()]);
            this.f16377x = C1519b.c(8) + this.f16377x;
            this.f16374u = vf3;
            this.f16376w = this.f16379z.f16384b;
            c(AbstractC1594e.a(vf3));
            return true;
        }
        c1687hh = new C1687hh();
        this.f16373t = c1687hh;
        ((C1911qh) this.f15044j).a(c1687hh);
        C1736jh c1736jhM2 = this.f16371r.m();
        this.C = c1736jhM2;
        listE = c1736jhM2.E();
        if (U2.b(listE)) {
            return false;
        }
        a(this.C.N());
        if (this.C.T()) {
        }
        return false;
    }

    @Override // com.yandex.metrica.impl.ob.U1, com.yandex.metrica.impl.ob.T1
    public boolean r() {
        boolean zR = super.r();
        if (zR && this.B.c()) {
            for (int i10 = 0; i10 < this.f16379z.f16383a.size(); i10++) {
                this.B.a(this.f16379z.f16383a.get(i10), "Event sent");
            }
        }
        return zR;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void t() {
        this.f16371r.l().c();
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean v() {
        this.f16371r.l().a();
        return true;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void w() {
        this.f16371r.i().a();
        this.f16371r.l().b();
        super.w();
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void x() {
        this.f16371r.l().b();
        super.x();
    }
}
