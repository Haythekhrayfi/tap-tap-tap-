package com.applovin.exoplayer2.i.g;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f7022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f7025i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String[] f7026j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HashMap<String, Integer> f7027k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final HashMap<String, Integer> f7028l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<d> f7029m;

    private d(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, d dVar) {
        this.f7017a = str;
        this.f7018b = str2;
        this.f7024h = str4;
        this.f7022f = gVar;
        this.f7026j = strArr;
        this.f7019c = str2 != null;
        this.f7020d = j10;
        this.f7021e = j11;
        this.f7023g = (String) com.applovin.exoplayer2.l.a.b(str3);
        this.f7025i = dVar;
        this.f7027k = new HashMap<>();
        this.f7028l = new HashMap<>();
    }

    private static SpannableStringBuilder a(String str, Map<String, com.applovin.exoplayer2.i.a.C0095a> map) {
        if (!map.containsKey(str)) {
            com.applovin.exoplayer2.i.a.C0095a c0095a = new com.applovin.exoplayer2.i.a.C0095a();
            c0095a.a(new SpannableStringBuilder());
            map.put(str, c0095a);
        }
        return (SpannableStringBuilder) com.applovin.exoplayer2.l.a.b(map.get(str).a());
    }

    public static d a(String str) {
        return new d(null, f.a(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static d a(String str, long j10, long j11, g gVar, String[] strArr, String str2, String str3, d dVar) {
        return new d(str, null, j10, j11, gVar, strArr, str2, str3, dVar);
    }

    private void a(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f7023g)) {
            str = this.f7023g;
        }
        if (a(j10) && "div".equals(this.f7017a) && this.f7024h != null) {
            list.add(new Pair<>(str, this.f7024h));
            return;
        }
        for (int i10 = 0; i10 < a(); i10++) {
            a(i10).a(j10, str, list);
        }
    }

    private void a(long j10, Map<String, g> map, Map<String, e> map2, String str, Map<String, com.applovin.exoplayer2.i.a.C0095a> map3) {
        int i10;
        if (a(j10)) {
            String str2 = "".equals(this.f7023g) ? str : this.f7023g;
            Iterator<Map.Entry<String, Integer>> it = this.f7028l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f7027k.containsKey(key) ? this.f7027k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    a(map, (com.applovin.exoplayer2.i.a.C0095a) com.applovin.exoplayer2.l.a.b(map3.get(key)), iIntValue, iIntValue2, ((e) com.applovin.exoplayer2.l.a.b(map2.get(str2))).f7039j);
                }
            }
            for (i10 = 0; i10 < a(); i10++) {
                a(i10).a(j10, map, map2, str2, map3);
            }
        }
    }

    private void a(long j10, boolean z10, String str, Map<String, com.applovin.exoplayer2.i.a.C0095a> map) {
        this.f7027k.clear();
        this.f7028l.clear();
        if ("metadata".equals(this.f7017a)) {
            return;
        }
        if (!"".equals(this.f7023g)) {
            str = this.f7023g;
        }
        if (this.f7019c && z10) {
            a(str, map).append((CharSequence) com.applovin.exoplayer2.l.a.b(this.f7018b));
            return;
        }
        if ("br".equals(this.f7017a) && z10) {
            a(str, map).append('\n');
            return;
        }
        if (a(j10)) {
            for (Map.Entry<String, com.applovin.exoplayer2.i.a.C0095a> entry : map.entrySet()) {
                this.f7027k.put(entry.getKey(), Integer.valueOf(((CharSequence) com.applovin.exoplayer2.l.a.b(entry.getValue().a())).length()));
            }
            boolean zEquals = "p".equals(this.f7017a);
            for (int i10 = 0; i10 < a(); i10++) {
                a(i10).a(j10, z10 || zEquals, str, map);
            }
            if (zEquals) {
                f.a(a(str, map));
            }
            for (Map.Entry<String, com.applovin.exoplayer2.i.a.C0095a> entry2 : map.entrySet()) {
                this.f7028l.put(entry2.getKey(), Integer.valueOf(((CharSequence) com.applovin.exoplayer2.l.a.b(entry2.getValue().a())).length()));
            }
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    private void a(Map<String, g> map, com.applovin.exoplayer2.i.a.C0095a c0095a, int i10, int i11, int i12) {
        g gVarA = f.a(this.f7022f, this.f7026j, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c0095a.a();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c0095a.a(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (gVarA != null) {
            f.a(spannableStringBuilder2, i10, i11, gVarA, this.f7025i, map, i12);
            if ("p".equals(this.f7017a)) {
                if (gVarA.i() != Float.MAX_VALUE) {
                    c0095a.d((gVarA.i() * (-90.0f)) / 100.0f);
                }
                if (gVarA.m() != null) {
                    c0095a.a(gVarA.m());
                }
                if (gVarA.n() != null) {
                    c0095a.b(gVarA.n());
                }
            }
        }
    }

    private void a(TreeSet<Long> treeSet, boolean z10) {
        boolean zEquals = "p".equals(this.f7017a);
        boolean zEquals2 = "div".equals(this.f7017a);
        if (z10 || zEquals || (zEquals2 && this.f7024h != null)) {
            long j10 = this.f7020d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f7021e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f7029m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f7029m.size(); i10++) {
            this.f7029m.get(i10).a(treeSet, z10 || zEquals);
        }
    }

    public int a() {
        List<d> list = this.f7029m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public d a(int i10) {
        List<d> list = this.f7029m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public List<com.applovin.exoplayer2.i.a> a(long j10, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        ArrayList<Pair> arrayList = new ArrayList();
        a(j10, this.f7023g, arrayList);
        TreeMap treeMap = new TreeMap();
        a(j10, false, this.f7023g, (Map<String, com.applovin.exoplayer2.i.a.C0095a>) treeMap);
        a(j10, map, map2, this.f7023g, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) com.applovin.exoplayer2.l.a.b(map2.get(pair.first));
                arrayList2.add(new com.applovin.exoplayer2.i.a.C0095a().a(bitmapDecodeByteArray).a(eVar.f7031b).b(0).a(eVar.f7032c, 0).a(eVar.f7034e).b(eVar.f7035f).c(eVar.f7036g).d(eVar.f7039j).e());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) com.applovin.exoplayer2.l.a.b(map2.get(entry.getKey()));
            com.applovin.exoplayer2.i.a.C0095a c0095a = (com.applovin.exoplayer2.i.a.C0095a) entry.getValue();
            a((SpannableStringBuilder) com.applovin.exoplayer2.l.a.b(c0095a.a()));
            c0095a.a(eVar2.f7032c, eVar2.f7033d);
            c0095a.a(eVar2.f7034e);
            c0095a.a(eVar2.f7031b);
            c0095a.b(eVar2.f7035f);
            c0095a.b(eVar2.f7038i, eVar2.f7037h);
            c0095a.d(eVar2.f7039j);
            arrayList2.add(c0095a.e());
        }
        return arrayList2;
    }

    public void a(d dVar) {
        if (this.f7029m == null) {
            this.f7029m = new ArrayList();
        }
        this.f7029m.add(dVar);
    }

    public boolean a(long j10) {
        long j11 = this.f7020d;
        return (j11 == -9223372036854775807L && this.f7021e == -9223372036854775807L) || (j11 <= j10 && this.f7021e == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < this.f7021e) || (j11 <= j10 && j10 < this.f7021e));
    }

    public long[] b() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public String[] c() {
        return this.f7026j;
    }
}
