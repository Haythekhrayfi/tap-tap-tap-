package l1;

import android.database.Cursor;
import androidx.activity.j;
import ch.qos.logback.core.CoreConstants;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, a> f32103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<b> f32104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<C0333d> f32105d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f32106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f32107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f32108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f32109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f32110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f32111f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f32112g;

        @Deprecated
        public a(String str, String str2, boolean z10, int i10) {
            this(str, str2, z10, i10, null, 0);
        }

        public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            this.f32106a = str;
            this.f32107b = str2;
            this.f32109d = z10;
            this.f32110e = i10;
            int i12 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i12 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i12 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i12 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.f32108c = i12;
            this.f32111f = str3;
            this.f32112g = i11;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f32110e != aVar.f32110e || !this.f32106a.equals(aVar.f32106a) || this.f32109d != aVar.f32109d) {
                return false;
            }
            if (this.f32112g == 1 && aVar.f32112g == 2 && (str3 = this.f32111f) != null && !str3.equals(aVar.f32111f)) {
                return false;
            }
            if (this.f32112g == 2 && aVar.f32112g == 1 && (str2 = aVar.f32111f) != null && !str2.equals(this.f32111f)) {
                return false;
            }
            int i10 = this.f32112g;
            return (i10 == 0 || i10 != aVar.f32112g || ((str = this.f32111f) == null ? aVar.f32111f == null : str.equals(aVar.f32111f))) && this.f32108c == aVar.f32108c;
        }

        public int hashCode() {
            return (((((this.f32106a.hashCode() * 31) + this.f32108c) * 31) + (this.f32109d ? 1231 : 1237)) * 31) + this.f32110e;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Column{name='");
            l1.c.a(sbA, this.f32106a, CoreConstants.SINGLE_QUOTE_CHAR, ", type='");
            l1.c.a(sbA, this.f32107b, CoreConstants.SINGLE_QUOTE_CHAR, ", affinity='");
            sbA.append(this.f32108c);
            sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
            sbA.append(", notNull=");
            sbA.append(this.f32109d);
            sbA.append(", primaryKeyPosition=");
            sbA.append(this.f32110e);
            sbA.append(", defaultValue='");
            sbA.append(this.f32111f);
            sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
            sbA.append('}');
            return sbA.toString();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f32113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f32114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f32115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<String> f32116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<String> f32117e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f32113a = str;
            this.f32114b = str2;
            this.f32115c = str3;
            this.f32116d = Collections.unmodifiableList(list);
            this.f32117e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f32113a.equals(bVar.f32113a) && this.f32114b.equals(bVar.f32114b) && this.f32115c.equals(bVar.f32115c) && this.f32116d.equals(bVar.f32116d)) {
                return this.f32117e.equals(bVar.f32117e);
            }
            return false;
        }

        public int hashCode() {
            return this.f32117e.hashCode() + ((this.f32116d.hashCode() + e.a(this.f32115c, e.a(this.f32114b, this.f32113a.hashCode() * 31, 31), 31)) * 31);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("ForeignKey{referenceTable='");
            l1.c.a(sbA, this.f32113a, CoreConstants.SINGLE_QUOTE_CHAR, ", onDelete='");
            l1.c.a(sbA, this.f32114b, CoreConstants.SINGLE_QUOTE_CHAR, ", onUpdate='");
            l1.c.a(sbA, this.f32115c, CoreConstants.SINGLE_QUOTE_CHAR, ", columnNames=");
            sbA.append(this.f32116d);
            sbA.append(", referenceColumnNames=");
            return f.a(sbA, this.f32117e, '}');
        }
    }

    public static class c implements Comparable<c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f32118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f32119d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f32120e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f32121f;

        public c(int i10, int i11, String str, String str2) {
            this.f32118c = i10;
            this.f32119d = i11;
            this.f32120e = str;
            this.f32121f = str2;
        }

        @Override // java.lang.Comparable
        public int compareTo(c cVar) {
            c cVar2 = cVar;
            int i10 = this.f32118c - cVar2.f32118c;
            return i10 == 0 ? this.f32119d - cVar2.f32119d : i10;
        }
    }

    /* JADX INFO: renamed from: l1.d$d, reason: collision with other inner class name */
    public static class C0333d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f32122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f32123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<String> f32124c;

        public C0333d(String str, boolean z10, List<String> list) {
            this.f32122a = str;
            this.f32123b = z10;
            this.f32124c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0333d.class != obj.getClass()) {
                return false;
            }
            C0333d c0333d = (C0333d) obj;
            if (this.f32123b == c0333d.f32123b && this.f32124c.equals(c0333d.f32124c)) {
                return this.f32122a.startsWith("index_") ? c0333d.f32122a.startsWith("index_") : this.f32122a.equals(c0333d.f32122a);
            }
            return false;
        }

        public int hashCode() {
            return this.f32124c.hashCode() + ((((this.f32122a.startsWith("index_") ? -1184239155 : this.f32122a.hashCode()) * 31) + (this.f32123b ? 1 : 0)) * 31);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Index{name='");
            l1.c.a(sbA, this.f32122a, CoreConstants.SINGLE_QUOTE_CHAR, ", unique=");
            sbA.append(this.f32123b);
            sbA.append(", columns=");
            return f.a(sbA, this.f32124c, '}');
        }
    }

    public d(String str, Map<String, a> map, Set<b> set) {
        this(str, map, set, Collections.emptySet());
    }

    public d(String str, Map<String, a> map, Set<b> set, Set<C0333d> set2) {
        this.f32102a = str;
        this.f32103b = Collections.unmodifiableMap(map);
        this.f32104c = Collections.unmodifiableSet(set);
        this.f32105d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static d a(n1.b bVar, String str) {
        List<c> list;
        int i10;
        o1.a aVar = (o1.a) bVar;
        Cursor cursorB = aVar.b(j.a("PRAGMA table_info(`", str, "`)"));
        HashMap map = new HashMap();
        try {
            if (cursorB.getColumnCount() > 0) {
                int columnIndex = cursorB.getColumnIndex("name");
                int columnIndex2 = cursorB.getColumnIndex("type");
                int columnIndex3 = cursorB.getColumnIndex("notnull");
                int columnIndex4 = cursorB.getColumnIndex("pk");
                int columnIndex5 = cursorB.getColumnIndex("dflt_value");
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(columnIndex);
                    int i11 = columnIndex;
                    map.put(string, new a(string, cursorB.getString(columnIndex2), cursorB.getInt(columnIndex3) != 0, cursorB.getInt(columnIndex4), cursorB.getString(columnIndex5), 2));
                    columnIndex = i11;
                }
            }
            cursorB.close();
            HashSet hashSet = new HashSet();
            Cursor cursorB2 = aVar.b("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorB2.getColumnIndex(FacebookMediationAdapter.KEY_ID);
                int columnIndex7 = cursorB2.getColumnIndex("seq");
                int columnIndex8 = cursorB2.getColumnIndex("table");
                int columnIndex9 = cursorB2.getColumnIndex("on_delete");
                int columnIndex10 = cursorB2.getColumnIndex("on_update");
                List<c> listB = b(cursorB2);
                int count = cursorB2.getCount();
                int i12 = 0;
                while (i12 < count) {
                    cursorB2.moveToPosition(i12);
                    if (cursorB2.getInt(columnIndex7) != 0) {
                        list = listB;
                        i10 = count;
                    } else {
                        int i13 = cursorB2.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (c cVar : (ArrayList) listB) {
                            List<c> list2 = listB;
                            int i14 = count;
                            if (cVar.f32118c == i13) {
                                arrayList.add(cVar.f32120e);
                                arrayList2.add(cVar.f32121f);
                            }
                            listB = list2;
                            count = i14;
                        }
                        list = listB;
                        i10 = count;
                        hashSet.add(new b(cursorB2.getString(columnIndex8), cursorB2.getString(columnIndex9), cursorB2.getString(columnIndex10), arrayList, arrayList2));
                    }
                    i12++;
                    columnIndex6 = columnIndex6;
                    columnIndex7 = columnIndex7;
                    listB = list;
                    count = i10;
                }
                cursorB2.close();
                Cursor cursorB3 = aVar.b("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorB3.getColumnIndex("name");
                    int columnIndex12 = cursorB3.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
                    int columnIndex13 = cursorB3.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        cursorB3.close();
                        break;
                    }
                    HashSet hashSet3 = new HashSet();
                    while (true) {
                        if (!cursorB3.moveToNext()) {
                            cursorB3.close();
                            hashSet2 = hashSet3;
                            break;
                        }
                        if ("c".equals(cursorB3.getString(columnIndex12))) {
                            String string2 = cursorB3.getString(columnIndex11);
                            boolean z10 = true;
                            if (cursorB3.getInt(columnIndex13) != 1) {
                                z10 = false;
                            }
                            C0333d c0333dC = c(aVar, string2, z10);
                            if (c0333dC == null) {
                                cursorB3.close();
                                break;
                            }
                            hashSet3.add(c0333dC);
                        }
                    }
                    return new d(str, map, hashSet, hashSet2);
                } catch (Throwable th) {
                    cursorB3.close();
                    throw th;
                }
            } catch (Throwable th2) {
                cursorB2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            cursorB.close();
            throw th3;
        }
    }

    public static List<c> b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(FacebookMediationAdapter.KEY_ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static C0333d c(n1.b bVar, String str, boolean z10) {
        Cursor cursorB = ((o1.a) bVar).b(j.a("PRAGMA index_xinfo(`", str, "`)"));
        try {
            int columnIndex = cursorB.getColumnIndex("seqno");
            int columnIndex2 = cursorB.getColumnIndex("cid");
            int columnIndex3 = cursorB.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorB.moveToNext()) {
                    if (cursorB.getInt(columnIndex2) >= 0) {
                        int i10 = cursorB.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i10), cursorB.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new C0333d(str, z10, arrayList);
            }
            return null;
        } finally {
            cursorB.close();
        }
    }

    public boolean equals(Object obj) {
        Set<C0333d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f32102a;
        if (str == null ? dVar.f32102a != null : !str.equals(dVar.f32102a)) {
            return false;
        }
        Map<String, a> map = this.f32103b;
        if (map == null ? dVar.f32103b != null : !map.equals(dVar.f32103b)) {
            return false;
        }
        Set<b> set2 = this.f32104c;
        if (set2 == null ? dVar.f32104c != null : !set2.equals(dVar.f32104c)) {
            return false;
        }
        Set<C0333d> set3 = this.f32105d;
        if (set3 == null || (set = dVar.f32105d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f32102a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f32103b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f32104c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("TableInfo{name='");
        l1.c.a(sbA, this.f32102a, CoreConstants.SINGLE_QUOTE_CHAR, ", columns=");
        sbA.append(this.f32103b);
        sbA.append(", foreignKeys=");
        sbA.append(this.f32104c);
        sbA.append(", indices=");
        sbA.append(this.f32105d);
        sbA.append('}');
        return sbA.toString();
    }
}
